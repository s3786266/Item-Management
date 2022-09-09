package com.rmit.sept.itemmanagement.exception;
import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorModel {

    private HttpStatus errorId;
    private String errorDetails;

    public ErrorModel(HttpStatus errorId, String errorDetails) {
        this.errorId = errorId;
        this.errorDetails = errorDetails;
    }
}