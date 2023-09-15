package mundopc.modelo;

public class Raton extends DispositivoEntrada{
    // Atributos.
    private final int idRaton;
    private static int contadorRatones; //Es static porque se relaciona con la clase y no con los objetos de la misma.

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
                "} " + super.toString(); // mandamos llamar el método toString de la clase padre para mostrarlo los atributos del padre.
    }
}
