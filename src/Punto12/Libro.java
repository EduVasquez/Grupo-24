

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;



// Se puso otra clase Libro en el punto 12 porque nos dio un error y no dejaba hacer commit ni push desde el punto 8

public class Libro { // Creamos la clase libro
    private int ISBN; // Creamos las variables que vamos a necesitar
    private String titulo;
    private Autor autor; // Creamos las variables que vamos a necesitar
    private double precio; // Creamos las variables que vamos a necesitar
    private String categoria;
    public Libro() { // Constructor1 
    }
     public Libro(int ISBN, String titulo, Autor autor, double precio, String categoria) { // Constructor3 para el punto 12 
      this.ISBN = ISBN; // Le damos las variables
        this.titulo = titulo; // Le damos las variables
        this.autor = autor; // Le damos las variables
        this.precio = precio; // Le damos las variables
        this.categoria = categoria; // Le damos las variables
     }
     
     /**
     * @param ISBN
     * @param titulo
     * @param autor
     * @param precio
      */
    public Libro(int ISBN, String titulo, Autor autor, double precio) { // Constructor 2 
        this.ISBN = ISBN; // Le damos las variables
        this.titulo = titulo; // Le damos las variables
        this.autor = autor; // Le damos las variables
        this.precio = precio; // Le damos las variables
    }
    
    public Libro(String categoria) { // Constructor 2 
        this.categoria = categoria; // Le damos las variables
        
    }
    
    /**
     * @return el valor de ISBN
     */
    public int getISBN() {
        return ISBN;
    }
    
    /**
     * @param ISBN
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    /**
     * @return el valor de titulo
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * @return el valor de autor
     */
    public Autor getAutor() {
        return autor;
    }
    
    /**
     * @param autor
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    /**
     * @return el valor de precio
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * @return el valor de categoria
     */
    public String getCategoria() {
        return categoria;
    }
    
    /**
     * @param categoria
     */
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