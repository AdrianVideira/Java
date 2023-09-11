import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Arraylist: donde se almacenaran los datos de las obj. personas que vayamos creando.
        // Esta fuera del bucle while para evitar que se borre con el reinicio del bucle.
        List<Persona> personas = new ArrayList<>();
        // Empezamos con el menu.
        boolean salir = false; // Usaremos esta variable como condición en el bucle.
        while (!salir) {
            mostrarMenu();
            try {// Manejo de errores, por si el usuario proporciona un valor incorrecto.
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        } // fin while.
    }// fin main.

    private static void mostrarMenu(){
        // Mostramos las opciones.
        System.out.println("""
                *** Listado Personas App ***
                1. Agregar.
                2. Mostar listado.
                3. Salir.
                """);
        System.out.println("Proporciona la opción deseada:");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        // Capturamos la operacion dada por el usuario y la guardamos en memoria.
        var operacion = Integer.parseInt(consola.nextLine());
        // Creamos localmente la variable [salir = false] por defecto para que se ejecute el código y luego usarla para salir del bucle.
        var salir = false;
        // Revisamos la operación seleccionada por el usuario:
        switch (operacion) {
            case 1 -> {// Agregamos persona a lista.
                System.out.println("Proporciona un nombre:");
                var nombre = consola.nextLine(); // Almacenamos dato en memoria.
                System.out.println("Proporciona el teléfono:");
                var tel = consola.nextLine(); // Almacenamos dato en memoria.
                System.out.println("Proporciona el email:");
                var email = consola.nextLine(); // Almacenamos dato en memoria.
                // Creamos el objeto persona y cubrimos los datos:
                var persona = new Persona(nombre, tel, email);
                // Agregamos el objeto creado a nuestra lista.
                personas.add(persona);
                System.out.println("La lista tiene " + personas.size() + " personas");
            }
            case 2 ->
                // Mostrar objetos de la lista.
                    personas.forEach(System.out::println);
            case 3 -> {
                // Salir del bucle while / programa.
                System.out.println("Hasta pronto....");
                salir = true;
            }
            default ->
                // Si el dato no coincide con ningun caso sale este mensaje.
                    System.out.println("Opcion erronea " + operacion);
        }// fin switch.
        return salir;

    }

}