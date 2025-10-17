package com.example.DTO1.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.management.RuntimeErrorException;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> IllegalArgumentsException(IllegalArgumentException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of(
                        "messagem", erro.getMessage(),
                        "sucesso", false
                ));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>>MethodArgumentNotValidException(MethodArgumentNotValidException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of(
                        "messagem", erro.getFieldErrors().get(0).getDefaultMessage(),
                        "sucesso", false
                ));
    }

    @ExceptionHandler(RuntimeErrorException.class)
    public ResponseEntity<Map<String, Object>>RuntimeErrorException(RuntimeErrorException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of(
                        "messagem", erro.getMessage(),
                        "sucesso", false
                ));
    }

}
