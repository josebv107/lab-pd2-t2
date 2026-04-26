/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2.Entidades;

import simupatolab2.Acciones.Cuaqueable;
import simupatolab2.Acciones.Volable;

/**
 *
 * @author sistemas
 */
public abstract class Pato {
    protected Volable volable;
    protected Cuaqueable cuaqueable;
    
    public Pato() {
        
    }
    
    public void setVolable(Volable fb) {
        this.volable = fb;
    }
    
    public void setCuaqueable(Cuaqueable qb) {
        this.cuaqueable = qb;
    }
    
    protected abstract void mostrar();
    
    public abstract void realizarVuelo();
    
    public abstract void realizarCuaqueo();
    
    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }
}
