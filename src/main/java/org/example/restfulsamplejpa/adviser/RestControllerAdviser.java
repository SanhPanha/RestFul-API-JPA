package org.example.restfulsamplejpa.adviser;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class RestControllerAdviser {
    @ResponseStatus(HttpStatus.BAD_REQUEST)

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public HashMap<String, Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException exception
    ){
        List<HashMap<String, Object>> errors =
        exception.getBindingResult()
                .getFieldErrors()
                .stream().map(err->{
                    HashMap<String, Object> error = new HashMap<>();
                    error.put(err.getField(), err.getDefaultMessage());
                    return error;
                }).toList();
        HashMap<String, Object> errorMessages = new HashMap<>();
        errorMessages.put("message", errors);
        return errorMessages;
    }
}
