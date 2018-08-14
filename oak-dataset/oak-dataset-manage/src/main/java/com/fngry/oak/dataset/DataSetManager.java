package com.fngry.oak.dataset;

import java.util.Collection;
import java.util.Date;

public interface DataSetManager {

    Class<? extends DataSetDefinitionCreation> getDefinitionCreationType(String type);

    Long define(String type, DataSetDefinitionCreation definition);

    boolean undefine(Long id);

    DataSetDefinition getDefinition(Long id);

    DataSetDefinition getDefinition(String namespace, String name);

    Collection<? extends DataSetDefinition> getDefinitions(String namespace);

    DataSet createDataSet(Long definitionId, DataSetCreation creation);

    boolean deleteDataSet(Long id);

    DataSetCollection getDatasets(Long definitionId);

    DataSetCollection getDataSets(Long definitionId, Date bizDate);

    DataSet getDataSet(Long id);

}
