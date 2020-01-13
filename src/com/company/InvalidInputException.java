package com.company;

class InvalidInputException extends Exception {
    String message;
    InvalidInputException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
