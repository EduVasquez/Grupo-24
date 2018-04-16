/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11;

import java.util.Random;

/**
 *
 * @author dhal_
 */
public class Zapatilla {
    private String color;
    private int numero;
    private String [] marcas = {"Nike", "Puma", "Salomon", "Reebok", "Columbia"};
    private String marca;
    private String [] estados = {"Original" , "Copia"};
    private String estado;
    private Random rand = new Random(System.nanoTime());

    public Zapatilla() {
        this.color = color;
        this.numero = numero;
        this.marca = generarMarca();
        this.estado = generarEstado();
    }
    
     public Zapatilla(String color, int numero, String marca, String estado) {
        this.color = color;
        this.numero=numero;
        this.marca = generarMarca();
        this.estado = generarEstado();
    }
     
     private String generarMarca(){
		String t = "";
		int indice = rand.nextInt(this.marcas.length);
		
		t = this.marcas[indice];
		
		return t;
	}
    
    private String generarEstado(){
		String t = "";
		int indice = rand.nextInt(this.estados.length);
		
		t = this.estados[indice];
		
		return t;
	}


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String getColor() {
        return color;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public String getEstado() {
        return estado;
    }

      public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
