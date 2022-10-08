package com.rishi.app.exceptions;

public class WrongValueException extends RuntimeException {
    public WrongValueException(final String message) {
        super(message);
    }
}
