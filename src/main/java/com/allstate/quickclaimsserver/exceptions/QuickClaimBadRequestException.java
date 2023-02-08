package com.allstate.quickclaimsserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class QuickClaimBadRequestException extends Exception{

        public QuickClaimBadRequestException(String message){
            super(message);

        }
}
