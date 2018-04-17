/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creamos un objeto de tipo Scanner 
        Scanner ss = new Scanner(System.in); // Creamos un objeto de tipo Scanner 
        Libro objLibro = new Libro(); 
    
           int ISBN; //Creamos las variables para introducir en el construcor
           int a,b; // a y b serán variables para guradar datos de los bucles  do while
          String titulo, autor; //Creamos las variables para introducir en el construcor
          double precio ; //Creamos las variables para introducir en el construcor
          char resp; // Creamos la variable para el bucle 
        ArrayList<Libro> LibroArrayList = new ArrayList<>(); //Creamos una ArrayList de tipo objeto (Libro) y le asignamos un nombre
        
        
        do { // Usamos un do while para que el usuario ingrese solo 2 opciones
      //System.out.println("Ingrese 1 para poner un nuevo libro: "); // Imprimimos la opción uno
      //System.out.println("Ingrese 2 para salir y visualizar."); // Imprimimos la opción dos
      //System.out.println("Ingrese una opción: "); // Imprimimos esta cadena para que ingrese el número
      //a = s.nextInt(); // Guardamos la opción ingresada en la variable a 
        System.out.println("Ingrese el ISBN: "); // Pedimos el ISBN del libro
        ISBN = s.nextInt(); // Guardamos el ISBN en la variable 
        do{
            System.out.println("Ingrese el título: "); // Pedimos el título del libro
            titulo = s.next(); // Guardamos en título en la variable            
        }while("".equals(titulo));
        do{
            System.out.println("Ingrese el autor: "); // Pedimos el autor del libro
            autor = s.next(); // Guardamos el autor en la variable   
        }while("".equals(autor));
        do{
            System.out.println("Ingrese el precio: "); // Pedimos el precio del libro
            precio = s.nextDouble();  // Guardamos el precio en la variable  
        }while(precio<0);
        
        LibroArrayList.add(new Libro(ISBN, titulo, autor, precio)); // Al LibroArrayList creado le añadimos un objeto de Libro y le damos los valores al constructor de libro
        System.out.print("Desea seguir ingresando datos S/N : ");
        resp = s.next().charAt(0);
  }while(resp != 'n' && resp!='N'); // El bucle se repetirá hasta que sea distinto de n
        System.out.println("    ");
        System.out.println("-----------------------------------");
        System.out.println("ISBN"+"\t"+"Nombre"+"\t"+"Autor"+"\t"+"Precio");
        System.out.println("-----------------------------------");
             for (Libro e: LibroArrayList){ // Usamos un bucle para mostrar los libros 
                      e.mostrarLibro();// Mostramos el total de todos los libros con el método mostrarLibro de la clase Libro


   /*do { // Usamos un do while para que el usuario ingrese solo 2 opciones
      System.out.println("Ingrese 1 para poner un nuevo libro: "); // Imprimimos la opción uno
      System.out.println("Ingrese 2 para salir y visualizar."); // Imprimimos la opción dos
      System.out.println("Ingrese una opción: "); // Imprimimos esta cadena para que ingrese el número
      a = S.nextInt(); // Guardamos la opción ingresada en la variable a 
  }while(a > 2); // El bucle se repetirá hasta que a sea igual a 1 o 2 
 
      if ( a == 1){ // Usamos un if para decir que si a es igual a 1, entonces procederemos a crear el/los libros
          for(int i = 1 ; i <= a ; i++){ // El contador inicializa en 1 y decimos que mientras el contador sea menor o igual a a haremos lo siguiente
            System.out.println("Ingrese el ISBN: "); // Pedimos el ISBN del libro
            ISBN = S.nextInt(); // Guardamos el ISBN en la variable 
             System.out.println("Ingrese el título: "); // Pedimos el título del libro
            titulo = SS.nextLine(); // Guardamos en título en la variable
            System.out.println("Ingrese el autor: "); // Pedimos el autor del libro
            autor = SS.nextLine(); // Guardamos el autor en la variable
            System.out.println("Ingrese el precio: "); // Pedimos el precio del libro
            precio = S.nextDouble();  // Guardamos el precio en la variable
              LibroArrayList.add(new Libro(ISBN, titulo, autor, precio)); // Al LibroArrayList creado le añadimos un objeto de Libro y le damos los valores al constructor de libro
        do { // Usamos un do while para preguntar si quiere seguir o salir
      System.out.println("Ingrese 1 para poner un nuevo libro: "); // Imprimimos la opción uno
      System.out.println("Ingrese 2 para salir y visualizar.");// Imprimimos la opción dos
      System.out.println("Ingrese una opción: "); // Imprimimos esta cadena para que ingrese el número
      b = S.nextInt(); // El valor que el usuario ingrese se guardará en la variable b
  }while(b > 2); // Se repetirá hasta que b sea 1 o 2
            if (b == 1){ // Usamos un if para decir que, si la opción es 1, crearemos otro libro  
                        for (Libro e: LibroArrayList){ // Usamos el bucle for para ir visualizando los libros creados y que están dentro de LibroArrayList
          System.out.println(e.mostrarLibro()); // Mostramos los libros que hay usando el método mostrarLibro de la clase Libro
       } // Se cierra el bucle for que muestra los libros ingresados
                a++; // A la variable a se le sumará 1
            } // Se cierra el if que compara  b == 1
            if (b == 2){     // Si la opción ingresada por el usuario es 2, no haremos nada
            } // Se cierra el if que compara b == 2 
} // Se cierra el primer bucle for que nos permite ingresar un nuevo libro            
      } // Se cierra el primer if que lo usamos para saber si el usuario quiere ingresar un libro a == 1
      else { // Este else es del primer if, que es la opción distinta de 1
          System.out.println("Aún no hay ningún libro para mostrar."); // Imprimimos que aún no ingresó un libro
                  }              
             for (Libro e: LibroArrayList){ // Usamos un bucle para mostrar los libros 
          System.out.println(e.mostrarLibro());// Mostramos el total de todos los libros con el método mostrarLibro de la clase Libro
       
       }    // Fin del bucle que muestra los libros*/
    
    } 
    }

}