package com.example.atividadeclass.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class Globalexception {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>>
    handleIllegalArgumentException(IllegalArgumentException erro){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Map.of("Mensagem", erro.getMessage(),"Status","erro"));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>>
    handleRuntimeException(IllegalArgumentException erro){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Map.of("Mensagem", erro.getMessage(),"Status","erro"));
    }
}

