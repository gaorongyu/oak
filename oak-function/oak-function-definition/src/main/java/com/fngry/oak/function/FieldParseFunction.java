package com.fngry.oak.function;

public interface FieldParseFunction<T, R> {

    R apply(OakContext context, String fieldName, T target);

}
