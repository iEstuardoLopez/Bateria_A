package com.umg.curso;

import javax.management.timer.TimerNotification;
import javax.sound.midi.Soundbank;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Tienda tienda = new Tienda("PetShop");
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir){
            System.out.println("\n========= MENU =========");
            System.out.println("1. Ingresar nueva mascota");
            System.out.println("2. Listar mascotas");
            System.out.println("3. Mostrar suma de edades de mascotas");
            System.out.println("4. Salir");

            try{
                System.out.println("\nElija una opción: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\nIngrese nombre de la mascota:");
                        Mascota mascota = new Mascota(sn.next());
                        System.out.println("Ingrese tipo de animal:");
                        mascota.setTipoAnimal(sn.next());
                        System.out.println("Ingrese raza de animal:");
                        mascota.setRaza(sn.next());
                        System.out.println("Ingrese edad de mascota:");
                        mascota.setEdad(sn.nextInt());
                        tienda.addMascota(mascota);
                        break;
                    case 2:
                        ArrayList<Mascota> mascotas = tienda.getMascotas();
                        System.out.println("\n--------------");
                        for (int i=0; i<mascotas.size(); i++) {
                            System.out.println("Mascota #" + (i+1) + ": " + mascotas.get(i).getNombreAnimal() + ", " + mascotas.get(i).getTipoAnimal() + " " + mascotas.get(i).getRaza() + " de " + mascotas.get(i).getEdad()+" de edad.");
                        }
                        System.out.println("--------------\n");
                        break;
                    case 3:
                        System.out.println("\n--------------");
                        System.out.println("La suma de edades de las mascotas es: " + tienda.getSumaEdades());
                        System.out.println("--------------\n");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Sólo están habilitadas las opciones del 1 al 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar una opción válida");
                sn.next();
            }
        }

    }
}
