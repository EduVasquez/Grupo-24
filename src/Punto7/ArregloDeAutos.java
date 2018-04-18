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
public class ArregloDeAutos { // Craemos la clase ArregloDeAutos que será un Array
    private Auto[] arreglo;
    
    /**
     */
    public ArregloDeAutos() { // Definimos al constructor que será un Array con el tamaño
        arreglo = new Auto[5];
    }
    
    /**
     * @param arreglo
     */
    public ArregloDeAutos(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
    
    /**
     * @param tamanioArreglo
     */
    public ArregloDeAutos(int tamanioArreglo){  
        arreglo = new Auto[tamanioArreglo];
    }
    
    /**
     * @param auto
     * @param posicion
     */
    public void agregarAuto(Auto auto, int posicion){
        arreglo[posicion] = auto;
    }
    
    /**
     * se llama al metodo mostrar
     */
    public void mostrarArreglo(){
        for(Auto a:arreglo){
            a.mostrarDatos();
        }
    }
    
    /**
     * @return el valor de arreglo
     */
    public Auto[] getArreglo() {
        return arreglo;
    }
    
    /**
     * @param arreglo
     */
    public void setArreglo(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
    
    /**
     * @param aut
     */
     public void buscarAuto(String aut){ // Definimos el método buscarAuto
        for (Auto a : arreglo) {
            if(aut == null ? a.getNombre() == null : aut.equals(a.getNombre()))
                a.mostrarDatos();
                
        }
         
     }
    
}
