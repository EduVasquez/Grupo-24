/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

import java.util.ArrayList;

/**
 *
 * @author dhal_
 */
public class GestorAutor {
     private ArrayList<Autor> autor = new ArrayList();

   
    
    /**
     * @return el valor de autor
     */
    public ArrayList<Autor> getAutor() {
        return autor;
    }
    
    /**
     * @param autor
     */
    public void setAutor(ArrayList<Autor> autor) {
        this.autor = autor;
    }
    
    /**
     * @param autor
     */
    public void agregarAutor(Autor autor){
        
        this.autor.add(autor);
        
    }
    
    
    public void mostrarAutores(){
    for (Autor a: this.getAutor()){
        System.out.println("------------------------------");
        System.out.println("    Autor n°"+(this.autor.indexOf(a)+1));
        System.out.println("------------------------------");
        System.out.println("Nombre :"+a.getNombre());
        System.out.println("Apellido :"+a.getApellido());
        System.out.println("    ");
    }
    
    }

    
     
     
    
}
