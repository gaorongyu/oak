package com.fngry.oak.function;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionMeta<T> {

    private final Class<? extends T> type;

    private Collection<FunctionParamMeta> paramMetas;

    private FunctionMeta(Class<? extends T> clazz) {
        type = clazz;
    }

    public static <T> FunctionMeta<T> resolve(Class<? extends T> type) {
        FunctionMeta<T> functionMeta = new FunctionMeta<>(type);

        Class<?> clazz = type;
        while (clazz != Object.class) {
            Collection<FunctionParamMeta> paramMetas = resolveParamMeta(clazz);
            if (functionMeta.paramMetas == null) {
                functionMeta.paramMetas = paramMetas;
            } else {
                functionMeta.paramMetas.addAll(paramMetas);
            }
            clazz = clazz.getSuperclass();
        }

        return functionMeta;
    }

    private static Collection<FunctionParamMeta> resolveParamMeta(Class<?> clazz) {
        return Arrays.stream(clazz.getDeclaredFields())
                .map(FunctionParamMeta::resolve)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    public String clazz() {
        return this.type.getSimpleName();
    }

    public Class<? extends T> getType() {
        return type;
    }

    public Collection<FunctionParamMeta> getParamMetas() {
        return paramMetas;
    }

}
