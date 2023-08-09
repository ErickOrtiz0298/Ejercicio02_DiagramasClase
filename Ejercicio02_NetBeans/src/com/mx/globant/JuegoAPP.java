package com.mx.globant;

import com.mx.globant.servicio.*;
import com.mx.globant.entidades.*;
import java.util.List;
import java.util.ArrayList;

public class JuegoAPP {
    public static void main(String[] args){
        
         ArrayList<Jugador> jugadores = new ArrayList<>();
         Juego juegoRuletaRusa; 
         
        juegoRuletaRusa = JuegoServicio.llenarJuego(jugadores, RevolverAguaServicio.llenarRevolver(RevolverAguaServicio.crearRevolver()));
         
        
    }
}
