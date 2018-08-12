package com.fngry.oak.function.controller;

import com.fngry.oak.function.FunctionMeta;
import com.fngry.oak.function.FunctionMetaObject;

import java.util.Collection;
import java.util.stream.Collectors;

public class FunctionMetaObjects {

    public static Collection<FunctionMetaObject> apply(Collection<FunctionMeta> functionMetas) {
        return functionMetas.stream().map(FunctionMetaObjects::apply).collect(Collectors.toList());
    }

    public static FunctionMetaObject apply(FunctionMeta functionMeta) {
        FunctionMetaObject meta = new FunctionMetaObject();
        meta.setType(functionMeta.getType());
        meta.setParamMetas(functionMeta.getParamMetas());

        return meta;
    }

}
