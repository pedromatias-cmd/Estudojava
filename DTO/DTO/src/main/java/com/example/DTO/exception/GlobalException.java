package com.example.DTO.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.Objects;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>>illegalException(IllegalArgumentException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of("mensagem",erro.getMessage(),
                        "sucesso","false"));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>>methodArgumentNotValidException(MethodArgumentNotValidException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of("mensagem",erro.getFieldErrors().get(0).getDefaultMessage(),
                        "sucesso","false"));
    }
}
