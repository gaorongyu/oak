package com.fngry.oak.function.impl.mapping;

import com.fngry.oak.function.*;
import com.fngry.oak.function.impl.FunctionSupport;

public class DataSetFieldMappingFunction<T extends OakDataObject> implements FieldMappingFunction<T> {

    private static final long serialVersionUID = 228402724558461673L;

    @FunctionParam(name = "datsSetName", type = FunctionParamType.STRING)
    private String dataSetName;

    @Override
    public Object apply(OakContext context, String fieldName, T target) throws Exception {
        OakDataSet dataSet = context.getDataSet(dataSetName);
        String keyDigest = FunctionSupport.digest(dataSet.getKeys(), target);
        return dataSet.retrive(keyDigest);
    }

}
