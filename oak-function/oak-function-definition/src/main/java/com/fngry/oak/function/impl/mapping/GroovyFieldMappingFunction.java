package com.fngry.oak.function.impl.mapping;

import com.fngry.oak.function.OakContext;
import com.fngry.oak.function.FieldMappingFunction;
import com.fngry.oak.function.impl.GroovyFunction;

/**
 * mapping field by groovy script
 * @param <T>
 * @author gaorongyu
 */
public class GroovyFieldMappingFunction<T> extends GroovyFunction<T, Object> implements FieldMappingFunction<T> {

    private static final long serialVersionUID = 3356690917189618717L;

    @Override
    public Object apply(OakContext context, String fieldName, T target) throws Exception {
        return super.apply(context, target);
    }

}
