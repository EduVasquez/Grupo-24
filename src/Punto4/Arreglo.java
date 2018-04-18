package Punto4;

import java.util.Scanner;

public class Arreglo {
   
    public void mostrarVector(){ // Creamos el método mostrarVector
        
        Scanner scan=new Scanner(System.in); // Se crea un objeto de tipo scanner 
        int vector[]=new int[10]; // Se define el arreglo 
        System.out.println("Ingrese 10 numeros para el vector "); 
        for( int i=0;i<vector.length;i++){ 
            vector[i]=scan.nextInt(); // Guardamos los números ingresados en cada posición del vector
        }
        
        System.out.println("Los datos el vector son:");
        for (int j=0;j<vector.length;j++){ 
            System.out.println(vector[j]); // Mostrará los datos del vector de cada posición
        }
        
        System.out.println("El numero mayor del vector es: "+mostrarMayor(vector)); // Usamos el método mostrarMayor 
        System.out.println("El numero menor del vector es: "+mostrarMenor(vector)); // Usamos el método mostrarMenor
        System.out.println("El promedio es: "+ mostrarPromedio(vector)); // Usamos el método mostrarPromedio
    }
    public static int mostrarMayor(int [] B){ // Creamos el método mostrarMayor que comparará cada posición del vector y dará por resultado el mayor 
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
    public static int mostrarMenor(int [] B){ // Creamos el método mostrarMenor que comparará cada posición del vector y dará por resultado el menor
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
    public static double mostrarPromedio(int [] B){ // Creamos el método mostrarPromedio, sumará todos los números de cada posición y lo dividirá por el número total de posiciónes
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
