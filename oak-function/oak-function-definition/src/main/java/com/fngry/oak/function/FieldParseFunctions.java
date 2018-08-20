package com.fngry.oak.function;

import com.fngry.oak.function.impl.parse.GroovyParseFunction;
import com.fngry.oak.function.impl.parse.JsonParseFunction;

public class FieldParseFunctions extends FunctionRegistry<FieldParseFunction> {

    public static FieldParseFunctions INSTANCE = new FieldParseFunctions();

    static {
        INSTANCE.load();

        INSTANCE.register(GroovyParseFunction.class);
        INSTANCE.register(JsonParseFunction.class);
    }

    protected FieldParseFunctions() {
        super(FieldParseFunction.class);
    }

}
