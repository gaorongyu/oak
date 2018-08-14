package com.fngry.oak.function;

/**
 * validation function util
 * @author gaorongyu
 */
public class ValidationFunctions extends FunctionRegistry<ValidationFunction> {

    private static final ValidationFunctions INSTANCE = new ValidationFunctions();

    static {
        INSTANCE.load();

        INSTANCE.register(ValidationFunction.class);
    }

    protected ValidationFunctions() {
        super(ValidationFunction.class);
    }

}
