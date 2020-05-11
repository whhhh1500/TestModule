package com.cc1500.common.Exceptions;

public class NotPassException extends RuntimeException{
    public NotPassException() {
        super();
    }

    public NotPassException(String message) {
        super(message);
    }

    public NotPassException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPassException(Throwable cause) {
        super(cause);
    }

    protected NotPassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
