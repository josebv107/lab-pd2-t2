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

    public PatoReal() {
        volable = new VuelaConAlas();
        cuaqueable = new Cuaqueo();
    }

    @Override
    public void mostrar() {
        System.out.println("\nYo soy un verdadero PATO REAL");
    }
    
}
