package com.fngry.oak.function.controller;

import com.fngry.oak.function.FunctionParamMeta;
import com.fngry.oak.function.FunctionParamMetaObject;

import java.util.Collection;
import java.util.stream.Collectors;

public class FunctionParamMetaObjects {

    public static Collection<FunctionParamMetaObject> apply(Collection<FunctionParamMeta> functionMetas) {
        return functionMetas.stream().map(FunctionParamMetaObjects::apply).collect(Collectors.toList());
    }

    public static FunctionParamMetaObject apply(FunctionParamMeta functionMeta) {
        FunctionParamMetaObject meta = new FunctionParamMetaObject();

        return meta;
    }

}
