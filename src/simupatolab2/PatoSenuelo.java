/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2;

/**
 *
 * @author sistemas
 */
public class PatoSenuelo extends Pato {
    public PatoSenuelo() {
        
    }

    @Override
    protected void mostrar() {
        System.out.println("\nYo soy Pato Señuelo");
    }

    @Override
    public void realizarVuelo() {
        NoVuela n = new NoVuela();
        n.volar();
    }

    @Override
    public void realizarCuaqueo() {
        CuaqueoMudo c = new CuaqueoMudo();
        c.cuaquear();
    }
    
}
