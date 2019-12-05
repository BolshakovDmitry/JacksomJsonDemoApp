package org.bolshakov;

public class StudentNotFoundExcrption extends RuntimeException {
    public StudentNotFoundExcrption(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundExcrption(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundExcrption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public StudentNotFoundExcrption(String s) {
    }
}
