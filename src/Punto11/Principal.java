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
        String nom, marca, est;
        int lim;
        char resp;
        int j=0;
        int i=0;
        Zapatilla zapa = new Zapatilla();
        GestorZapatilla gc = new GestorZapatilla();

        do{
             j=j+1;
             System.out.println("*********************************");
             System.out.println("       Zapatilla: " +j);
             System.out.println("*********************************");
             System.out.print("Ingrese color de zapatilla : ");
             String color = scn.next();
             System.out.print("Ingrese numero de zapatilla : ");
             int num = scn.nextInt();
             Zapatilla zap = new Zapatilla(color, num, zapa.getMarca(), zapa.getEstado());
             gc.agregarZapatilla(zap);
             System.out.println("   ");
             System.out.print("Desea ingresar mas datos s/n : ");
             resp = scn.next().charAt(0);
             System.out.println("   ");
             
         }while(resp!='n'&& resp!='N');
        
        System.out.println("   ");  
        System.out.println("******************************************************");
        System.out.println("              MOSTRAR ZAPATILLAS");
        System.out.println("******************************************************");
         System.out.println("N°"+ " \t"+"Color"+"   \t"+"Nro de Calzado"+"   \t"+"Marca"+"   \t"+"Estado");
         System.out.println("---------------------------------------------------------------------------");
        for(Zapatilla circulo: gc.getZapatilla()){
            
            i=i+1;
            System.out.println(i+"\t"+ circulo.getColor()+"              \t"+circulo.getNumero()+"            \t"+circulo.getMarca()+"    \t"+circulo.getEstado());
            
        }
    }
    
}
