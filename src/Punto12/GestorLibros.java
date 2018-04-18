/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dhal_
 */
public class GestorLibros {
    private ArrayList<Libro> libros = new ArrayList();
    private ArrayList<String> categoria = new ArrayList();
    
    /**
     * @return el valor de libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    /**
     * @return el valor de categoria
     */
    public ArrayList<String> getCategoria() {
        return categoria;
    }
    
    
        
    /**
     * @param libros
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    /**
     * @param categoria
     */
    public void setCategoria(ArrayList<String> categoria) {
        this.categoria = categoria;
    }
        
    /**
     * @param categoria
     */
     public void agregarCategoria(String categoria){
        
        this.categoria.add(categoria);
    }
     
     /**
     * @param libros
      */
    public void agregarLibro(Libro libros){
        
        this.libros.add(libros);
    }
    
    
    public void mostrarCategorias(){
        
        System.out.println("-------------------------");
        System.out.println("Las categorias son :");
        System.out.println("-------------------------");

        for ( String cat : this.getCategoria()){    
            System.out.println( "Opcion ["+(this.getCategoria().indexOf(cat)+1)+"]: "+cat );
        }
    }
        
    public void Buscar (GestorAutor ga){
        
        Scanner scn=new Scanner(System.in);
        int resp ;
        System.out.println("Opcion [1] : Buscar por Categorias o Título");
        System.out.println("Opcion [2] : Buscar por Autor");
        System.out.println("Opcion [3] : Salir");
        System.out.println("    ");
        System.out.print("Ingrese una opción : ");
        try{
           resp = scn.nextInt();
    
        switch  (resp) {
    
            case 1 :{
                this.mostrarCategorias();
                System.out.println("    ");
                System.out.print("Elija un Opcion de Categoria :");
                int r =scn.nextInt();
                String cb = this.categoria.get(r-1);
                System.out.println("    ");
                System.out.println("Los autores de esta categoria son los siguientes : ");
                for (Libro lib : this.getLibros()){
                    if (cb.equals(lib.getCategoria())){
                        System.out.println("------------------------------");
                        System.out.println("        Autor N°"+(ga.getAutor().indexOf(lib.getAutor())+1));
                        System.out.println("------------------------------");
                        System.out.println("Nombre :"+lib.getAutor().getNombre());
                        System.out.println("Apellido :"+lib.getAutor().getApellido());
                    }
                }
                System.out.println("    ");
                System.out.print("Ingrese un Numero del Autor : ");
                r=scn.nextInt();
                Libro l =this.getLibros().get(r-1);
                System.out.println("    ");
                System.out.println("------------------------------------");
                System.out.println("El libros se encontro con exito");
                System.out.println("------------------------------------");
                System.out.println("    ");
                for (Libro li :this.getLibros()){
                    if (l.getAutor().getApellido().equals(li.getAutor().getApellido())){
                        System.out.println("----------------------");
                        System.out.println("    Libro N° "+(this.getLibros().indexOf(li)+1));
                        System.out.println("-----------------------");
                        System.out.println("ISBN : "+ li.getISBN());
                        System.out.println("Titulo :"+li.getTitulo());
                        System.out.println("Autor :"+li.getAutor().getNombre()+" "+li.getAutor().getApellido());
                        System.out.println("Categoria :"+li.getCategoria());
                        System.out.println("Precio : $"+li.getPrecio());
                   }
               }
                
                
            } break;
            case 2 :{
                ga.mostrarAutores();
                System.out.print("Elija una Opcion de Autor : ");
                int aut=scn.nextInt();
                Autor a = ga.getAutor().get(aut-1);
                System.out.println("    ");
                System.out.println("--------------------------");
                System.out.println("    Opcion N°"+aut);
                System.out.println("--------------------------");
                System.out.println("Nombre :"+a.getNombre());
                System.out.println("Apellido :"+a.getApellido());
                System.out.println("--------------------------------");
                System.out.println("El libro se encontro con exito ");
                System.out.println("--------------------------------");
                for (Libro lib :this.getLibros()){
                    if (lib.getAutor().getApellido().equals(a.getApellido())){
                        System.out.println("ISBN : "+lib.getISBN());
                        System.out.println("Titulo :"+lib.getTitulo());
                        System.out.println("Autor :"+lib.getAutor().getNombre()+" "+lib.getAutor().getApellido());
                        System.out.println("Categoria :"+lib.getCategoria());
                        System.out.println("Precio : $"+lib.getPrecio());
                    }
                }
            } break;   
            default :{ 
                System.out.println("------------------");
                System.out.println("FIN DEL PROGRAMA");
                System.out.println("------------------");
            } break;
        }

    }catch(Exception e){
        System.out.println("!ERROR! Debe ingresar una opcion valida");
    }
}
}
