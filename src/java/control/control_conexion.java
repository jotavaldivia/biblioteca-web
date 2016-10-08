package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class control_conexion {
    private String usu;
    private String pass;
    private String url;
    //atributo de tipo conexión
    Connection con=null;
    //constructor
    public control_conexion() {
        this.usu = "leandro.araneda";
        this.pass = "leandro123";
        this.url = "jdbc:mysql://127.0.0.1/biblioteca";
    }
    //conectar
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,usu,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar");
        }
    }
    //desconectar
    public void cerrar(){
        con=null;
    }
    //estado de la conecxión
    public Connection estado(){
        return con;
    }
}
