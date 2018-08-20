package com.fngry.oak.function.impl.parse;

import com.alibaba.fastjson.JSON;
import com.fngry.oak.function.FieldParseFunction;
import com.fngry.oak.function.FunctionException;
import com.fngry.oak.function.OakContext;

/**
 * parse json string field use JSON util
 * @author gaorongyu
 */
public class JsonParseFunction<T, R> implements FieldParseFunction<T, R> {

    @Override
    public R apply(OakContext context, String fieldName, T target) {
        if (target == null) {
            return null;
        }

        Class clazz = target.getClass();
        if (clazz.equals(String.class)) {
            return (R) JSON.parseObject((String) target);
        } else if (clazz.equals(byte[].class)) {
            return (R) JSON.parse((byte[]) target);
        } else {
            throw new FunctionException("unsupport type: " + clazz.getName());
        }
    }

}
