package com.fngry.oak.function;

import java.io.Serializable;

public interface FilterFunction<T> extends Serializable {

    Boolean apply(OakContext context, T target);

}
