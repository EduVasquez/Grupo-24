

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;



// Se puso otra clase Libro en el punto 12 porque nos dio un error y no dejaba hacer commit ni push desde el punto 8

public class Libro { // Creamos la clase libro
    private int ISBN; // Creamos las variables que vamos a necesitar
    private String titulo, autor; // Creamos las variables que vamos a necesitar
    private double precio; // Creamos las variables que vamos a necesitar
    private String categoria;
    public Libro() { // Constructor1 
    }
     public Libro(int ISBN, String titulo, String autor, double precio, String categoria) { // Constructor3 para el punto 12 
      this.ISBN = ISBN; // Le damos las variables
        this.titulo = titulo; // Le damos las variables
        this.autor = autor; // Le damos las variables
        this.precio = precio; // Le damos las variables
        this.categoria = categoria; // Le damos las variables
     }

    public Libro(int ISBN, String titulo, String autor, double precio) { // Constructor 2 
        this.ISBN = ISBN; // Le damos las variables
        this.titulo = titulo; // Le damos las variables
        this.autor = autor; // Le damos las variables
        this.precio = precio; // Le damos las variables
    }
 // Setters and Getters
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

  
    
    //public String mostrarLibro(){ // Método para mostrar el libro 
         
       // return "El ISBN del libro es:  "+  + ISBN +", el título es:  "+ titulo + ", el autor es : " + autor + ", el precio es: "  + precio +" y la categoria es: " + categoria  ; // Retorna la cadena + el titulo
    //}
     public void mostrarLibro(){ // Método para mostrar el libro 
         
        System.out.println(getISBN()+"\t"+getTitulo()+"                     \t"+getAutor()+"\t"+getPrecio());
    }

    public String mostrarTitulo(){  // Método para mostrar el título
        
            return "El título es: "+ titulo;
    }
        
}