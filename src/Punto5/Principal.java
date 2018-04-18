/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class Principal {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in); // Creamos un objeto de tipo scanner
         GestorCirculo gc = new GestorCirculo(); // Creamos un objeto de la clase GestorCirculo
         char resp;
         int i=0;
         int j=0;
         do{ // Definimos una validación
             j=j+1;
             System.out.println(" Circulo: " +j); // Aclaramos el número de círculo
             System.out.print("Ingrese el radio : "); // Pedimos el radio
             double radio = scn.nextDouble(); // Guardamos el radio en la variable radio
             System.out.print("Ingrese color de circulo : "); // Pedimos el color
             String color = scn.next(); // Guardamos el color en la variable color
             Circulo cir = new Circulo(radio, color); // Creamos un objeto cir de la clase Ciruclo, y le damos los valores al constructor
             gc.agregarCirculo(cir); // Usamos el método agregarCiruculo que será un ArrayList de tipo objeto (cir)
             System.out.println(" ");
             System.out.print("Desea ingresar mas datos s/n : ");
              resp = scn.next().charAt(0); // Guardamos la respuesta, con s volverá a cargar otro círculo y con n devolverá los datos ingresados con la superficie
             
         }while(resp!='n'&& resp!='N'); // el bucle se repetirá mientras la respuesta sea distinta de n
         //Imprimimos el círculo, radio, color y superficie del círculo ingresado
         System.out.println("   ");  
         System.out.println("************MOSTRAR CIRCULOS************");
         System.out.println("Circulo"+ "       "+"Radio"+"       "+"Color"+"        "+"Superficie");
         System.out.println("---------------------------------------------------");
        for(Circulo circulo: gc.getCirculos()){ 
            
            i=i+1;
            System.out.println(i+"             "+ circulo.getRadio()+"         "+circulo.getColor()+"         "+circulo.calcularSup());
            
        }
     }
    
}
