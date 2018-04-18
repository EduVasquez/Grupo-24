/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import Punto2.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author dhal_
 */
public class GestorRectangulo { // Creamos la clase GestorRectangulo, que será un ArrayList 
      private ArrayList<Rectangulo> rectangulo = new ArrayList(); // Creamos un ArrayList
        /**
     * @return el valor del rectangulo
         */
        public ArrayList<Rectangulo> getRectangulo() { 
            return rectangulo;
        }
        
        /**
     * @param rectangulo
         */
        public void setRectangulo(ArrayList<Rectangulo> rectangulo) {
            this.rectangulo = rectangulo;
        }
        
        

   /**
     * @param rect
    */
    public void agregarRectangulo(Rectangulo rect){ // Creamos el métodoa gregarRectangulo
        
        this.rectangulo.add(rect);
    }
    
    /**
     * @param r
     */
    public void eliminarRectangulo(int r){ // Creamos el método eliminarRectangulo
        this.rectangulo.remove(r-1);
        
    }
    
    public void mostrarRectangulos(){ // Creamos el método mostrarRectangulos 
        for(Rectangulo r: this.getRectangulo()){ 
            System.out.println("--------------------------------------------------");
            System.out.println("    RECTANGULO N°:" + (this.rectangulo.indexOf(r)+1));
            System.out.println("--------------------------------------------------");
            System.out.println("Las cordenadas son: ("+r.getCordenadaX()+","+r.getCordenadaY()+")");
            System.out.println("La superficie es: "+ r.calcularSuperficie());
            System.out.println("El perimetro es: "+r.calcularPerimetro());
        }
    }
    
}
