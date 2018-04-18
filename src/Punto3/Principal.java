/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class Principal {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c; // Definimos las variables para usar en el constructor 
        Scanner scn = new Scanner(System.in); // Creamos un objeto de la clase Scanner 
        System.out.println("Ingresar el lado 1 : ");
        a= scn.nextDouble(); // Guardamos el valor ingresado en a
        System.out.println("Ingresar el lado 2 : ");
        b= scn.nextDouble(); // Guardamos el valor ingresado en b
        System.out.println("Ingresar el lado 3 : ");
        c= scn.nextDouble(); // Guardamos el valor ingresado en c
        
        Trinagulo triang = new Trinagulo(a,b,c); // Creamos un objeto triang de la clase Triangulo y le damos los valores al constructor
         
        if(triang.mostrarFigura()==true){ // Usamos el método mostrarFigura para ver si es verdadero o falso
             System.out.println("Se formo el triangulo");
             System.out.println("el perimetro del triangulo es: " + triang.obtenerPerimetro()); // Si es verdadero devolverá el perimetro desde el método obtenerPerimetro
        }else
            System.out.println("No se formo el triangulo"); // Si va a imprimir la cadena si el resultado del método mostrarFigura es falso
        
        
        
        
    }
        
    
}
