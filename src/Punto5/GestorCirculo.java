/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.ArrayList;

/**
 *
 * @author dhal_
 */
public class GestorCirculo { // Creamos la clase GestorCirculo
    private ArrayList<Circulo> circulos = new ArrayList();  // Creamos un ArrayList 

    /**
     * @return the circulos
     */
    public ArrayList<Circulo> getCirculos() {  // Constructor
        return circulos;
    }

    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
    
    public void agregarCirculo(Circulo circulo){
        
        this.circulos.add(circulo);
    }
    
}
