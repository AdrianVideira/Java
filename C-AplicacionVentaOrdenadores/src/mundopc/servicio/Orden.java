package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    // Atributos.
    private final int idOrder;
    private final List<Computadora>computadoras;
    private static int contadorOrdenes;

    //Constructores.
    public Orden(){
        computadoras = new ArrayList<>(); //Inicializamos el arrayList.
        this.idOrder = ++contadorOrdenes; //Inicializamos el contador.
    }

    // Métodos.
    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora); //Agregamos el objeto computadora al arrayList con el método .add
    }

    public void mostarOrden(){
        System.out.println("Orden #: "+ idOrder);
        System.out.println("Total computadoras: " + computadoras.size());
        computadoras.forEach(System.out::println); // forEach: Por cada objeto de la lista computadoras se manda llamar y se imprime.

    }






}
