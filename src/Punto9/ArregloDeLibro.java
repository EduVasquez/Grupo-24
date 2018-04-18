/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9;

import Punto8.Libro;

public class ArregloDeLibro { // Creamos la clase ArregloDeLibro que será un arreglo
    private Libro[] arreglo; 

    public ArregloDeLibro(){ // Definimos el tamaño del arreglo 
        arreglo = new Libro [9];
    }
    
    public Libro[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Libro[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public void buscarLibro(String buscar){ // Definimos el método buscarLibro que pedirá un parámetro que lo ingresará el usuario
        boolean boleano = false;
         int i = 0; // Definimos un contador 
         String titulo;
        while(i < arreglo.length  && boleano == false){ //Usamos un bucle while para sacar el título de cada libro 
   titulo = arreglo[i].getTitulo(); // Le damos el título cada libro a la variable titulo         
    buscar = buscar.trim(); // Le sacamos los espacios a la cadena que ingresó el usuario  y lo guardamos en la variable buscar
    buscar = buscar.toLowerCase(); // A buscar lo llevamos para minúsculas
    titulo = titulo.trim(); // Le sacamos los espacios a titulo
    titulo = titulo.toLowerCase(); // A titulo lo llevamos a minusculas
     if (titulo.equals(buscar)){ // Si el la variable titulo es igual a la variable buscar, boleano se convierte en verdadero y podremos salir del bucle
         boleano = true;  
        }
     else{
         boleano = false; // 
     }
     i++;  // Aumentamos el contador en 1 
      } // 
    
    if(boleano == true){ // Si boleano se hizo verdadero entonces encontró el libro 
        System.out.println("El libro fue encontrado y estos son sus datos: ");
        System.out.println("El ISBN es: " +arreglo[i-1].getISBN());
        System.out.println("El autor del libro: "+arreglo[i-1].getAutor());
        System.out.println("El título: " +arreglo[i-1].getTitulo());
        System.out.println("Y el precio es: "+arreglo[i-1].getPrecio());
    // Imprimimos todos los valores del libro y -1 porque al finalizar el bucle while, se le aumentó 1 a i
     } 
    else{
        System.out.println("No se encontró el libro."); // Si boleano es falso, es porque no se encontró lo que el usuario buscó 
    }  
    }
}
