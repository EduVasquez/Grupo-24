
package Punto9;


import Punto8.Libro;
import java.util.ArrayList;
import java.util.Scanner;

// El programa consiste en buscar un libro 
// El usuario ingresará el nombre de un libro y se va a comparar los nombres con los libros que ya están en un arreglo (en total 9 libros)

public class Principal {
    public static void main(String[] args) {
        
   
    Scanner S = new Scanner (System.in); // Se crea un objeto de tipo Scanner 
    // Se usará la clase libro del punto 8 para crear objetos
    Libro objLibro1 = new Libro(683,"El rey Leon","Pedrouno", 156.99); // Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro2 = new Libro(683,"Marvel Los Vengadores","PedroDos", 232.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro3 = new Libro(683,"Harry Potter","PedroTres", 138.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro4 = new Libro(683,"Iron Man 3","PedroCuatro", 312.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro5 = new Libro(683,"Skyfal","PedroCinco", 832.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro6 = new Libro(683,"Toy Story 3","PedroSeis", 732.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro7 = new Libro(683,"El caballero oscuro","PedroSiete", 141.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro8 = new Libro(683,"Transformers","PedroOcho", 210.99);// Se crea un objeto de la clase Libro y se le da los valores
    Libro objLibro9 = new Libro(683,"El principito","PedroNueve", 200.99);// Se crea un objeto de la clase Libro y se le da los valores
    
   ArregloDeLibro arregloDeLibro = new ArregloDeLibro(); // Se crea un objeto (que es un arreglo) de la clase ArregloDeLibro
   arregloDeLibro.getArreglo()[0] = objLibro1;  // Se le da los valores que tiene el objLibro1
   arregloDeLibro.getArreglo()[1] = objLibro2;  // Se le da los valores que tiene el objLibro2
   arregloDeLibro.getArreglo()[2] = objLibro3;  // Se le da los valores que tiene el objLibro3
   arregloDeLibro.getArreglo()[3] = objLibro4;  // Se le da los valores que tiene el objLibro4
   arregloDeLibro.getArreglo()[4] = objLibro5;  // Se le da los valores que tiene el objLibro5
   arregloDeLibro.getArreglo()[5] = objLibro6;  // Se le da los valores que tiene el objLibro6
   arregloDeLibro.getArreglo()[6] = objLibro7;  // Se le da los valores que tiene el objLibro7
   arregloDeLibro.getArreglo()[7] = objLibro8;  // Se le da los valores que tiene el objLibro8
   arregloDeLibro.getArreglo()[8] = objLibro9;  // Se le da los valores que tiene el objLibro9
  
   
  System.out.println("Ingrese el nombre del libro que quiere buscar: "); // Le pedimos al usuario que ingrese el nombre del libro
  String buscar = S.nextLine(); // Guardamos la cadena en la variable buscar
 
    arregloDeLibro.buscarLibro(buscar); // Llamamos al método buscarLibro y le damos la cadena que ingresó el usuario
    
    
} }
