/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class Principal {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int cod, cuo;
         String nomb;
         double pu;
         char resp;
         int i=0;
         GestorProducto gp = new GestorProducto();
         Producto product = new Producto();
         
         do{
             i=i+1;
             System.out.println("   ");
             System.out.println("***************PRODUCTO N°"+i+"*****************");
             System.out.print("Ingrse codigo de producto : ");
             cod = scn.nextInt();
             do{
             System.out.print("Ingrese Nombre : ");
             nomb = scn.next();
             }while("".equals(nomb));
             do{
             System.out.print("Ingrese Precio Unitario : ");
             pu = scn.nextDouble();
             }while(pu<0);
             do{
             System.out.print("Ingrese cuota : ");
             cuo = scn.nextInt();
             }while(cuo<0);
             Producto prod = new Producto(cod,nomb,pu,cuo);
             gp.agregarProducto(prod);
             System.out.println("Desea ingresar mas Datos S/N :");
             resp = scn.next().charAt(0);
             
         }while(resp!='n'&&resp!='N');
          System.out.println("------------------------------------------------------------------------------------");
          System.out.println("Codigo"+"  \t"+"Nombre"+"  \t"+"Precio Unitario"+" \t"+"Cuotas"+"  \t"+"Precio Total");
          System.out.println("----------------------------------------------------------------------------------- ");
          gp.mostrarProducto();
          
          System.out.println("  ");
          System.out.println("El total a cobrar es : $"+gp.calcularPrecioTotal() );
         
       
     }
    
}
