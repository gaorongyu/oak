package com.fngry.oak.function;

import com.fngry.oak.function.util.Loader;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionRegistry<T> {

    private final Class<T> type;

    private Map<String, Entry<T>> entries = new HashMap<>();

    public FunctionRegistry(Class<T> clazz) {
        type = clazz;
    }

    public void load() {
        Loader.load(type, this::register);
    }

    public void register(Class<? extends T> clazz) {
        Entry<T> entry = Entry.create(clazz);
        entries.put(entry.meta.clazz(), entry);
    }

    public void register(T instance) {
        Entry<T> entry = Entry.create(instance);
        entries.put(entry.meta.clazz(), entry);
    }

    public Collection<FunctionMeta> getFunctionMetas() {
        return entries.values().stream().map(Entry::meta).collect(Collectors.toList());
    }


    private static class Entry<T> {

        FunctionMeta<T> meta;

        T instance;

        public static <T> Entry<T> create(Class<? extends T> clazz) {
            Entry<T> entry = new Entry<>();
            entry.meta = FunctionMeta.resolve(clazz);
            return entry;
        }

        public static <T> Entry<T> create(T instance) {
            Entry<T> entry = create((Class<? extends T>) instance.getClass());
            entry.instance = instance;
            return entry;
        }

        public T newInstance(Map<String, Object> params) throws Exception {
            T instance = meta.getType().newInstance();

            for (FunctionParamMeta paramMeta : meta.getParamMetas()) {
                field(paramMeta, instance, params);
            }

            return instance;
        }

        public FunctionMeta meta() {
            return meta;
        }

        private static void field(FunctionParamMeta paramMeta, Object instance, Map<String, Object> params)
                throws IllegalAccessException {
            Object value = params.get(paramMeta.getName());
            paramMeta.getField().set(instance, value);
        }

    }

}
