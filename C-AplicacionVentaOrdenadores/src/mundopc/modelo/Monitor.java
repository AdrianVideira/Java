package mundopc.modelo;

public class Monitor {
    // Atributos.
    private final int idMonitor;
    private String marca;
    private String tamanio;
    private static int contadorMonitores; //Es static porque se relaciona con la clase y no con los objetos de la misma.

    // Constructores.
    private Monitor () { // Este constructor solo podrá ser llamado dentro de esta clase.
        idMonitor = ++contadorMonitores;
    }

    public Monitor (String marca, String tamanio){
        this(); // llamada al constructor privado "private Monitor()", el cual inicializa el contador.
        this.marca = marca;
        this.tamanio = tamanio;
    }

    // Métodos.
    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
