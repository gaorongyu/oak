package com.fngry.oak.dataset.impl;

import com.fngry.oak.dataset.DataSetCreation;
import com.fngry.oak.dataset.dataobject.DataSetDO;
import com.fngry.oak.dataset.dataobject.DataSetDefinitionDO;

public class DataSets {

    public static DataSetDO apply(DataSetDefinitionDO dataSetDefinitionDO, DataSetCreation dataSetCreation,
            String user) {
        DataSetDO dataSetDO = new DataSetDO();

        dataSetDO.setDefinitionId(dataSetDefinitionDO.getId());
        dataSetDO.setCreator(user);
        dataSetDO.setNamespace(dataSetDefinitionDO.getNamespace());
        dataSetDO.setEffectiveDateBegin(dataSetCreation.getEffectiveDateBegin());
        dataSetDO.setEffectiveDateEnd(dataSetCreation.getEffectiveDateEnd());

        return dataSetDO;
    }

}
