package io.spring.ExceptionHandling;

public class CustomException extends Exception {
    public CustomException() {
        super("My own exception");
    }
}
