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
        Scanner scn= new Scanner(System.in); // Creamos un objeto de tipo Scanner 
        Rectangulo rec1 = new Rectangulo (3, 4, 4, 6); // Creamos un objeto rec1 de la clase Rectangulo (del punto2) y le damos los valores al constructor
        Rectangulo rec2 = new Rectangulo (2, 5, 2, 3); // Creamos un objeto rec2 de la clase Rectangulo (del punto2) y le damos los valores al constructor 
        Rectangulo rec3 = new Rectangulo (4, 4, 7, 3); // Creamos un objeto rec3 de la clase Rectangulo (del punto2) y le damos los valores al constructor 
        Rectangulo rec4 = new Rectangulo (6, 3, 4, 5); // Creamos un objeto rec4 de la clase Rectangulo (del punto2) y le damos los valores al constructor 
    
        GestorRectangulo gr = new GestorRectangulo(); // Creamos un objeto gr que será un ArrayList de la clase GestorRectangulo
        gr.agregarRectangulo(rec1); // Con el método agregarRectangulo le damos los valores a gr
        gr.agregarRectangulo(rec2); // Con el método agregarRectangulo le damos los valores a gr
        gr.agregarRectangulo(rec3); // Con el método agregarRectangulo le damos los valores a gr
        gr.agregarRectangulo(rec4); // Con el método agregarRectangulo le damos los valores a gr
        
        gr.mostrarRectangulos(); // Usamos método mostrarRectangulos para visualizar el número de rectángulo, las coordenadas, la superficie y el perímetro
        do{
            System.out.println("    ");
            System.out.print("Ingrese un numero de Rectangulo para ser eliminado : "); 
            r = scn.nextInt(); // El número que ingrese eliminará al rectángulo
        }while(r>=5);
        if (r<5){
            gr.eliminarRectangulo(r); // Usamos el método para eliminar el rectángulo
            System.out.println("    ");
            System.out.println("**************************************");
            System.out.println("El rectangulo fue eliminado con exito");
            System.out.println("**************************************");
            System.out.println("    ");
            System.out.println("Mostrar los rectangulos restantes");
            gr.mostrarRectangulos();   //Usamos el método para mostrar los rectángulos que quedaron
        }
        
        
        
        
    }
    
  
    
    
    
    
}
