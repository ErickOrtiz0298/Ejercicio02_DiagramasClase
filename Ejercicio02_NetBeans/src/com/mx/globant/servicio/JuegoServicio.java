package com.mx.globant.servicio;

import java.util.Scanner;
import com.mx.globant.entidades.*;
import java.util.ArrayList;
import java.util.List;

public class JuegoServicio {
    
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static Juego llenarJuego(ArrayList<Jugador>jugadores, RevolverAgua r){
        Juego juego = new Juego();
        System.out.println("Ingrese el numero de jugadores");
        juego.setJugadores(ingresarJugadores(jugadores,sc.nextInt()));
        juego.setR(r);
        mostrarCondiciones(juego);
        return juego;
    }
    
    protected static List<Jugador>  ingresarJugadores(ArrayList<Jugador> jugadores, int numeroJugadores){
        if(numeroJugadores < 1 || numeroJugadores > 6){
            int i = 0; 
            do {                
                jugadores.add(JugadorServicio.crearJugador());
                i++;
            } while (i < 6);
        } else{
            int i = 0; 
            do {                
                jugadores.add(JugadorServicio.crearJugador());
                i++;
            } while (i < numeroJugadores);
        }
        return jugadores;
    }
    
    public static boolean ronda(Jugador jugador, RevolverAgua revolver){
        jugador.setMojado(JugadorServicio.disparo(revolver));
        
        if(jugador.getMojado()){
            System.out.println("El jugador: " + jugador.getId() + " ha sido mojado");
            return true;
        }else{
            System.out.println("El jugador: " + jugador.getId() + " se ha salvado");
        }
        return false;
    }
    
    protected static void mostrarCondiciones(Juego juego){
        System.out.println("Se ha creado el luego con los jugadores");
        for(Jugador jugador: juego.getJugadores()){
            System.out.println(jugador.getNombre());
        }
        
        System.out.println("El revolver tiene las condiciones" + juego.getR().toString());
        
    }
    
}
