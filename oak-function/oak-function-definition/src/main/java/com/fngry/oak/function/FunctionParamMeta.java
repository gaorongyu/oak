package com.fngry.oak.function;

import java.lang.reflect.Field;
import java.util.Optional;

public class FunctionParamMeta {

    private Field field;

    private String name;

    private FunctionParamType type;

    private String[] options;

    public static Optional<FunctionParamMeta> resolve(Field field) {
        FunctionParam annotation = field.getAnnotation(FunctionParam.class);
        if (annotation == null) {
            return Optional.empty();
        }

        FunctionParamMeta paramMeta = new FunctionParamMeta();
        paramMeta.field = field;
        paramMeta.name = annotation.name().isEmpty() ? field.getName() : annotation.name();
        paramMeta.type = annotation.type();
        paramMeta.options = annotation.options();

        return Optional.of(paramMeta);
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FunctionParamType getType() {
        return type;
    }

    public void setType(FunctionParamType type) {
        this.type = type;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}
