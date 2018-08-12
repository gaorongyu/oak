package com.fngry.oak.function.impl.mapping;


import com.fngry.oak.function.*;

/**
 * source object field direct mapping to target field
 * @param <T>
 */
public class DirectFieldMappingFunction<T extends OakDataObject> implements FieldMappingFunction<T> {

    private static final long serialVersionUID = -2761286871713176165L;

    @FunctionParam(name = "source object fieldName", type = FunctionParamType.STRING)
    private String field;

    @Override
    public Object apply(OakContext context, String fieldName, T target) throws Exception {
        return target.get(field);
    }

}
