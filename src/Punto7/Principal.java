/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Creamos un objeto scn de Scanner
          
    
        Auto auto1 = new Auto("Auto1", "AA647AA", 2016, "Peugot", "Gris", "Nafta"); // Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto2 = new Auto("Auto2", "AB147VA", 2017, "Citroen", "Azul", "Gasoil");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto3 = new Auto("Auto3", "AB237RT", 2017, "Fiat", "Negro", "Nafta");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto4 = new Auto("Auto4", "AA456WR", 2016, "Toyota", "Marron", "Gasoil");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto5 = new Auto("Auto5", "AC575YU", 2018, "Ford", "Rojo", "Gns");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        
        Auto autos[] = new Auto[5]; // Creamos un Array
        ArregloDeAutos arregloDeAutos = new ArregloDeAutos(5); //  Creamos un objeto que será un Array de la clase ArregloDeAutos
        arregloDeAutos.agregarAuto(auto1, 0); // Le pasamos los valores del objeto auto1
        arregloDeAutos.agregarAuto(auto2, 1);// Le pasamos los valores del objeto auto2
        arregloDeAutos.agregarAuto(auto3, 2);// Le pasamos los valores del objeto auto3
        arregloDeAutos.agregarAuto(auto4, 3);// Le pasamos los valores del objeto auto4
        arregloDeAutos.agregarAuto(auto5, 4);// Le pasamos los valores del objeto auto5
        
        System.out.println("**************************MOSTRAR AUTOS**************************"); 
        System.out.println("    ");
        System.out.println("Nombre"+"       "+"Patente"+"       " + "Modelo"+"      " +" Marca"+"       " +" Color"+"       " +" Tipo de combustible");
        System.out.println("--------------------------------------------------------------------------------------");
            
        arregloDeAutos.mostrarArreglo(); // Mostramos los autos que están en el arreglo con cada atributo del auto 
       // Le pedimos al usuario que ingrese el nombre de 1 auto de la lista y le mostraremos sus atritubos de ese auto
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("    ");
        System.out.print("Ingrese el nombre de un auto : ");
        String aut = scn.next();
        System.out.println("    ");
        System.out.println("Nombre"+"       "+"Patente"+"       " + "Modelo"+"      " +" Marca "+"      " +" Color"+"       " +" Tipo de combustible");
        System.out.println("---------------------------------------------------------------------------------");
        arregloDeAutos.buscarAuto(aut);  // Usamos el método buscarAuto para devolver los atributos
            
    }    
}
