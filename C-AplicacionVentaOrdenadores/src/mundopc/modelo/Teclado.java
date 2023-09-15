package mundopc.modelo;

public class Teclado extends DispositivoEntrada{
    // Atributos.
    private final int idTeclado;
    private static int contadorTeclados;

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
                "} " + super.toString(); // mandamos llamar el método toString de la clase padre para mostrarlo en pantalla.
    }
}
