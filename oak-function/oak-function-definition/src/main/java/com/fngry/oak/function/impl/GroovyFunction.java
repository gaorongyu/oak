package com.fngry.oak.function.impl;

import com.fngry.oak.function.OakContext;
import com.fngry.oak.function.FunctionParam;
import com.fngry.oak.function.FunctionParamType;
import com.fngry.oak.function.util.Loader;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.codehaus.groovy.runtime.InvokerHelper;

import java.util.HashMap;
import java.util.Map;

public class GroovyFunction<T, R> {

    private static final GroovyShell GROOVY_SHELL = new GroovyShell();

    private static final Map<String, Class<?>> ASSISTANTS = new HashMap<>();

    static {
        // load util
        Loader.load(GroovyFunction.class.getName() + "Util", e -> ASSISTANTS.put(e.getSimpleName(), e));

    }

    private Script script;

    @FunctionParam(name = "GroovyScript Expression", type = FunctionParamType.SCRIPT)
    private String expression;

    public R apply(OakContext context, T target) {
        return execute(context, target);
    }

    private Script script() {
        if(this.script != null) {
            return script;
        }

        this.script = GROOVY_SHELL.parse(this.expression);
        return this.script;
    }

    public <T, R> R execute(OakContext context, T target) {
        Map<String, Object> map = new HashMap<>();
        map.put("target", target);
        map.put("context", context);

        Binding binding = new Binding(map);

        Script targetScript;
        try {
            targetScript = InvokerHelper.createScript(script().getClass(), binding);
        } catch (Exception e) {
            throw new RuntimeException(String.format("fail to create groovy script: %s", expression));
        }

        return (R) targetScript.run();
    }


}
