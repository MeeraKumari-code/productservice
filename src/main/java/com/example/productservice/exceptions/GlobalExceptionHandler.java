package com.example.productservice.exceptions;

import com.example.productservice.dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundException notFoundException){
        return  new ResponseEntity<>(new ExceptionDto(HttpStatus.NOT_FOUND,
                notFoundException.getMessage()),HttpStatus.NOT_FOUND);
    }
}
