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
        Punto punto1 = new Punto(1,3); // Se crea un objeto de la clase Punto y le damos los valores al constructor
        Punto punto2 = new Punto (4,6);// Se crea un objeto de la clase Punto y le damos los valores al constructor
        // Imprime la cadena y se llama al método obtenerDistancia
        System.out.println("La distancia que hay entre el punto1 y punto2 es :" + punto1.obtenerDistancia(punto2));
    }
    
}
