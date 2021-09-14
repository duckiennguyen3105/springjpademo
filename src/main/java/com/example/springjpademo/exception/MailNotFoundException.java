package com.example.springjpademo.exception;

public class MailNotFoundException extends RuntimeException{
    public MailNotFoundException(String message) {
        super(message);
    }
}
