import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicación Calculadora ****");
            /*Mostramos el menú.*/
            //Función con la cual móstramos el menú de selección de operación.
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());//Creamos el selector de la operacion a realizar.
                //Revisar que la opción este dentro de las opciones mencionadas (1-4).
                if (operacion >= 1 && operacion <= 4) {
                    //Usamos la funcion para realizar la operación seleccionada por el ususario.
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { //salida del programa.
                    System.out.println("Hasta pronto...");
                    break; // Aquí rompemos el bucle While si el usuario pulsa el 5 con la palabra "break"
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                // Imprimimos un salto de linea antes de repetir el ciclo para separar el reinicio del programa.
                System.out.println();
            }//fin try
            catch (Exception e){
                System.out.println("Ocurrio un error "+ e.getMessage());
            }
        }//fin While.
    }//fin main.

    //****************************************************************************************************************//

    //FUNCIONES.
    // mostrarMenu: Muestra posibles operaciónes a realizar.
    private static void mostrarMenu(){
        System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicación.
                    4.División.
                    5.Salir.
                    """);
        System.out.println("Operación a realizar? ");
    }

    //ejecutarOperacion: Realiza la operación aritmética seleccionada por el usuario.
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> { //Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> { //Multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> { //Division
                resultado = operando1 / operando2;
                System.out.println("Resultado División: " + resultado);
            }
            default -> {
                System.out.println("Opción erronea: " + operacion);
            }
        } //fin switch
    }

}//fin clase.
