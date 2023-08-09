package com.mx.globant.entidades;


import java.util.List;

public class Juego {
    private List<Jugador> jugadores; 
    private RevolverAgua r; 

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getR() {
        return r;
    }

    public void setR(RevolverAgua r) {
        this.r = r;
    }
    
    
    
    
}
