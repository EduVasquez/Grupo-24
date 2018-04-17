
package Punto12;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
     Scanner S = new Scanner(System.in);
     int opcion1,opcion2; 
     int i = 0;  
// Definimos el ArrayList de la clase libro, y en el constructor del libro le damos los valores
    ArrayList <Libro> listaLibro = new ArrayList(); 
    listaLibro.add(new Libro(456, "Cartero", "Charles Bukowski", 919.99,"Novela"));
    listaLibro.add(new Libro(123, "Factótoum", "Charles Bukowski", 932.99,"Novela"));
    listaLibro.add(new Libro(412, "Pulp", "Charles Bukowski", 995.99,"Novela"));
    listaLibro.add(new Libro(345, "El Mítico Hombre-Mes", "Frederick Brooks", 50.99,"Programación"));
    listaLibro.add(new Libro(765, "No me hagas pensar", "Steve Krug", 132.99,"Programación"));
    listaLibro.add(new Libro(9879, "El libro negro del programador", "Rafael Gómez Blanes", 132.99,"Programación"));
    listaLibro.add(new Libro(867, "La Galatea", "Miguel de Cervantes", 219.99,"Literatura"));
    listaLibro.add(new Libro(9832, "Don Quijote de la Mancha", "Miguel de Cervantes", 519.99,"Literatura"));
    listaLibro.add(new Libro(4562, "Rinconete y Cortadillo", "Miguel de Cervantes", 1219.99,"Literatura"));
    
     
    // Definimos el ArrayList de tipo String que guardarán las categorías de los libros
     ArrayList <String> listaCategoria = new ArrayList();
      listaCategoria.add("Novela");
      listaCategoria.add("Programación");
      listaCategoria.add("Literatura");
    // Definimos el ArrayList de tipo String que guardarán los nombres de los autores 
     ArrayList <String> listaAutor = new ArrayList();
     listaAutor.add("Steve Krug");
     listaAutor.add("Charles Bukowski");
     listaAutor.add("Rafael Gómez Blanes");
     listaAutor.add("Frederick Brooks");
     listaAutor.add("Miguel de Cervantes");
     // Usamos un bucle do while para que sólo ingresen dos opciones, 1 o 2 
     
     do{
        System.out.println("Elija 1 para buscar por categorias o título");
        System.out.println("Elija 2 para buscar por autor");
        System.out.println("Ingrese una opción: ");
        opcion1 = S.nextInt(); 
        } while (opcion1 != 1  && opcion1 != 2);
   // Cuando ingrese una opción 1 o 2, se irá al switch  
    switch (opcion1) {
        case 1:  // Si ingresa 1 se le mostrará las categorías 
          
            System.out.println("Las categorias son: ");
            while (i < listaCategoria.size()){ // 
                System.out.println(listaCategoria.get(i));
               i++;
            }
            // Se le preguntará si desea ver los libros de alguna categoría, si quiere ver por autor o si quiere salir
            do{  // Usamos un bucle do while para que sólo pueda ingresar los valores pedidos (1,2,3,4,5)
            System.out.println("Pulse 1 para ver los libros de la categoria Novela");
            System.out.println("Pulse 2 para ver los libros de la categoria Programación");
            System.out.println("Pulse 3 para ver los libros de la categoria Literatura");
            System.out.println("Pulse 4 para ver por título");
            System.out.println("Pulse 5 para salir");
            opcion2 = S.nextInt(); // El usuario ingresará una opción y se la guardará en opcion2, que se usará para otro switch
            }while(opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 !=4 && opcion2 != 5 );
            // Usamos otro switch para mostrar los libros de una categoría específica, para ver por título o para salir
            switch (opcion2){ 
                case 1:  // Si ingresa 1, podrá ver todos los libros de la categoría Novela
                    String novela = "Novela";
                    System.out.println("-------------------------------------------------");
                    System.out.println("ISBN"+"       \t"+"Nombre"+"       \t"+"Autor"+"        \t"+"Precio");
                    System.out.println("-------------------------------------------------");
                    for (Libro e: listaLibro ){ 
                         if(novela.equals(e.getCategoria())){
                          // System.out.println(e.mostrarLibro);
                         e.mostrarLibro();
                         } 
                    }break;
              
                case 2: // Si ingresa 2, podrá ver todos los libros de la categoría Programación
                    String programacion = "Programación";
                    System.out.println("------------------------------------------------------");
                    System.out.println("ISBN"+"           \t"+"Nombre"+"           \t"+"Autor"+"               \t"+"Precio");
                    System.out.println("------------------------------------------------------");
                    for (Libro e: listaLibro ){ 
                         if(programacion.equals(e.getCategoria())){
                         //System.out.println(e.mostrarLibro());
                         e.mostrarLibro();
                        }
                    }break;
                case 3:  // Si ingresa 1, podrá ver todos los libros de la categoría Literatura
                    String literatura = "Literatura";
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("ISBN"+"           \t"+"Nombre"+"              \t"+"Autor"+"             \t"+"Precio");
                    System.out.println("------------------------------------------------------------------------------");
                    for (Libro e: listaLibro){
                        if(literatura.equals(e.getCategoria()) ){
                           
                           e.mostrarLibro();
                        }
                    }break;
                case 4: // Si ingresa 4 se mostrará todos los títulos de los libros
                    
                    for( Libro e: listaLibro){
                        System.out.println(e.mostrarTitulo());
                    } break;
                case 5: // Si ingresa 5 saldrá y terminará el programa
                    break;
                default: 
                        System.out.println("Error, intente otra vez");
            } // final del segundo switch
            break;
            
        case 2: // Si ingresa 2, se le mostrará todos los autores de los libros que hay
            i = 0;
           
            while (i < listaAutor.size()){
                System.out.println(listaAutor.get(i));
            i++;
                }break;
        default:  // Si ingresa un dato erróneo, se le mostrará la siguiente cadena
            System.out.println("El valor ingresado es incorrecto, intente nuevamente.");
    }
    }
}



