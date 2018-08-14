package com.fngry.oak.dataset.impl;

import com.fngry.oak.dataset.*;
import com.fngry.oak.dataset.spi.DataSetDefinitionExt;

import java.util.Collection;
import java.util.Date;

public class DataSetManagerImpl implements DataSetManager {

    // dataSetDAO, dataSetDefinitionDAO

    /**
     * load extensions from ioc, execute extensions
     */
    private Collection<DataSetDefinitionExt> extensions;

    @Override
    public Class<? extends DataSetDefinitionCreation> getDefinitionCreationType(String type) {
        return getExtension(type).getDefinitionCreationType();
    }

    @Override
    public Long define(String type, DataSetDefinitionCreation definition) {
        return null;
    }

    @Override
    public boolean undefine(Long id) {
        return false;
    }

    @Override
    public DataSetDefinition getDefinition(Long id) {
        return null;
    }

    @Override
    public DataSetDefinition getDefinition(String namespace, String name) {
        return null;
    }

    @Override
    public Collection<? extends DataSetDefinition> getDefinitions(String namespace) {
        return null;
    }

    @Override
    public DataSet createDataSet(Long definitionId, DataSetCreation creation) {
        return null;
    }

    @Override
    public boolean deleteDataSet(Long id) {
        return false;
    }

    @Override
    public DataSetCollection getDatasets(Long definitionId) {
        return null;
    }

    @Override
    public DataSetCollection getDataSets(Long definitionId, Date bizDate) {
        return null;
    }

    @Override
    public DataSet getDataSet(Long id) {
        return null;
    }

    private DataSetDefinitionExt getExtension(String type) {
        return extensions.stream()
                .filter(e -> e.getType().equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("dataSet type not support: " + type));
    }

}
