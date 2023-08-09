package com.mx.globant.servicio;


import com.mx.globant.entidades.*;

import java.util.Scanner; 
public class JugadorServicio {
    
    static Scanner sc = new Scanner(System.in).useDelimiter("\n"); 
    
    public static Jugador crearJugador(){
        Jugador jugador = new Jugador(); 
        return jugador; 
    }
    
    public static Boolean disparo(RevolverAgua r){
        if(RevolverAguaServicio.mojar(r)){
            return true;
        }
        RevolverAguaServicio.siguienteChorro(r);
        return false;
    }
    
    
}
