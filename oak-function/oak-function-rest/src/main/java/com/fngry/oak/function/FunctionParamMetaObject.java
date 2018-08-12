package com.fngry.oak.function;

public class FunctionParamMetaObject {

    private boolean required;

    private String name;

    private FunctionParamType type;

    private String[] options;

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
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
