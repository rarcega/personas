package com.example.clases;

import com.example.interfaces.IIdentificable;
import com.example.interfaces.Internable;

public class Alumno extends Persona implements IIdentificable, Internable{

    public Alumno(String nombre) {
        super(nombre);
    }

    @Override
    public String dameNombre() {
        return "Alumno: " + super.nombre;
    }
    
    @Override
    public String dameIdentificacion() {
        Integer hcode = this.hashCode();
        return hcode.toString();
    }
}
