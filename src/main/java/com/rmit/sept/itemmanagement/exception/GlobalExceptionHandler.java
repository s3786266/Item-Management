package com.rmit.sept.itemmanagement.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorModel> handleMethodArgumentNotValid(IllegalArgumentException exception, HttpServletRequest request) {

        ErrorModel error = new ErrorModel(HttpStatus.BAD_REQUEST, "Request has failed due to invalid method argument, please check your json response body");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ItemIdException.class)
    public ResponseEntity<ErrorModel> handleInvalidItemId(ItemIdException exception, HttpServletRequest request) {

        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, "Request has failed due to invalid item id, item was not found in the database");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorModel> handleServerIssue(Exception exception, HttpServletRequest request) {

        ErrorModel error = new ErrorModel(HttpStatus.INTERNAL_SERVER_ERROR, "Request has failed due to server issue, please reach out to admin");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
