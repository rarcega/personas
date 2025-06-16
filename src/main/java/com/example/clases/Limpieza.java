package com.example.clases;

import com.example.interfaces.Externable;
import com.example.interfaces.IGastable;

public class Limpieza extends Persona implements IGastable, Externable {

    private Integer gasto;

    public Limpieza(String nombre, Integer gasto) {
        super(nombre);
        this.gasto = gasto;
    }

    @Override
    public String dameNombre() {
        return "Personal de limpieza: " + super.nombre;
    }

    @Override
    public Integer dameGasto() {
        return this.gasto;
    }
    
}
