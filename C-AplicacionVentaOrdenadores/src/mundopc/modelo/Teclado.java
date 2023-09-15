package mundopc.modelo;

public class Teclado extends DispositivoEntrada{
    // Atributos.
    private final int idTeclado;
    private static int contadorTeclados; //Es static porque se relaciona con la clase y no con los objetos de la misma.

    // Constructores.
    public Teclado (String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    // Métodos.
    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString(); // mandamos llamar el método toString de la clase padre para mostrarlo los atributos del padre.
    }
}
