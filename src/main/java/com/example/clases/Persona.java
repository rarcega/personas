package com.example.clases;

public abstract class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public abstract String dameNombre();
    
}
