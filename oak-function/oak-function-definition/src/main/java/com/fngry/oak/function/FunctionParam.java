package com.fngry.oak.function;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FunctionParam {

    String name() default "";

    FunctionParamType type();

    String[] options() default{};

}
