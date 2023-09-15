package mundopc.modelo;

public class Raton extends DispositivoEntrada{
    // Atributos.
    private final int idRaton;
    private static int contadorRatones;

    // Constructor.
   public Raton(String tipoDeEntrada, String marca){
       super(tipoDeEntrada, marca);
       idRaton = ++contadorRatones;
   }

    // Métodos.


    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "} " + super.toString(); // mandamos llamar el método toString de la clase padre para mostrarlo en pantalla.
    }
}
