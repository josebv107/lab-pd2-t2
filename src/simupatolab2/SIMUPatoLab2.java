/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simupatolab2;

/**
 *
 * @author sistemas
 */
public class SIMUPatoLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatoReal p1 = new PatoReal();
        p1.mostrar();
        p1.realizarCuaqueo();
        p1.realizarVuelo();
        p1.nadar();
        
        PatoDeGoma p2 = new PatoDeGoma();
        p2.mostrar();
        p2.realizarCuaqueo();
        p2.realizarVuelo();
        p2.nadar();
        
        PatoSenuelo p3 = new PatoSenuelo();
        p3.mostrar();
        p3.realizarCuaqueo();
        p3.realizarVuelo();
        p3.nadar();
        
        PatoCabezaRoja p4 = new PatoCabezaRoja();
        p4.mostrar();
        p4.realizarCuaqueo();
        p4.realizarVuelo();
        p4.nadar();
    }
    
}
