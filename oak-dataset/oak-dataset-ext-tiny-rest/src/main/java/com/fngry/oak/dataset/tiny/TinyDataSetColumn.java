package com.fngry.oak.dataset.tiny;

public class TinyDataSetColumn {

    public enum Type {
        KEY,
        VALUE
    }

    private String name;

    private Type type;

    public TinyDataSetColumn(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
