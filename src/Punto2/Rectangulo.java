/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;


public class Rectangulo { // Definimos la clase y las variables que vamos a usar
    private int x;
    private int y;
    private int altura;
    private int base;
    public Rectangulo(int x, int y, int base, int altura){ // Constructor 
        this.x=x;
        this.y=y;
        this.altura=altura;
        this.base=base;
    }
     public int getCordenadaX(){
        return x;
     }
     public int getCordenadaY(){
        return y;
     }
     public int getBase(){
        return base;
     }
     public int getAltura(){
        return altura;
     }
     public void setCordenadaX(int x){
        this.x=x;
     }
     public void setCordenadaY(int y){
        this.y=y;
     }
     public void setBase(int base){
        this.base=base;
    }
     public void setAltura(int altura){
        this.altura=altura;
    }
    public int calularPuntoUno(){ // Definimos un método
        int nuevox=x+base;
        return nuevox;        
    }
    public int calularPuntoDos(){ // Definimos un método
        int nuevoy=y+altura;
        return nuevoy;        
    }
    
    public double calcularPerimetro(){ // Definimos un método
        double perimetro=2*(altura+base);
        return perimetro;
    }
    public double calcularSuperficie(){ // Definimos un método
        double superficie=(base*altura);
        return superficie;
    }
}
