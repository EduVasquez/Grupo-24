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
        double a, b, c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresar el lado 1 : ");
        a= scn.nextDouble();
        System.out.println("Ingresar el lado 2 : ");
        b= scn.nextDouble();
        System.out.println("Ingresar el lado 3 : ");
        c= scn.nextDouble();
        
        Trinagulo triang = new Trinagulo(a,b,c);
        
        if(triang.mostrarFigura()==true){
             System.out.println("Se formo el triangulo");
             System.out.println("el perimetro del triangulo es: " + triang.obtenerPerimetro());
        }else
            System.out.println("No se formo el triangulo");
        
        
        
        
    }
        
    
}
