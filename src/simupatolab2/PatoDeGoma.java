/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato {

    @Override
    protected void mostrar() {
        System.out.print("\nYo soy un pato de goma");
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
