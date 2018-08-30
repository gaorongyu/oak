package com.fngry.oak.function.impl.mapping;

import com.fngry.oak.function.FieldMappingFunction;
import com.fngry.oak.function.FunctionParam;
import com.fngry.oak.function.FunctionParamType;
import com.fngry.oak.function.OakContext;

public class ConstantFieldMappingFunction<T> implements FieldMappingFunction<T> {

    @FunctionParam(type = FunctionParamType.ANY)
    private Object value;

    @Override
    public Object apply(OakContext context, String fieldName, T target) {
        return this.value;
    }

}
