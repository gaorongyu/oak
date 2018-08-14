package com.fngry.oak.dataset;

import java.util.Collection;

public class DataSetCollection {

    private DataSetDefinition dataSetDefinition;

    private Collection<? extends DataSet> dataSets;

    public DataSetDefinition getDataSetDefinition() {
        return dataSetDefinition;
    }

    public void setDataSetDefinition(DataSetDefinition dataSetDefinition) {
        this.dataSetDefinition = dataSetDefinition;
    }

    public Collection<? extends DataSet> getDataSets() {
        return dataSets;
    }

    public void setDataSets(Collection<? extends DataSet> dataSets) {
        this.dataSets = dataSets;
    }
}
