package servicio;

import dominio.Pelicula;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ServicioPeliculasArchivo implements IServicioPeliculas{
    /** Clase encargada de guardar en un archivo de forma permanente los datos agregados por el usuario para evitar que se pierdan
     * al cerrar la aplicación. */

    // Atributos.
    private final String NOMBRE_ARCHIVO = "peliculas.text"; // Nombre del archivo donde se van a almacenar los datos de salida.

    // Constructor.
    public ServicioPeliculasArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO); // Creamos archivo dentro del constructor.
        try{
            // Si ya existe el archivo no se vuelve a crear.
            if(archivo.exists()){
                System.out.println("El archivo ya existe");
            }
            else{
                // Si no existe, lo generamos.
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Cerramos el archivo para que se guarde en el disco duro.
                System.out.println("Se ha creado el archivo");
            }
        }
        catch (Exception e){
            System.out.println("Ha ocurrido un error al abrir el archivo " + e.getMessage());
        }

    }




    // Métodos.
    @Override
    public void listarPeliculas() {

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

    }
}

