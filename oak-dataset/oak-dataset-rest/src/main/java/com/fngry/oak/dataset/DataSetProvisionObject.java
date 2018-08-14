package com.fngry.oak.dataset;

import java.util.Collection;

public class DataSetProvisionObject {

    private DataSetDefinitionObject definition;

    private Collection<DataSetObject> dataSets;

    public DataSetDefinitionObject getDefinition() {
        return definition;
    }

    public void setDefinition(DataSetDefinitionObject definition) {
        this.definition = definition;
    }

    public Collection<DataSetObject> getDataSets() {
        return dataSets;
    }

    public void setDataSets(Collection<DataSetObject> dataSets) {
        this.dataSets = dataSets;
    }

}
