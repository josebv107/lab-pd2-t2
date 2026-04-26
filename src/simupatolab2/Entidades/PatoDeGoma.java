/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2.Entidades;

import simupatolab2.Acciones.Chirreo;
import simupatolab2.Acciones.NoVuela;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        volable = new NoVuela();
        cuaqueable = new Chirreo();
    }

    @Override
    public void mostrar() {
        System.out.println("\nYo soy un pato de goma");
    }
    
}
