package avr.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion(){ // Es estático porque lo vamos a usar desde otras clases sin necesidad de instanciar el objeto.
        Connection conexion = null;
        // Datos de la base de datos a la que nos vamos a conectar.
        var baseDatos = "estudiantes_db";
        var url = "jdbc:mysql://localhost:3305/" + baseDatos;
        var usuario = "root";
        var password = "adrian";
        // Cargamos la clase del driver de mysql en memoria
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion " + e.getMessage());
        }
        return conexion;
    }


    // Hacemos una prueba para testear la conexion a la base de datos MySQL.
    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if(conexion !=null){
            System.out.println("Conexion exitosa " + conexion);
        }else{
            System.out.println("Error al conectarse");
        }
    }
}
