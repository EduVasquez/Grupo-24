/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author dhal_
 */
public class Circulo { // Creamos la clase Circulo
    private double radio;
    private String color;

    public Circulo(double radio, String color) { // Le damos las variables al constructor
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularSup(){ // Creamos el método calcularSup que devolverá la superficie 
        return 2*Math.PI*Math.pow(radio, 2);
    }
}
