package com.nickrocky.exception;

public class InvalidArgumentNumberException extends Exception{
    public InvalidArgumentNumberException(){
        super("An invalid number of arguments were passed for this particular function! Please ensure that the right number of values are being entered!");
    }
}
