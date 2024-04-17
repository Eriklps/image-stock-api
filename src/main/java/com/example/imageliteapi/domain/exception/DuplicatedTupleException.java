package com.example.imageliteapi.domain.exception;

public class DuplicatedTupleException extends RuntimeException{
    public DuplicatedTupleException(String message) {
        super(message);
    }
}