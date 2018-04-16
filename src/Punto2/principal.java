package Punto2;
import java.util.Scanner;

/**
 *
 * @author Dalila
 */
public class principal {
    public static void main(String[] args){
        int altura, base,x,y;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresar la cordenada x: ");
        x=scn.nextInt();
        System.out.println("Ingresar la cordenada y: ");
        y=scn.nextInt();
        System.out.println("Ingresar la base: ");
        base= scn.nextInt();
        System.out.println("Ingresar la altura: ");
        altura= scn.nextInt();
        Rectangulo rectangulo = new Rectangulo(x,y,base,altura);
        System.out.println("La primera cordenada del punto es: ("+x+","+y+")");
        int nuevax =rectangulo.calularPuntoUno();
        System.out.println("La segunda cordenada del punto es: ("+nuevax+","+y+")");
        int nuevay=rectangulo.calularPuntoDos();
        System.out.println("La tercera cordenada del punto es: ("+nuevax+","+nuevay+")");
        System.out.println("La cuarta cordenada del punto es: ("+x+","+nuevay+")");
        System.out.println("El perimetro del rectangulo es: "+ rectangulo.calcularPerimetro());
        System.out.println("La superficie del rectangulo es: "+rectangulo.calcularSuperficie());
    }
}
