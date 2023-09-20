package dominio;

import java.util.Objects;

public class Pelicula {
    // Atributo.
    private String nombre;

    // Constructor.
    public Pelicula (){}

    public Pelicula (String nombre){
        this.nombre = nombre;
    }

    // Métodos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;

        return Objects.equals(nombre, pelicula.nombre);
    }// Se debe implementar el método equals y hasCode para que el método indexOF funcione correctamente.

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }// Se debe implementar el método equals y hasCode para que el método indexOF funcione correctamente.

    @Override
    public String toString() {
        return this.nombre; // Modificamos el método toString para que solo se imprima el nombre de la película
        // que es lo que necesitamos para guardar en el fichero.
    }
}
