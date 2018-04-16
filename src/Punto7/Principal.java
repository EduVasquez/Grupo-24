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
        Scanner scn = new Scanner(System.in);
          
    
        Auto auto1 = new Auto("Auto1", "AA647AA", 2016, "Peugot", "Gris", "Nafta");
        Auto auto2 = new Auto("Auto2", "AB147VA", 2017, "Citroen", "Azul", "Gasoil");
        Auto auto3 = new Auto("Auto3", "AB237RT", 2017, "Fiat", "Negro", "Nafta");
        Auto auto4 = new Auto("Auto4", "AA456WR", 2016, "Toyota", "Marron", "Gasoil");
        Auto auto5 = new Auto("Auto5", "AC575YU", 2018, "Ford", "Rojo", "Gns");
        
        Auto autos[] = new Auto[5];
        ArregloDeAutos arregloDeAutos = new ArregloDeAutos(5);
        arregloDeAutos.agregarAuto(auto1, 0);
        arregloDeAutos.agregarAuto(auto2, 1);
        arregloDeAutos.agregarAuto(auto3, 2);
        arregloDeAutos.agregarAuto(auto4, 3);
        arregloDeAutos.agregarAuto(auto5, 4);
        
        System.out.println("**************************MOSTRAR AUTOS**************************"); 
        System.out.println("    ");
        System.out.println("Nombre"+"       "+"Patente"+"       " + "Modelo"+"      " +" Marca"+"       " +" Color"+"       " +" Tipo de combustible");
        System.out.println("--------------------------------------------------------------------------------------");
            
        arregloDeAutos.mostrarArreglo();
       
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("    ");
        System.out.print("Ingrese el nombre de un auto : ");
        String aut = scn.next();
        System.out.println("    ");
        System.out.println("Nombre"+"       "+"Patente"+"       " + "Modelo"+"      " +" Marca "+"      " +" Color"+"       " +" Tipo de combustible");
        System.out.println("---------------------------------------------------------------------------------");
        arregloDeAutos.buscarAuto(aut);
            
    }    
}
