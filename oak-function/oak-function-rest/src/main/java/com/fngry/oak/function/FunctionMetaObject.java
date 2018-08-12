package com.fngry.oak.function;

import java.util.Collection;

public class FunctionMetaObject {

    private Class type;

    private Collection<FunctionParamMetaObject> paramMetas;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Collection<FunctionParamMetaObject> getParamMetas() {
        return paramMetas;
    }

    public void setParamMetas(Collection<FunctionParamMetaObject> paramMetas) {
        this.paramMetas = paramMetas;
    }
    
}
