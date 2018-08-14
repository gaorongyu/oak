package com.fngry.oak.dataset.spi;

import com.fngry.oak.dataset.DataSet;
import com.fngry.oak.dataset.DataSetCollection;
import com.fngry.oak.dataset.DataSetDefinitionCreation;
import com.fngry.oak.dataset.DataSetDefinitionObject;
import com.fngry.oak.dataset.dataobject.DataSetDO;
import com.fngry.oak.dataset.dataobject.DataSetDefinitionDO;

import java.util.Collection;

public interface DataSetDefinitionExt<C extends DataSetDefinitionCreation,
        D extends DataSetDefinitionObject, S extends DataSet> {

    Class<C> getDefinitionCreationType();

    String getType();

    void create(Long definitionId, C creation);

    void delete(Long definitionId);

    D assembleDefinition(DataSetDefinitionDO dataSetDefinitionDO);

    S assembleDataSet(DataSetDO dataSetDO, DataSetAccessControl control);

    DataSetCollection assembleDataSets(DataSetDefinitionDO dataSetDefinitionDO,
            Collection<DataSetDO> dataSets, DataSetAccessControl control);

    void deleteDataSet(DataSetDO dataSetDO);

}
