/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

/**
 *
 * @author dhal_
 */
public class Autor {
    private String nombre;
    private String apellido;

    /**
     * @param nombre
     * @param apellido
     */
    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /**
     * @return el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @return el valor del apellido
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
}
