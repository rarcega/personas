package com.example.clases;

import com.example.interfaces.Externable;

public class Gerencia extends Persona implements Externable{

    public Gerencia(String nombre) {
        super(nombre);
    }

    @Override
    public String dameNombre() {
        return "Personal de gerencia: " + super.nombre;
    }
    
}
