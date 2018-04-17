/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

import java.util.ArrayList;

/**
 *
 * @author dhal_
 */
public class GestorProducto {
     private ArrayList<Producto> producto = new ArrayList();

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
     
     
  public void agregarProducto(Producto prod){
      this.producto.add(prod);
      
  }
  
     public void mostrarProducto(){
        for(Producto p: this.getProducto()){
            p.mostrarDatos();
            
        }
    }
     public double calcularPrecioTotal(){
         double precio=0;
         for(Producto p: this.getProducto()){
             precio = precio+p.calcularCuota();
         }
        return precio;     
     }
     
   
    
}   
    

