package com.mx.globant.servicio;

import com.mx.globant.entidades.*;
import java.lang.Math;

public class RevolverAguaServicio {
    
    public static RevolverAgua crearRevolver(){
        RevolverAgua r = new RevolverAgua();
        return r;
    }
    
    public static void llenarRevolver(RevolverAgua revolver){
        int rand = (int)(Math.random() * 6 - 1 ) + 1;
        revolver.setPosicionAgua(rand);
        revolver.setPosicionActual(rand);
        
    }
    
    protected static boolean mojar(RevolverAgua revolver){
       /* if(revolver.getPosicionActual() == revolver.getPosicionAgua()){
            return true;
        }
        return false; */
       return(revolver.getPosicionActual() == revolver.getPosicionAgua());
    }
    
    protected static void siguienteChorro(RevolverAgua revolver){
        if(revolver.getPosicionActual() == 6) {
            revolver.setPosicionActual(1);
        }else{
            revolver.setPosicionActual(revolver.getPosicionActual() +1 );
        }
    }
    
    protected static String toString(RevolverAgua revolver){
     return revolver.toString();
    }
    
}
