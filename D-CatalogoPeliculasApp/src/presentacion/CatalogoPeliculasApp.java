package presentacion;

import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasArchivo;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        // Añadimos la implementación del servicio.
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();
        while(!salir){
            try{
                mostrarMenu();
                salir = ejecutarOpciones(consola, servicioPeliculas);

            }catch (Exception e){
                System.out.println("Ocurrio un erro: " + e.getMessage());
            }
            System.out.println();
        }// fin while
    }

    private static void mostrarMenu(){
        System.out.println("""
                *** Catalogo de Peliculas ***
                1. Agregar pelicula.
                2. Listar peliculas.
                3. Buscar pelicula.
                4. Salir.
                             
                """);
    }

    private static boolean ejecutarOpciones(Scanner consola, IServicioPeliculas servicioPeliculas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1:
                System.out.println("Introduce el nombre de la película: ");
                var nombrePelicula = consola.nextLine();
                servicioPeliculas.agregarPelicula(new Pelicula(nombrePelicula));
                break;
            case 2:
                servicioPeliculas.listarPeliculas();
                break;
            case 3:
                System.out.println("Introduce la película a buscar:");
                var buscar = consola.nextLine();
                servicioPeliculas.buscarPelicula(new Pelicula(buscar));
                break;
            case 4:
                System.out.println("Hasta pronto!");
                salir = true;
                break;
            default:
                System.out.println("Opcion no reconocida " + opcion);
        } // fin switch.
        return salir;
    }
}


