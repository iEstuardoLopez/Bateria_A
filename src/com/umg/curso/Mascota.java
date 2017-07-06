package com.umg.curso;

/**
 * Created by alumno on 5/07/2017.
 */
public class Mascota {
    private String nombreAnimal;
    private String tipoAnimal;
    private String raza;
    private int edad;

    public Mascota(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { this.edad = edad; }
}
