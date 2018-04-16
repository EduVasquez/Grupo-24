
package Punto12;

import Punto8.Libro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      int opcion, opcion2; // definimos variables 
      int i = 0; // definimos un contador 
      boolean boleano = false; // 
      String contenedor, titulo, buscar,buscarautor,autor; //
      Scanner S = new Scanner(System.in); // Creamos un objeto de tipo Scanner
      Scanner s = new Scanner(System.in); // Creamos un objeto de tipo Scanner
      Scanner s1 = new Scanner(System.in);// Creamos un objeto de tipo Scanner
        Libro NuevoLibro[] = new Libro[9]; // Definimos un arreglo y le daremos los datos al constructor de la clase Libro   
      NuevoLibro[0] = new Libro(683, "El rey Leon", "Pedrouno", 9932.99, "Biografias"); // Le damos en la posición 0 los datos al constructor
      NuevoLibro[1] = new Libro(686, "Marvel Los Vengadores", "Pedrodos", 9932.99,"Biografias"); // Le damos en la posición 1 los datos al constructor
      NuevoLibro[2] = new Libro(688, "Harry Potter", "Pedrotres", 9932.99,"Biografias"); // Le damos en la posición 2 los datos al constructor
      NuevoLibro[3] = new Libro(689, "Frozen", "Pedrocuatro", 9932.99,"Literatura"); // Le damos en la posición 3 los datos al constructor
      NuevoLibro[4] = new Libro(644, "Iron Man 3", "Pedrocingo", 9932.99,"Literatura"); // Le damos en la posición 4 los datos al constructor
      NuevoLibro[5] = new Libro(624, "Skyfal", "Pedroseis", 9932.99,"Literatura"); // Le damos en la posición 5 los datos al constructor
      NuevoLibro[6] = new Libro(584, "Toy Story 3", "Pedrosiete", 9932.99,"Cientificos"); // Le damos en la posición 6 los datos al constructor
      NuevoLibro[7] = new Libro(784, "El caballero oscuro", "Pedroocho", 9932.99,"Cientificos"); // Le damos en la posición 7 los datos al constructor
      NuevoLibro[8] = new Libro(13284, "Transformers", "Pedronueve", 9932.99,"Cientificos"); // Le damos en la posición 8 los datos al constructor
     // Le decimos al usuario que elija una opción 
        System.out.println("Ingrese 1 si quiere buscar por categoría "); 
        System.out.println("Ingrese 2 si quiere buscar por solo por título");
        System.out.println("Ingrese 3 si quiere buscar por solo por autor");
        System.out.println("Ingrese una opción: ");
        opcion = S.nextInt(); // Guardamos la opción ingresada por el usuario en la variable
     
      switch (opcion){ // Usamos un switch para elegir los casos 
          case 1:  // Si eligió el 1 se le preguntara el tipo de libro que quiere buscar 
               System.out.println("Ingrese 1 si quiere buscar libros de Biografias ");
               System.out.println("Ingrese 2 si quiere buscar libros de Literaturas");
               System.out.println("Ingrese 3 si quiere buscar libros de Cientificos");            
               System.out.println("Ingrese una opción");
               opcion2 = S.nextInt(); // Guardaremos el tipo de libro que quiere buscar el usuario 
                    switch(opcion2){ // Usamos otro switch para mostrar cada una de las categorias 
                        case 1:  // El caso 1 va a imprimir todos los libros de la categoria Biografias
                     while(i < NuevoLibro.length  ){ // Usaremos un bucle while para ir imprimiendo cada parte de las categorías
                        contenedor = NuevoLibro[i].getCategoria(); // Guardamos las categorías en una variable contenedor, para poder compararlas más adelante
                         if(contenedor.equals("Biografias")){ // Comparamos el contenedor con la categoria Biografias, si son iguales se le va a imprimir todos los libros de la categoria Biografias
                             System.out.println("Los siguientes libros son de la categoria Biografias : "+NuevoLibro[i].getTitulo()); // Se les imprime el nombre de las películas de la categoria Bigrafia                            
                         }  
                        i++; // aumentamos el contador en 1
                     }   
                        case 2: //  El caso 2 va a imprimir todos los libros de la categoria Literatura
                            while(i < NuevoLibro.length   ){// Usaremos un bucle while para ir imprimiendo cada parte de las categorías
                        contenedor = NuevoLibro[i].getCategoria(); // Guardamos las categorías en una variable contenedor, para poder compararlas más adelante
                         if(contenedor.equals("Literatura")){
                             System.out.println("Los siguientes libros son de la categoria Literatura  : "+NuevoLibro[i].getTitulo());       // Se les imprime el nombre de las películas de la categoria Literatura                                            
                         } i++;
                    }
                        case 3: // El caso 3 va a imprimir todos los libros de la categoria Cientificos
                                 while(i < NuevoLibro.length   ){// Usaremos un bucle while para ir imprimiendo cada parte de las categorías
                        contenedor = NuevoLibro[i].getCategoria();
                         if(contenedor.equals("Cientificos")){
                             System.out.println("Los siguientes libros son de la categoria Cientificos  : "+NuevoLibro[i].getTitulo());                            
                         } i++;                
                    }
                    } // fin del segundo switch 
                break;   
          case 2: // En el caso dos vamos a pedir que ingrese el nombre del libro que quiere buscar y compararemos 
// con todos los nombres de los libros que hay, si hay uno con el mismo nombre, se va a imprimir toda la información de ese libro
              
        System.out.println("Ingrese el nombre del libro que quiere buscar: "); // Le pedimos al usuario que ingrese el nombre del libro
        buscar = s.nextLine();
       while(i < NuevoLibro.length  && boleano == false){ //Usamos un bucle while para sacar el título de cada libro 
   titulo = NuevoLibro[i].getTitulo(); // Le damos el título cada libro a la variable titulo         
    buscar = buscar.trim(); // Le sacamos los espacios a la cadena que ingresó el usuario 
    buscar = buscar.toLowerCase(); // A buscar lo llevamos para minúsculas
    titulo = titulo.trim(); // Le sacamos los espacios a titulo
    titulo = titulo.toLowerCase(); // A titulo lo llevamos a minusculas
     if (titulo.equals(buscar)){ // Si el la variable titulo es igual a la variable buscar boleano se convierte en verdadero y podremos salir del bucle
         boleano = true;  
        }         
     i++;  // Aumentamos el contador en 1 
      } // 
    
    if(boleano == true){ // Si boleano se hizo verdadero entonces encontró el libro
        System.out.println("El libro fue encontrado y estos son sus datos: " 
    +"El ISBN es: "+NuevoLibro[i-1].getISBN()+", El autor del libro: "+NuevoLibro[i-1].getAutor()+", El título: "
    +NuevoLibro[i-1].getTitulo()+" , el precio es: "+NuevoLibro[i-1].getPrecio()+" y su categoria es: "+NuevoLibro[i-1].getCategoria());
    } // Imprimimos todos los valores del libro y -1 porque al finalizar el bucle while, se le aumentó 1 a i
    else{
        System.out.println("No se encontró el libro."); }
              break;
          case 3:  // En el caso 3 vamos a pedir que ingrese el nombre del autor del libro que quiere buscar y compararemos 
// con todos los nombres de los autores que hay, si hay uno con el mismo nombre, se va a imprimir toda la información de ese libro
               System.out.println("Ingrese el autor del libro que quiere buscar: "); // Le pedimos al usuario que ingrese el autor del libro
        buscarautor = s1.nextLine(); // Guardamos el autor en la variable buscarautor
       while(i < NuevoLibro.length  && boleano == false){ //Usamos un bucle while para sacar el autor de cada libro 
   autor = NuevoLibro[i].getAutor(); // Le damos el autor de cada libro a la variable autor         
    buscarautor = buscarautor.trim(); // Le sacamos los espacios a la cadena que ingresó el usuario 
    buscarautor = buscarautor.toLowerCase(); // A buscarautor lo llevamos para minúsculas
    autor = autor.trim(); // Le sacamos los espacios a autor
    autor = autor.toLowerCase(); // A autor lo llevamos a minusculas
     if (autor.equals(buscarautor)){ // Si el la variable autor es igual a la variable buscar boleano se convierte en verdadero y podremos salir del bucle
         boleano = true;  
        }         
     i++;  // Aumentamos el contador en 1 
      } // 
    
    if(boleano == true){ // Si boleano se hizo verdadero entonces encontró el autor del libro
        System.out.println("El libro fue encontrado y estos son sus datos: " 
    +"El ISBN es: "+NuevoLibro[i-1].getISBN()+", El autor del libro: "+NuevoLibro[i-1].getAutor()+", El título: "
    +NuevoLibro[i-1].getTitulo()+" , el precio es: "+NuevoLibro[i-1].getPrecio()+" y su categoria es: "+NuevoLibro[i-1].getCategoria());
    } // Imprimimos todos los valores del libro y -1 porque al finalizar el bucle while, se le aumentó 1 a i
    else{
        System.out.println("No se encontró el libro."); } // Si no hay ningún autor con ese nombre se va a imprimir este mensaje
      break;
          default: 
              System.out.println("Ingreso inválido"); // Si ingresa un número distinto de 1, 2 o 3 se va a imprimir este mensaje
      }
      
    }
}
