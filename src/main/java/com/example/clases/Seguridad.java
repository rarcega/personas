package com.example.clases;

import com.example.interfaces.IGastable;
import com.example.interfaces.IIdentificable;
import com.example.interfaces.Internable;

public class Seguridad extends Persona implements IGastable, Internable, IIdentificable{

    private Integer gasto;

    public Seguridad(String nombre, Integer gasto) {
        super(nombre);
        this.gasto = gasto;
    }

    @Override
    public String dameNombre() {
        return "Personal de seguridad: " + super.nombre;
    }
    
    @Override
    public Integer dameGasto() {
        return this.gasto;
    }

    @Override
    public String dameIdentificacion() {
        Integer hcode = this.hashCode();
        return hcode.toString();
    }
}
