/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simupatolab2;

/**
 *
 * @author sistemas
 */
public class PatoReal extends Pato {

    @Override
    protected void mostrar() {
        System.out.println("Yo soy un pato real");
    }

    @Override
    public void realizarVuelo() {
        
    }

    @Override
    public void realizarCuaqueo() {
        Cuaqueo c = new Cuaqueo();
        c.cuaquear();
    }  
    
    
}
