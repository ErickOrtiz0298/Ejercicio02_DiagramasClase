
package com.mx.globant.entidades;

public class Jugador {
    private static Integer idJugador = 0;
    private Integer id; 
    private String nombre = "Jugador"; 
    private Boolean mojado = true; 

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.id = ++idJugador;
        this.nombre = this.nombre + idJugador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    
}
