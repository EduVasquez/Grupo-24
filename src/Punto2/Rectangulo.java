/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;


public class Rectangulo {
    public int calularPuntoUno(int x,int base){
        int nuevox=x+base;
        return nuevox;        
    }
    public int calularPuntoDos(int y,int altura){
        int nuevoy=y+altura;
        return nuevoy;        
    }
    /*public int calularPuntoTres(int nuevax,int nuevay){
        int nuevoy=nuevax+altura;
        return nuevoy;        
    }*/
    public double calcularPerimetro(int altura,int base){
        double perimetro=2*(altura+base);
        return perimetro;
    }
    public double calcularSuperficie(int altura, int base){
        double superficie=(base*altura);
        return superficie;
    }
}
