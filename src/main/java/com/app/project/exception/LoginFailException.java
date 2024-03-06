package com.app.project.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LoginFailException extends RuntimeException{
    public LoginFailException(String memsage) {super(memsage);}
}
