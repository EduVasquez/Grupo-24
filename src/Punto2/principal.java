package Punto2;
import java.util.Scanner;

/**
 *
 * @author Dalila
 */
public class principal {
    public static void main(String[] args){
        int altura, base,x,y; // Definimos las variables que le daremos al constructor 
        Scanner scn = new Scanner(System.in); // Creamos un objeto scn de Scanner
        System.out.println("Ingresar la cordenada x: ");
        x=scn.nextInt();  // Guardamos la coordenada x  en la variable 
        System.out.println("Ingresar la cordenada y: ");
        y=scn.nextInt();  // Guardamos la coordenada y  en la variable 
        System.out.println("Ingresar la base: ");
        base= scn.nextInt(); // Guradamos la base 
        System.out.println("Ingresar la altura: ");
        altura= scn.nextInt(); // Guardamos la altura 
        Rectangulo rectangulo = new Rectangulo(x,y,base,altura); // Creamos un objeto rectangulo de la clase Rectangulo y le damos los valores al constructor
        System.out.println("La primera cordenada del punto es: ("+x+","+y+")"); // Devolvemos la coordenada del primer punto
        int nuevax =rectangulo.calularPuntoUno(); // Guardamos el valor que da el método calcularPuntoUno en la variable nuevax
        System.out.println("La segunda cordenada del punto es: ("+nuevax+","+y+")"); // Mostramos el segundo punto
        int nuevay=rectangulo.calularPuntoDos(); // Guardamos el valor que da el método calcularPuntoDos en la variable nuevay
        System.out.println("La tercera cordenada del punto es: ("+nuevax+","+nuevay+")"); // Imprimimos la tercera coordenada
        System.out.println("La cuarta cordenada del punto es: ("+x+","+nuevay+")"); // Imprimimos la cuarta coordenada
        System.out.println("El perimetro del rectangulo es: "+ rectangulo.calcularPerimetro()); // Imprimimos el perimetro del rectangulo con el método calcularPerimetro
        System.out.println("La superficie del rectangulo es: "+rectangulo.calcularSuperficie()); // Imprimimos la superficie del rectangulo con el método calcularSuperficie
    }
}
