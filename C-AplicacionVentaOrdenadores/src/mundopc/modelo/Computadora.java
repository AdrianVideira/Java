package mundopc.modelo;

public class Computadora {
    // Atributos.
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    // Constructores.
    private Computadora(){ // Este constructor solo podrá ser llamado dentro de esta clase.
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this(); // llamada al constructor privado "private Computadora()", el cual inicializa el contador.
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    // Métodos.
    @Override
    public String toString() {
        return "Computadora{\n" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", \nmonitor=" + monitor +
                ", \nteclado=" + teclado +
                ", \nraton=" + raton +
                '}';
    }
}
