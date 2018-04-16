
package Punto9;


import Punto8.Libro;
import java.util.ArrayList;
import java.util.Scanner;

// El programa consiste en buscar un libro 
// El usuario ingresará el nombre de un libro y se va a comprar los nombres con los libros que ya están en un arreglo (en total 9 libros)

public class Principal {
    public static void main(String[] args) {
     Scanner S = new Scanner(System.in);  // Creamos un objeto de tipo Scanner
     boolean boleano = false; // Una variable boolean
   String titulo=""; // El título que guardará los títulos de las películas
      Libro NuevoLibro[] = new Libro[9]; // Definimos un arreglo y le deremos los datos al constructor de la clase Libro   
      NuevoLibro[0] = new Libro(683, "El rey Leon", "Pedrouno", 9932.99); // Le damos en la posición 0 los datos al constructor
      NuevoLibro[1] = new Libro(686, "Marvel Los Vengadores", "Pedrodos", 9932.99); // Le damos en la posición 1 los datos al constructor
      NuevoLibro[2] = new Libro(688, "Harry Potter", "Pedrotres", 9932.99); // Le damos en la posición 2 los datos al constructor
      NuevoLibro[3] = new Libro(689, "Frozen", "Pedrocuatro", 9932.99); // Le damos en la posición 3 los datos al constructor
      NuevoLibro[4] = new Libro(644, "Iron Man 3", "Pedrocingo", 9932.99); // Le damos en la posición 4 los datos al constructor
      NuevoLibro[5] = new Libro(624, "Skyfal", "Pedroseis", 9932.99); // Le damos en la posición 5 los datos al constructor
      NuevoLibro[6] = new Libro(584, "Toy Story 3", "Pedrosiete", 9932.99); // Le damos en la posición 6 los datos al constructor
      NuevoLibro[7] = new Libro(784, "El caballero oscuro", "Pedroocho", 9932.99); // Le damos en la posición 7 los datos al constructor
      NuevoLibro[8] = new Libro(13284, "Transformers", "Pedronueve", 9932.99); // Le damos en la posición 8 los datos al constructor
      
        System.out.println("Ingrese el nombre del libro que quiere buscar: "); // Le pedimos al usuario que ingrese el nombre del libro
        String buscar = S.nextLine(); // Guardamos la cadena en la variable buscar
   int i = 0; // Definimos un contador 
        while(i < NuevoLibro.length  && boleano == false){ //Usamos un bucle while para sacar el título de cada libro 
   titulo = NuevoLibro[i].getTitulo(); // Le damos el título cada libro a la variable titulo         
    buscar = buscar.trim(); // Le sacamos los espacios a la cadena que ingresó el usuario 
    buscar = buscar.toLowerCase(); // A buscar lo llevamos para minúsculas
    titulo = titulo.trim(); // Le sacamos los espacios a titulo
    titulo = titulo.toLowerCase(); // A titulo lo llevamos a minusculas
     if (titulo.equals(buscar)){ // Si el la variable titulo es igual a la variable buscar boleano se convierte en verdadero y podremos salir del bucle
         boleano = true;  
        }
     else{
         boleano = false; // 
     }
     i++;  // Aumentamos el contador en 1 
      } // 
    
    if(boleano == true){ // Si boleano se hizo verdadero entonces encontró el libro
        System.out.println("El libro fue encontrado y estos son sus datos: " 
    +"El ISBN es: "+NuevoLibro[i-1].getISBN()+", El autor del libro: "+NuevoLibro[i-1].getAutor()+", El título: "
    +NuevoLibro[i-1].getTitulo()+" y el precio es: "+NuevoLibro[i-1].getPrecio());
    } // Imprimimos todos los valores del libro y -1 porque al finalizar el bucle while, se le aumentó 1 a i
    else{
        System.out.println("No se encontró el libro."); // Si boleano es falso, es porque no se encontró lo que el usuario buscó 
    }
    
    
    
    
    }
}