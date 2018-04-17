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
        Zapatilla zapa = new Zapatilla();
        GestorZapatilla gz = new GestorZapatilla();

        do{
             j=j+1;
             System.out.println("*********************************");
             System.out.println("       Zapatilla: " +j);
             System.out.println("*********************************");
            
             do{
                 System.out.print("Ingrese marca de la zapatilla : ");
                 marca = scn.next();   
             }while("".equals(marca));
             do{
                  System.out.print("Ingrese numero de zapatilla : ");
                  num = scn.nextInt();  
             }while(num<0);
             do{
                  System.out.print("Ingrese color de la zapatilla : ");
                  color = scn.next();
             }while("".equals(color));
             do{
                  System.out.print("Ingrese calidad de la zapatilla : ");
                  calidad = scn.next();
             }while("".equals(calidad));
             do{
                  System.out.print("Ingrese precio de la zapatilla : ");
                  precio = scn.nextDouble();
             }while(precio<0);
             
             Zapatilla zap = new Zapatilla(marca, num, color, calidad, precio );
             gz.agregarZapatilla(zap);
             System.out.println("   ");
             System.out.print("Desea ingresar mas datos s/n : ");
             resp = scn.next().charAt(0);
             System.out.println("   ");
             
         }while(resp!='n'&& resp!='N');
        
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
