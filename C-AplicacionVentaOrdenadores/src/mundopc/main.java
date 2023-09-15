package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class main {
    public static void main(String[] args) {
        //Creamos objetos para prueba de funcionamiento.
        Raton raton = new Raton("Bluetooth","Lenovo");
        Raton raton2 = new Raton("Bluetooth","Asus");
        Raton raton3= new Raton("cable","Tosiba");
        System.out.println(raton);
        System.out.println(raton2);
        System.out.println(raton3);
        System.out.println();

        Teclado teclado = new Teclado("Bluetooth", "Lenovo");
        Teclado teclado2 = new Teclado("Cable", "Samsung");
        System.out.println(teclado);
        System.out.println(teclado2);
        System.out.println();

        Monitor monitor = new Monitor("Asus", "23");
        Monitor monitor2 = new Monitor("Samsung", "20");
        Monitor monitor3 = new Monitor("Sony", "19");
        System.out.println(monitor);
        System.out.println(monitor2);
        System.out.println(monitor3);
        System.out.println();

        //Creamos un objeto Computadora.
        Computadora computadora = new Computadora("Computadora Personal", monitor3, teclado2, raton);
        Computadora computadora2 = new Computadora("Computadora AXIS", monitor, teclado, raton2);
        System.out.println(computadora);
        System.out.println(computadora2);




    }
}
