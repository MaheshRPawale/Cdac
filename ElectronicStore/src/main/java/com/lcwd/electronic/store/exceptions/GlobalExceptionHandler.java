package com.lcwd.electronic.store.exceptions;

import com.lcwd.electronic.store.dtos.ApiResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

// handler resource not found
  private Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

// exception handle krnya sati ha block of code write karava lagto

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponseMessage> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
        logger.info("Exception Handler Invoke!!");
      ApiResponseMessage  response=ApiResponseMessage.builder().message(ex.getMessage()).status(HttpStatus.NOT_FOUND).success(true).build();
      return  new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }

    //MethodArgumentNotValidException
    // konti hi field data chukicha takla tr ha brobr message deto

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,Object>> handleMethodNotValidException(MethodArgumentNotValidException ex){

        List<ObjectError> allErrors=ex.getBindingResult().getAllErrors();
        // all error aahe yat te map madhe stroe kel aahe

        Map<String,Object> response=new HashMap<>();
        allErrors.stream().forEach(objectError -> {  // he traverse krty ani allerrror he foreach madhe print krin tr user ni wrong input dill tr

            String message =objectError.getDefaultMessage();
            String field = ((FieldError) objectError).getField();

            response.put(field,message);
        });
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
// Handle BAD API exception
    @ExceptionHandler(BadApiRequest.class)
    public ResponseEntity<ApiResponseMessage> resourceNotFoundExceptionHandler(BadApiRequest ex){
        logger.info("Bad Api Request !!");
        ApiResponseMessage  response=ApiResponseMessage.builder().message(ex.getMessage()).status(HttpStatus.BAD_REQUEST).success(false).build();
        return  new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }


}
