/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

/**
 *
 * @author dhal_
 */
public class Auto { // Creamos la clase auto y definimos las variables que vamos a usar
    private String nombre;
    private String patente;
    private int modelo;
    private String marca;
    private String color;
    private String tipoCombustible;
    
    public Auto(){ // Constructor 1
        
    }
    
    public Auto(String nombre, String patente, int modelo, String marca, String color, String tipoCombustible){ // Constructor 2
        this.nombre=nombre;
        this.patente=patente;
        this.modelo=modelo;
        this.marca=marca;
        this.color=color;
        this.tipoCombustible=tipoCombustible;
    }
    
    public void mostrarDatos(){ // Método que mostrará todas las variables del auto
         System.out.println(getNombre() + "        " +getPatente() +"         " +getModelo() + "       " +getMarca() + "         " +getColor() + "         " +getTipoCombustible());;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getPatente(){
        return patente;
    }
    public int getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPatente(String patente){
        this.patente=patente;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

   
    
}
