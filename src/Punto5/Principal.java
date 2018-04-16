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
         Scanner scn = new Scanner(System.in);
         GestorCirculo gc = new GestorCirculo();
         char resp;
         int i=0;
         int j=0;
         do{
             j=j+1;
             System.out.println(" Circulo: " +j);
             System.out.print("Ingrese el radio : ");
             double radio = scn.nextDouble();
             System.out.print("Ingrese color de circulo : ");
             String color = scn.next();
             Circulo cir = new Circulo(radio, color);
             gc.agregarCirculo(cir);
             System.out.println(" ");
             System.out.print("Desea ingresar mas datos s/n : ");
              resp = scn.next().charAt(0);
             
         }while(resp!='n'&& resp!='N');
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
