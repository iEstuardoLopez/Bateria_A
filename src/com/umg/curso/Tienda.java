package com.umg.curso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */
public class Tienda {
    private String nombreGerente;
    private String direccion;
    private int anio;
    private static ArrayList<Mascota> mascotas = new ArrayList<>();

    public Tienda(String nombreGerente) {
        this.nombreGerente = nombreGerente;
        mascotas = new ArrayList<Mascota>();
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void addMascota(Mascota m){ mascotas.add(m); }

    public ArrayList<Mascota> getMascotas(){ return mascotas; }

    public int getSumaEdades(){
        int suma = 0;
        for(int i = 0; i<mascotas.size();i++){
            suma += ((Mascota) mascotas.get(i)).getEdad();
        }
        return suma;
    }


}
