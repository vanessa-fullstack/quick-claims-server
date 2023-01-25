package com.allstate.quickclaimsserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class QuickClaimNotFoundException extends Exception{

    public QuickClaimNotFoundException(String message){
        super(message);

    }
}
