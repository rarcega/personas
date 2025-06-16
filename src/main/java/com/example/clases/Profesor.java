package com.example.clases;

import com.example.interfaces.Externable;
import com.example.interfaces.IGastable;

public class Profesor extends Persona implements IGastable, Externable{

    private Integer experiencia;
    private Integer gasto;

    public Profesor(String nombre, Integer experiencia, Integer gasto) {
        super(nombre);
        this.experiencia = experiencia;
        this.gasto = gasto;
    }

    @Override
    public String dameNombre() {
        return "Profesor: " + super.nombre;
    }

    public Integer dameExperiencia(){
        return experiencia;
    }

    @Override
    public Integer dameGasto() {
        return this.gasto;
    }

    
}
