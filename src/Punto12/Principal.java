
package Punto12;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
     Scanner S = new Scanner(System.in);
     int opcion1,opcion2, opcion3;
     int i = 0;  

    ArrayList <Libro> listaLibro = new ArrayList();
    listaLibro.add(new Libro(123, "Cartero", "Charles Bukowski", 919.99,"Novela"));
    listaLibro.add(new Libro(123, "Factótoum", "Charles Bukowski", 932.99,"Novela"));
    listaLibro.add(new Libro(123, "Pulp", "Charles Bukowski", 995.99,"Novela"));
    listaLibro.add(new Libro(123, "El Mítico Hombre-Mes", "Frederick Brooks", 50.99,"Programación"));
    listaLibro.add(new Libro(123, "No me hagas pensar", "Steve Krug", 132.99,"Programación"));
    listaLibro.add(new Libro(123, "El libro negro del programador", "Rafael Gómez Blanes", 132.99,"Programación"));
    listaLibro.add(new Libro(123, "La Galatea", "Miguel de Cervantes", 219.99,"Literatura"));
    listaLibro.add(new Libro(123, "Don Quijote de la Mancha", "Miguel de Cervantes", 519.99,"Literatura"));
    listaLibro.add(new Libro(123, "Rinconete y Cortadillo", "Miguel de Cervantes", 1219.99,"Literatura"));
    
     
                
     ArrayList <String> listaCategoria = new ArrayList()   ;
      listaCategoria.add("Novela");
      listaCategoria.add("Programación");
      listaCategoria.add("Literatura");
        
     ArrayList <String> listaAutor = new ArrayList();
     listaAutor.add("Steve Krug");
     listaAutor.add("Charles Bukowski");
     listaAutor.add("Rafael Gómez Blanes");
     listaAutor.add("Frederick Brooks");
     listaAutor.add("Miguel de Cervantes");
     
     
   
     do{
        System.out.println("Elija 1 para buscar por categorias o título");
        System.out.println("Elija 2 para buscar por autor");
        System.out.println("Ingrese una opción: ");
        opcion1 = S.nextInt(); 
        } while (opcion1 != 1  && opcion1 != 2);
   
    switch (opcion1) {
        case 1: 
          
            System.out.println("Las categorias son: ");
            while (i < listaCategoria.size()){
                System.out.println(listaCategoria.get(i));
               i++;
            }
            do{
            System.out.println("Pulse 1 para ver los libros de la categoria Novela");
            System.out.println("Pulse 2 para ver los libros de la categoria Programación");
            System.out.println("Pulse 3 para ver los libros de la categoria Literatura");
            System.out.println("Pulse 4 para ver por título");
            System.out.println("Pulse 5 para salir");
            opcion2 = S.nextInt();
            }while(opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 !=4 && opcion2 != 5 );
            switch (opcion2){
                case 1: 
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
              
                case 2: 
                    String programacion = "Programación1";
                    System.out.println("------------------------------------------------------");
                    System.out.println("ISBN"+"           \t"+"Nombre"+"           \t"+"Autor"+"               \t"+"Precio");
                    System.out.println("------------------------------------------------------");
                    for (Libro e: listaLibro ){ 
                         if(programacion.equals(e.getCategoria())){
                         //System.out.println(e.mostrarLibro());
                         e.mostrarLibro();
                        }
                    }break;
                case 3: 
                    String literatura = "Literatura";
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("ISBN"+"           \t"+"Nombre"+"              \t"+"Autor"+"             \t"+"Precio");
                    System.out.println("------------------------------------------------------------------------------");
                    for (Libro e: listaLibro){
                        if(literatura.equals(e.getCategoria()) ){
                           // System.out.println(e.mostrarLibro());
                           e.mostrarLibro();
                        }
                    }break;
                case 4:
                    
                    for( Libro e: listaLibro){
                        System.out.println(e.mostrarTitulo());
                    } break;
                case 5: 
                    break;
                default: 
                        System.out.println("Error, intente otra vez");}
            break;
        case 2: 
            i = 0;
           
            while (i < listaAutor.size()){
                System.out.println(listaAutor.get(i));
            i++;
                }break;
        default:  
            System.out.println("El valor ingresado es incorrecto, intente nuevamente.");
    }
    }
}



