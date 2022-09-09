package com.rmit.sept.itemmanagement.exception;

import lombok.Getter;

public class ItemIdException extends RuntimeException {

    private  static final long serialVersionUID = 23134514;

    @Getter
    private String value;

    public ItemIdException(String message, String value) {
        super(message);
        this.value = value;
    }
}
