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

    @Override
    public void mostrar() {
        System.out.println("\nYo soy un pato de goma");
    }

    @Override
    public void realizarVuelo() {
        NoVuela n = new NoVuela();
        n.volar();
    }

    @Override
    public void realizarCuaqueo() {
        Chirreo c = new Chirreo();
        c.cuaquear();
    }
    
}
