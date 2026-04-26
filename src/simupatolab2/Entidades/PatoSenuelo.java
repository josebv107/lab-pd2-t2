/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2.Entidades;

import simupatolab2.Acciones.CuaqueoMudo;
import simupatolab2.Acciones.NoVuela;

/**
 *
 * @author sistemas
 */
public class PatoSenuelo extends Pato {

    public PatoSenuelo() {
        volable = new NoVuela();
        cuaqueable = new CuaqueoMudo();
    }

    @Override
    public void mostrar() {
        System.out.println("\nYo soy Pato Señuelo");
    }
}
