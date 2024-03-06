package com.app.project.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PostNotExistException extends RuntimeException{
    public PostNotExistException(String mesage) {super(mesage);}
}
