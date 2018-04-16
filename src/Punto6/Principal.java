/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import Punto2.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class Principal {
    public static void main(String[] args) {
        int r;
        Scanner scn= new Scanner(System.in);
        Rectangulo rec1 = new Rectangulo (3, 4, 4, 6);
        Rectangulo rec2 = new Rectangulo (2, 5, 2, 3);
        Rectangulo rec3 = new Rectangulo (4, 4, 7, 3);
        Rectangulo rec4 = new Rectangulo (6, 3, 4, 5);
    
        GestorRectangulo gr = new GestorRectangulo();
        gr.agregarRectangulo(rec1);
        gr.agregarRectangulo(rec2);
        gr.agregarRectangulo(rec3);
        gr.agregarRectangulo(rec4);
        
        gr.mostrarRectangulos();
        do{
            System.out.print("Ingrese un numero de Rectangulo : ");
            r = scn.nextInt();
        }while(r>=5);
        if (r<5){
            gr.eliminarRectangulo(r);
            System.out.println("El rectangulo fue eliminado con exito");
            System.out.println("Mostrar los rectangulos restantes");
            gr.mostrarRectangulos();   
        }
        
        
        
        
    }
    
  
    
    
    
    
}
