package com.fngry.oak.function;

import com.fngry.oak.function.impl.filter.GroovyFilterFunction;

public class FilterFunctions extends FunctionRegistry<FilterFunction> {

    public static FilterFunctions INSTANCE = new FilterFunctions();

    static {
        INSTANCE.load();

        INSTANCE.register(GroovyFilterFunction.class);
    }

    private FilterFunctions() {
        super(FilterFunction.class);
    }

}
