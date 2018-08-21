package com.fngry.oak.dataset;

public class DataSetException extends RuntimeException {

    public DataSetException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataSetException(String message) {
        super(message);
    }

}
