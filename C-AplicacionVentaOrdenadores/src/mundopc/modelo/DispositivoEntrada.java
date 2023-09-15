package mundopc.modelo;

public class DispositivoEntrada {
    // Atributos.
    private String tipoDeEntrada;
    private String marca;

    // Constructor.
    public DispositivoEntrada (String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    // Métodos.
    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }


}
