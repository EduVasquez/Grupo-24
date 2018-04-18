
package Punto12;


import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
            
// Definimos el ArrayList de la clase libro, y en el constructor del libro le damos los valores

    Libro libro1 = new Libro(456, "Cartero",new Autor("Charles","Bukowski"), 919.99,"Novela");
    Libro libro2 = new Libro(123, "Factótoum",new Autor("Charles","Bukowski"), 932.99,"Novela");
    Libro libro3 = new Libro(412, "Pulp",new Autor("Charles","Bukowski"), 995.99,"Novela");
    Libro libro4 = new Libro(345, "El Mítico Hombre-Mes", new Autor("Frederick","Brooks"), 50.99,"Programación");
    Libro libro5 = new Libro(765, "No me hagas pensar", new Autor("Steve","Krug"), 132.99,"Programación");
    Libro libro6 = new Libro(9879, "El libro negro del programador",new Autor("Rafael Gómez","Blanes"), 132.99,"Programación");
    Libro libro7 = new Libro(867, "Relatos cortos",new Autor("Antón", "Chéjovl"), 219.99,"Literatura");
    Libro libro8 = new Libro(9832, "Don Quijote de la Mancha", new Autor("Miguel","Cervantes"), 519.99,"Literatura");
    Libro libro9 = new Libro(4562, "Nostromo",new Autor("Joseph","Conrad"), 1219.99,"Literatura");
    
    GestorLibros gl = new GestorLibros();
    
    gl.agregarLibro(libro1);
    gl.agregarLibro(libro2);
    gl.agregarLibro(libro3);
    gl.agregarLibro(libro4);
    gl.agregarLibro(libro5);
    gl.agregarLibro(libro6);
    gl.agregarLibro(libro7);
    gl.agregarLibro(libro8);
    gl.agregarLibro(libro9);
    
     GestorAutor ga = new GestorAutor();
     
    ga.agregarAutor(libro1.getAutor());
    ga.agregarAutor(libro2.getAutor());
    ga.agregarAutor(libro3.getAutor());
    ga.agregarAutor(libro4.getAutor());
    ga.agregarAutor(libro5.getAutor());
    ga.agregarAutor(libro6.getAutor());
    ga.agregarAutor(libro7.getAutor());
    ga.agregarAutor(libro8.getAutor());
    ga.agregarAutor(libro9.getAutor());
    
    // Llamamos el metodo agregarCategoria de tipo String que guardarán las categorías de los libros
    gl.agregarCategoria("Novela");
    gl.agregarCategoria("Programación");
    gl.agregarCategoria("Literatura");
         
    gl.Buscar(ga);
    
}
}



