package com.fngry.oak.function;

public class FunctionException extends RuntimeException {

    public FunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionException(String message) {
        super(message);
    }

}
