package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.prestamos;
import modelo.usuarios;

public class control_prestamos extends prestamos{
   //instancia a control_conexion
    control_conexion con=new control_conexion();
    //listar préstamos
    public ArrayList lista_prestamos(){
        //crear arraylist de usuarios
        ArrayList<prestamos> lista=new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("SELECT pres_cod, personas.per_rut, per_nombre, per_apellido, "
                    + "fecha_prestamo, lib_nombre FROM prestamos " +
        "INNER JOIN personas " +
        "ON (prestamos.per_rut = personas.per_rut) " +
        "INNER JOIN libros " +
        "ON (prestamos.lib_cod = libros.lib_cod)");
            con.cerrar();
            ResultSet usu=datos.executeQuery();
            while (usu.next()) {
                lista.add(new prestamos(
                usu.getString("pres_cod"),
                usu.getString("per_rut"),
                usu.getString("per_nombre"),
                usu.getString("per_apellido"),
                usu.getString("fecha_prestamo"),
                usu.getString("lib_nombre")));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    public ArrayList lista_prestamos_alum(String v1){
        //crear arraylist de usuarios
        ArrayList<prestamos> lista=new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("SELECT pres_cod, personas.per_rut, per_nombre, per_apellido, "
                    + "fecha_prestamo, lib_nombre FROM prestamos " +
        "INNER JOIN personas " +
        "ON (prestamos.per_rut = personas.per_rut) " +
        "INNER JOIN libros " +
        "ON (prestamos.lib_cod = libros.lib_cod) WHERE personas.per_rut='"+v1+"'");
            con.cerrar();
            ResultSet usu=datos.executeQuery();
            while (usu.next()) {
                lista.add(new prestamos(
                usu.getString("pres_cod"),
                usu.getString("per_rut"),
                usu.getString("per_nombre"),
                usu.getString("per_apellido"),
                usu.getString("fecha_prestamo"),
                usu.getString("lib_nombre")));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
}
