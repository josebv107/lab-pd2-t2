/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2.Entidades;

import simupatolab2.Acciones.Cuaqueo;
import simupatolab2.Acciones.VuelaConAlas;

/**
 *
 * @author sistemas
 */
public class PatoReal extends Pato {

    @Override
    public void mostrar() {
        System.out.println("\nYo soy un verdadero PATO REAL");
    }

    @Override
    public void realizarVuelo() {
        VuelaConAlas v = new VuelaConAlas();
        v.volar();
    }

    @Override
    public void realizarCuaqueo() {
        Cuaqueo c = new Cuaqueo();
        c.cuaquear();
    }  
    
    
}
