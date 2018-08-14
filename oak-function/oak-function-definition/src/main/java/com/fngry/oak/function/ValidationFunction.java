package com.fngry.oak.function;

public interface ValidationFunction<T> {

    /**
     *
     * @param context
     * @param target
     * @return true id pass validate
     */
    Boolean apply(OakContext context, T target);

}
