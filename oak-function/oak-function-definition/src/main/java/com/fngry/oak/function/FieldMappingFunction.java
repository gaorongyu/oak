package com.fngry.oak.function;

import java.io.Serializable;

/**
 * field mapping function
 * @param <T>
 * @author gaorongyu
 */
public interface FieldMappingFunction<T> extends Serializable {

    Object apply(OakContext context, String fieldName, T target) throws Exception;

}
