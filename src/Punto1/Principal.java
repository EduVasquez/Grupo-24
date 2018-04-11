/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author dhal_
 */
public class Principal {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto(1,3);
        Punto punto2 = new Punto (4,6);
        System.out.println("La distancia que hay entre el punto1 y punto2 es :" + punto1.obtenerDistancia(punto2));
    }
    
}
