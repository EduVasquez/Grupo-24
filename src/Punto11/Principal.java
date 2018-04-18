/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11;

import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String marca, color, calidad ;
        int num;
        double precio;
        char resp;
        int j=0;
        int i=0;
        Zapatilla zapa = new Zapatilla(); // Se crea un objeto de Zapatilla
        GestorZapatilla gz = new GestorZapatilla(); // Se crea un objeto de GestorZapatilla

        do{
             j=j+1;
             System.out.println("*********************************");
             System.out.println("       Zapatilla: " +j);
             System.out.println("*********************************");
            
             do{ // Usamos  do while para validar datos
                 System.out.print("Ingrese marca de la zapatilla : ");
                 marca = scn.next();   // Guardamos en la variable marca lo que el usuario ingresó
             }while("".equals(marca)); 
             do{
                  System.out.print("Ingrese numero de zapatilla : ");
                  num = scn.nextInt();  // Guardamos en la variable marca lo que el usuario ingresó
             }while(num<0);
             do{
                  System.out.print("Ingrese color de la zapatilla : ");
                  color = scn.next();// Guardamos en la variable marca lo que el usuario ingresó
             }while("".equals(color));
             do{
                  System.out.print("Ingrese calidad de la zapatilla : ");
                  calidad = scn.next();// Guardamos en la variable marca lo que el usuario ingresó
             }while("".equals(calidad));
             do{
                  System.out.print("Ingrese precio de la zapatilla : ");
                  precio = scn.nextDouble();// Guardamos en la variable marca lo que el usuario ingresó
             }while(precio<0);
             
             Zapatilla zap = new Zapatilla(marca, num, color, calidad, precio ); // Le damos al constructor los datos que el usuario ingresó
             gz.agregarZapatilla(zap); // Le damos al objeto gz el método agregarZapatilla con los datos que el usuario ingresó
             System.out.println("   ");
             System.out.print("Desea ingresar mas datos s/n : "); // Preguntamos si quiere agregar más datos 
             resp = scn.next().charAt(0); // Almacenamos la respuesta en la variable resp
             System.out.println("   ");
             
         }while(resp!='n'&& resp!='N'); // Si no quiere agregar nada, se mostrará la zapatilla con los datos que el usuario ingresó
        
        System.out.println("   ");  
        System.out.println("******************************************************");
        System.out.println("              MOSTRAR ZAPATILLAS");
        System.out.println("******************************************************");
         System.out.println("N°"+"  \t  "+"Marca"+" \t  "+"Nro de Calzado"+"    \t  "+"Color"+" \t  "+"Calidad"+"   \t  "+"Precio");
         System.out.println("----------------------------------------------------------------------------------------");
        for(Zapatilla zap: gz.getZapatilla()){
            
            i=i+1;
            System.out.println(i+"  \t  "+ zap.getMarca()+"           \t  "+zap.getNumero()+"           \t  "+zap.getColor()+"  \t  "+zap.getCalidad()+"    \t  "+zap.getPrecio());
            
        }
    }
    
}
