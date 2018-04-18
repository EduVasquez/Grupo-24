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
    
    public ArregloDeAutos() { // Definimos al constructor que será un Array con el tamaño
        arreglo = new Auto[5];
    }

    public ArregloDeAutos(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public ArregloDeAutos(int tamanioArreglo){  
        arreglo = new Auto[tamanioArreglo];
    }
    
     public void agregarAuto(Auto auto, int posicion){
        arreglo[posicion] = auto;
    }
    
    public void mostrarArreglo(){
        for(Auto a:arreglo){
            a.mostrarDatos();
        }
    }

    public Auto[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
     public void buscarAuto(String aut){ // Definimos el método buscarAuto
        for (Auto a : arreglo) {
            if(aut == null ? a.getNombre() == null : aut.equals(a.getNombre()))
                a.mostrarDatos();
                
        }
         
     }
    
}
