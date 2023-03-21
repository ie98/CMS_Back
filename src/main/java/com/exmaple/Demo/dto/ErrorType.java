package com.exmaple.Demo.dto;

public enum ErrorType {
    UNKNOWN_ACCOUNT("Unknown account"),
    INCORRECT_CREDENTIALS("Incorrect credentials"),
    LOCKED_ACCOUNT("Locked account"),
    EXCESSIVE_ATTEMPTS("Excessive attempts");

    private String message;

    ErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}