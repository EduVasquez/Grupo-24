/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author dhal_
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }   
    
    public int getX(){
        return x;
    }
     public int getY(){
         return y;
     }
     
     public void setX(int x){
         this.x=x;
     }
     
     public void setY(int y){
         this.y=y;
     }
     public double obtenerDistancia (Punto p){
         return Math.sqrt(Math.pow(p.getX()- x, 2)+ (Math.sqrt(Math.pow(p.getY()-y, 2))));
     }
    
}
