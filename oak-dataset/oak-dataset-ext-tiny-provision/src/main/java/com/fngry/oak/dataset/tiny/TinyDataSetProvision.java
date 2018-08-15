package com.fngry.oak.dataset.tiny;

import com.fngry.oak.dataset.DataSetObject;
import com.fngry.oak.dataset.provision.DataSetProvision;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

public class TinyDataSetProvision implements DataSetProvision {

    private final TinyDataSetDefinitionObject definition;

    private final Collection<DataSetObject> dataSets;

    public TinyDataSetProvision(TinyDataSetDefinitionObject definition, Collection<DataSetObject> dataSets) {
        this.definition = definition;
        this.dataSets = dataSets;
    }



    @Override
    public Map<String, Object> retrive(Function<String, Object> keyProvider) throws Exception {
        return null;
    }
}
