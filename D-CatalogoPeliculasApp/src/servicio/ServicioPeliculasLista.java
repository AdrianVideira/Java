package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{
    // Atributos.
    private final List<Pelicula> peliculas;

    // Constructores.
    public ServicioPeliculasLista (){
        this.peliculas = new ArrayList<>(); // Inicializamos el arrayLIst dentro del constructor del objeto.
    }


    // Métodos.
    @Override
    public void listarPeliculas() {
        System.out.println("Listado de Peliculas:");
        peliculas.forEach(System.out::println); // Imprimimos cada uno de los objetos agregados en la lista del objeto creado.

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agrego la película: " + pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        // Devuelve el índice de la pelicula encontrada.
        var indice = peliculas.indexOf(pelicula); // indexOF devuelve el indice de la pelicula si existe, sino devuelve un -1.
        // Se debe implementar el método equals y hasCode para que el método indexOF funcione correctamente.
        if(indice == -1){
            System.out.println("No se ha encontrado la pelicula " + pelicula);
        }
        else{
        System.out.println("Pelicula encontrada en el índice: " + indice);
        }
    }

    /*public static void main(String[] args) {
        // Creamos objetos de tipo película
        Pelicula peliculaBatman = new Pelicula("Batman Begins");
        Pelicula peliculaSpiderman = new Pelicula("Spiderman2");
        Pelicula peliculaIndianaJones = new Pelicula("Indiana Jones");
        System.out.println();

        // Creamos lista de peliculas
        IServicioPeliculas biblioteca = new ServicioPeliculasLista();
        // Agregamos las peliculas a la lista.
        biblioteca.agregarPelicula(peliculaBatman);
        biblioteca.agregarPelicula(peliculaSpiderman);
        biblioteca.agregarPelicula(peliculaIndianaJones);
        // listamos peliculas.
        biblioteca.listarPeliculas();
        // Buscamos una pelicula.
        biblioteca.buscarPelicula(new Pelicula("Avengers"));
    }*/

}
