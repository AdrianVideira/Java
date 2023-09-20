package servicio;

import dominio.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivo implements IServicioPeliculas{
    /** Clase encargada de guardar en un archivo de forma permanente los datos agregados por el usuario para evitar que se pierdan
     * al cerrar la aplicación. */

    // Atributos.
    private final String NOMBRE_ARCHIVO = "peliculas.text"; // Nombre del archivo donde se van a almacenar los datos de salida.

    // Constructor.
    public ServicioPeliculasArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO); // abrimos archivo dentro del constructor (si existe).
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
        // Abrimos el archivo generado por el constructor para trabajar con el. (Ya que lo hemos cerrado en el constructor - Linea 25 -).
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            System.out.println("Listado de películas: ");
            // Abrimos el archivo para lectura.
            var entrada = new BufferedReader(new FileReader(archivo)); // leemos la información en la variable "entrada".
            // Leemos linea a linea el archivo.
            String linea; // en esta variable almacenaremos los datos leidos del archivo.
            linea = entrada.readLine(); // Para leer linea a linea usamos el método .readLine() de la clase BufferedReader.
            // Leemos todas las líneas disponibles.
            while(linea != null){
                var pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                // Antes de terminar el ciclo volvemos a leer la siguiente linea.
                entrada.readLine();
            } // fin ciclo while
            // Cerramos el archivo.
            entrada.close();
        }catch (Exception e){
            System.out.println("Ocurrio un error al leer el archivo "+ e.getMessage());
        }
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        // Primero deberemos verificar si exite el archivo o es nuevo.
        // En caso de que ya exista, deberemos añadir información después de la existente para evitar sobreescribir la info.
        boolean anexar = false; // Suponemos que la primera vez no hay información.
        var archivo = new File(NOMBRE_ARCHIVO); // abrimos nuestro archivo.
        try{
            // Revisamos si existe el archivo.
            anexar = archivo.exists(); // Si es verdadero, deberemos anexar la información para evitar sobreescrituras.
            var salida = new PrintWriter(new FileWriter(archivo, anexar)); // Usamos PrintWriter para empezar a escribir información.
            // Si anexar es falso, el archivo es nuevo ( no existe info) si es verdadero exite info. esto lo controlamos con la variable anexar.

            //Agregamos la pelicula (toString).
            salida.println(pelicula);
            salida.close(); // Cerramos proceso.
            System.out.println("Se agrego al archivo " + pelicula);
        }catch (Exception e){
            System.out.println("Ocurrio un error al agregar película " + e.getMessage());
        }
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var archivo = new File(NOMBRE_ARCHIVO); // Abrimos el archivo.
        try{
            // Abrimos el archivo para lectura linea a linea para buscar la película.
            var entrada  = new BufferedReader(new FileReader(archivo)); // Generamos un lector y le pasamos nuestro archivo para que lo lea.
            String lineaTexto;
            lineaTexto = entrada.readLine(); // A esta variable le asignamos los datos de la linea leida.
            var indice = 1; // Esta variable nos indica en qué indice / línea se encontro la pelicula buscada.(Comenzamos en la línea 1).
            var encontrada = false; // Esta variable nos indicará si se encontro o no la película buscada.
            var peliculaBuscar = pelicula.getNombre(); // En esta variable obtenemos el nombre del objeto película pasado por parámetro.
            while(lineaTexto != null){ // El bucle se romperá cuando la línea sea nula, lo que quiere decir que no existen más nombres en la lista.
                // Buscamos sin importar mayusculas/minúsculas.
                if (peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                    encontrada = true;
                    break; //Si es verdadera, rompemos con el ciclo.
                }
                // Leemos la siguiente linea ants de la siguiente interacción.
                lineaTexto = entrada.readLine();
                indice++; // Incrementamos el valor del índice si hace falta cambiar de lineaTexto en la busqueda de la película.
            } // fin while
            // Imprimimos los resultados de la busqueda.
            if(encontrada){
                System.out.println("Pelicula " + lineaTexto + " encontrada - linea " + indice);
            }
            else{
                System.out.println("No se encontro la película " + pelicula.getNombre());
                entrada.close();
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error al buscar en el archivo " + e.getMessage());
        }
    }
}

