package com.fincas.proyectofincas.exception;

public class NoEncontradoException extends RuntimeException{
    public NoEncontradoException(){
        super("recursos no encontrado");
    }

}
