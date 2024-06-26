package br.gymhelper.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFindException extends RuntimeException{

    public ResourceNotFindException(String message){
        super(message);
    }
}
