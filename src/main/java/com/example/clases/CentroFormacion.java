package com.example.clases;

import java.util.HashMap;
import java.util.HashSet;

import com.example.interfaces.Externable;
import com.example.interfaces.IGastable;
import com.example.interfaces.IIdentificable;

public class CentroFormacion {
    private HashMap<String, Persona> personas = new HashMap<String,Persona>();

    public void put(Persona persona)
    {

        personas.put(persona.dameNombre(),persona);
    }

    public Integer numeroPersonas(){
        return personas.size();
    }

    public void nombresPersonas()
    {
         personas.forEach((nombre, persona) -> 
            System.out.println(nombre + " - " + persona.getClass().getSimpleName()));    
    }

    public Integer costeTotal() {
        Integer total = 0;
        for (Persona persona : personas.values()) {
            if (persona instanceof IGastable) {
                total += ((IGastable) persona).dameGasto();
            }
        }
        return total;
    }

    public Integer personasConIdentificacion() {
        Integer total = 0;
        for (Persona persona : personas.values()) {
            if (persona instanceof IIdentificable) {
                total++;
            }
        }
        return total;
    }

    public void mostrarPersonasExternasNombreYCoste() {
        for (Persona persona : personas.values()) {
            if (persona instanceof Externable){
                System.out.println(persona.dameNombre() + " - " + ((IGastable) persona).dameGasto() + " euros");
            }
        }
    }
}
