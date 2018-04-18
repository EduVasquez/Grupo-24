/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11;

import java.util.logging.Logger;

/**
 *
 * @author dhal_
 */
public class Zapatilla { // Se crea la clase Zapatilla y se le indican las variables
    private String color;
    private int numero;
    private String marca;
    private String calidad;
    private double precio;
    
    public Zapatilla() { // Constructor 1 
        this.color = color;
        this.numero = numero;
        this.marca = marca;
        this.calidad = calidad;
        this.precio = precio;
    }

    public Zapatilla(String color, int numero, String marca, String calidad, double precio) { // Constructor 2
        this.color = color;
        this.numero = numero;
        this.marca = marca;
        this.calidad = calidad;
        this.precio = precio;
    }

    public String getColor() { 
        return color;
    }

    public int getNumero() {
        return numero;
    }

    public String getMarca() {
        return marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    
}