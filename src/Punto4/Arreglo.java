package Punto4;

import java.util.Scanner;

public class Arreglo {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        int B[]=new int[10];
        System.out.println("Ingrese 10 numeros para el vector ");
        for( int i=0;i<B.length;i++){
            B[i]=scan.nextInt();
        }
        mostrarVector(B);
        
        System.out.println("El numero mayor del vector es: "+mostrarMayor(B));
        System.out.println("El numero menor del vector es: "+mostrarMenor(B));
        System.out.println("El promedio es: "+ mostrarPromedio(B));
    }
    public static void mostrarVector(int[] B){
        System.out.println("Los datos el vector son:");
        for (int j=0;j<B.length;j++){
            System.out.println(B[j]);
        }
    }
    public static int mostrarMayor(int [] B){
        int mayor=0;
        boolean band=true;
        for (int i=0;i<B.length;i++){
            if(band){
                mayor=B[i];
                band=false;    
            }
            else{
                if (B[i]>mayor){
                    mayor=B[i];
                }
            }
        }
        return mayor;
    }
    public static int mostrarMenor(int [] B){
        int menor=0;
        boolean band=true;
        for (int i=0;i<B.length;i++){
            if(band){
                menor=B[i];
                band=false;    
            }
            else{
                if (B[i]<menor){
                    menor=B[i];
                }
            }
        }
        return menor;
    }
    public static double mostrarPromedio(int [] B){
        int suma=0,cont=0;
        double promedio;
        
        for (int i=0;i<B.length;i++){
           suma=suma+B[i];
           cont++;
        }
        promedio= (suma/cont);
        return promedio;
    }
}
