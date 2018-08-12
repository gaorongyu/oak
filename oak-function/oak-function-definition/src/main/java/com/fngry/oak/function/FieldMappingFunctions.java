package com.fngry.oak.function;

import com.fngry.oak.function.impl.mapping.DataSetFieldMappingFunction;
import com.fngry.oak.function.impl.mapping.DirectFieldMappingFunction;
import com.fngry.oak.function.impl.mapping.GroovyFieldMappingFunction;

public class FieldMappingFunctions extends FunctionRegistry<FieldMappingFunction> {

    public static FieldMappingFunctions INSTANCE = new FieldMappingFunctions();

    static {
        INSTANCE.load();

        INSTANCE.register(GroovyFieldMappingFunction.class);
        INSTANCE.register(DirectFieldMappingFunction.class);
        INSTANCE.register(DataSetFieldMappingFunction.class);
    }

    protected FieldMappingFunctions() {
        super(FieldMappingFunction.class);
    }

}
