/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2;

/**
 *
 * @author sistemas
 */
public class PatoCabezaRoja extends Pato {

    @Override
    protected void mostrar() {
        System.out.print("\nYo soy un real pato de cabeza roja");
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
