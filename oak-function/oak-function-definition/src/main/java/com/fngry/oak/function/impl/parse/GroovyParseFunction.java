package com.fngry.oak.function.impl.parse;

import com.fngry.oak.function.FieldParseFunction;
import com.fngry.oak.function.OakContext;
import com.fngry.oak.function.impl.GroovyFunction;

/**
 * parse field use groovy script
 * @param <T>
 * @param <R>
 *
 * @author gaorongyu
 */
public class GroovyParseFunction<T, R> extends GroovyFunction<T, R> implements FieldParseFunction<T, R> {

    @Override
    public R apply(OakContext context, String fieldName, T target) {
        return super.apply(context, target);
    }

}
