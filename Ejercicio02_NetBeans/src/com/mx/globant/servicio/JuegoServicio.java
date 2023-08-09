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
        juego.setR(RevolverAguaServicio.crearRevolver());
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
    
    
    
    
}
