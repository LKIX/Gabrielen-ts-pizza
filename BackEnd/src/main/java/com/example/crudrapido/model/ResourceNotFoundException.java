package com.example.crudrapido.model;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionID=1L;
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
