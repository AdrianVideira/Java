package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        // Componentes DELL
        Monitor monitorDell = new Monitor("DELL", "23");
        Teclado tecladoDell = new Teclado("cable", "DELL");
        Raton ratonDell = new Raton("cable", "DELL");

        // Componentes ASUS
        Monitor monitorAsus = new Monitor("ASUS", "25");
        Teclado tecladoAsus = new Teclado("Bluetooth","ASUS");
        Raton ratonAsus = new Raton("Bluetooth", "ASUS");

        // Componentes MSI
        Monitor monitorMsi = new Monitor("MSI", "21");
        Teclado tecladoMsi = new Teclado("Bluetooth","MSI");
        Raton ratonMsi = new Raton("Bluetooth", "MSI");

        // Componentes MAC
        Monitor monitorMac = new Monitor("MAC", "23");
        Teclado tecladoMac = new Teclado("Bluetooth","MAC");
        Raton ratonMac = new Raton("Bluetooth", "MAC");


        //Creamos un objeto Computadora.
        Computadora computadoraDell = new Computadora("Computadora DELL", monitorDell, tecladoDell, ratonDell);
        Computadora computadoraAsus = new Computadora("Computadora ASUS", monitorAsus, tecladoAsus, ratonAsus);
        Computadora computadoraMsi = new Computadora("Computadora MSI", monitorMsi, tecladoMsi, ratonMsi);
        Computadora computadoraMac = new Computadora("Computadora MAC", monitorMac, tecladoMac, ratonMac);
        //System.out.println(computadoraDell);
        //System.out.println(computadoraAsus);
        //System.out.println(computadoraMsi);
        //System.out.println(computadoraMac);
        //System.out.println();

        //Creamos una orden.
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraMac);
        orden1.mostarOrden();
        System.out.println("--------------------------------------------------------------------");

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraMsi);
        orden2.mostarOrden();
        System.out.println("--------------------------------------------------------------------");

        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraMac);
        orden3.agregarComputadora(computadoraAsus);
        orden3.mostarOrden();


    }
}
