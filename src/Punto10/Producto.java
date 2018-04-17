/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10;

/**
 *
 * @author dhal_
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double preciounitario;
    private int cuota;
   
    
    public Producto(){
        
    }
    

    public Producto(int codigo, String nombre, double preciounitario, int cuota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.preciounitario = preciounitario;
        this.cuota = cuota;
     
    
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public int getCuota() {
        return cuota;
    }


 

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
     public void mostrarDatos(){
        
         System.out.println(getCodigo()+"       \t"+getNombre()+"        \t"+getPreciounitario()+"           \t"+getCuota()+"           \t"+calcularCuota());;
    }
     
     public double calcularCuota(){
        
             return 0.015*getPreciounitario()*getCuota()+getPreciounitario();
       
     }
    
    
}
