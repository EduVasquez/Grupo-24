/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11;

import java.util.ArrayList;

/**
 *
 * @author dhal_
 */
public class GestorZapatilla { // Se crea la clase GestorZapatilla y un ArrayList de tipo Zapatilla
    private ArrayList<Zapatilla> zapatillas = new ArrayList();

    
    public ArrayList<Zapatilla> getZapatilla() {
        return zapatillas;
    }

  
    public void setZapatilla(ArrayList<Zapatilla> zapatilla) {
        this.zapatillas = zapatilla;
    }
    
    public void agregarZapatilla(Zapatilla zapatilla){
        
        this.zapatillas.add(zapatilla);
    }
    
    
}
