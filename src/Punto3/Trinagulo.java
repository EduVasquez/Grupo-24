/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author dhal_
 */
public class Trinagulo { // Creamos la clase y sus variables
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Trinagulo(double lado1, double lado2, double lado3){ // Definimos las variables para el constructor 
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        
    }
    
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    public void setLado1(double lado1){
        this.lado1=lado1;
    }
     public void setLado2(double lado2){
        this.lado2=lado2;
    }
      public void setLado3(double lado3){
        this.lado3=lado3;
    } 
    
    
      public boolean mostrarFigura(){ // Creamos el método mostrarFigura
          
          boolean ban=false;
          
          if(((lado1+lado2)>lado3)&&((lado1+lado3)>lado2)&&((lado2+lado3)>lado1))
              
              ban=true;
       
             return ban;
        }
      public double obtenerPerimetro(){ // Creamos el método obtenerPerimetro
         
          return (lado1+lado2+lado3);
      }

}
    

