package yte.intern.springweb;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public java.util.List<String> handler(MethodArgumentNotValidException exception){
        return exception.getFieldErrors()
        .stream ()
        .map(error -> error.getDefaultMessage())
        .toList();  }

    
}
