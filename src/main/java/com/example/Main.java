package com.example;

import com.example.clases.Alumno;
import com.example.clases.CentroFormacion;
import com.example.clases.Gerencia;
import com.example.clases.Limpieza;
import com.example.clases.Profesor;
import com.example.clases.Seguridad;

public class Main {
    public static void main(String[] args) {
        CentroFormacion centro = new CentroFormacion();

        centro.put(new Alumno("Ricardo"));
        centro.put(new Alumno("Pepito"));
        centro.put(new Alumno("Joaquin"));
        centro.put(new Alumno("Enrique"));
        centro.put(new Profesor("Jacinto",10,25));
        centro.put(new Profesor("Sandra",1,3));
        centro.put(new Seguridad("Jose Luis",50));
        centro.put(new Limpieza("María",4));
        centro.put(new Limpieza("Amparo",2));
        centro.put(new Gerencia("Marcos"));
    
        System.out.println("Las personas que trabajan en el centro son: "+centro.numeroPersonas());

        // Nombres de las personas
        centro.nombresPersonas();

        // Mostrar el coste total del centro
        System.out.println("El coste total del centro es: " + centro.costeTotal() + " euros");

        // Cuantas personas necesitan identificacion
        System.out.println("Personas que necesitan identificacion:"+centro.personasConIdentificacion());

        // Mostrar nombre y coste de las personas externas
        centro.mostrarPersonasExternasNombreYCoste();
    }

    
    
}