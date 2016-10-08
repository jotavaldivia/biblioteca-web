package control;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.cursos;
import modelo.usuarios;

public class control_usuarios extends usuarios{
    //instancia a control_conexion
    control_conexion con=new control_conexion();
    //verificación de usuario
    public boolean verificar(){
        try {
            con.conectar();
            PreparedStatement sql=con.estado().prepareStatement(""
                    + "SELECT per_nombre, per_apellido FROM "
                    + "personas WHERE per_rut='"
                    +this.getPer_rut()+"' AND per_contraseña='"
                    +this.getPer_contraseña()+"' AND rol_cod='3'");
            ResultSet res=sql.executeQuery();
            con.cerrar();
            if(res.next()){
                this.setPer_nombre(res.getString("per_nombre"));
                this.setPer_apellido(res.getString("per_apellido"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(control_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean verificar_admin(){
        try {
            con.conectar();
            PreparedStatement sql=con.estado().prepareStatement(""
                    + "SELECT per_nombre, per_apellido FROM "
                    + "personas WHERE per_rut='"
                    +this.getPer_rut()+"' AND per_contraseña='"
                    +this.getPer_contraseña()+"' AND rol_cod='1';");
            ResultSet res=sql.executeQuery();
            con.cerrar();
            if(res.next()){
                this.setPer_nombre(res.getString("per_nombre"));
                this.setPer_apellido(res.getString("per_apellido"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(control_usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //crear cuenta de usuario
    public void crear_cuenta(){
        try {
            con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO personas VALUES"
            +"('"+ this.getPer_rut()+"','"+ this.getPer_nombre()+"',"
            +" '"+ this.getPer_apellido()+"','"+ this.getPer_direccion()+"',"
            +" '"+ this.getPer_telefono()+"','"+ this.getPer_contraseña()+"',"
            +" '"+ this.getPer_correo()+"', '3','"+ this.getCur_cod()+"')");
            datos.execute();
            con.estado();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    public ArrayList lista_usuarios(){
        //crear arraylist de usuarios
        ArrayList<usuarios> lista=new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("SELECT per_rut, per_nombre, per_apellido, "
                    + "per_direccion, per_telefono, per_correo, cur_nombre FROM personas " +
        "INNER JOIN cursos " +
        "ON (personas.cur_cod = cursos.cur_cod) WHERE personas.rol_cod='3' ORDER BY cursos.cur_nombre asc;");
            con.cerrar();
            ResultSet usu=datos.executeQuery();
            while (usu.next()) {
                lista.add(new usuarios(
                usu.getString("per_rut"),
                usu.getString("per_nombre"),
                usu.getString("per_apellido"),
                usu.getString("per_direccion"),
                usu.getString("per_telefono"),
                usu.getString("per_correo"),
                usu.getString("cur_nombre")));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    //método para consultar registro por rut
    public ArrayList<usuarios> consulta(String v1){
        ArrayList<usuarios> lista=new ArrayList<>();
        try{
            con.conectar();
                PreparedStatement datos=
                  con.estado().prepareStatement(
                  "SELECT * FROM personas WHERE per_rut='"+v1+"'");
                ResultSet res=datos.executeQuery();
                if(res.next())
                    lista.add(new usuarios(
                            res.getString("per_rut"), 
                            res.getString("per_nombre"),
                            res.getString("per_apellido"),
                            res.getString("per_direccion"),
                            res.getString("per_telefono"),
                            res.getString("per_contraseña"),
                            res.getString("per_correo")));
            con.cerrar();
        }catch(SQLException e){
            System.err.println("Error "+e);
        }
        return lista;
    }
    //método para consultar registro por rut
    public ArrayList<usuarios> consulta_detalle(String v1){
        ArrayList<usuarios> listb=new ArrayList<>();
        try{
            con.conectar();
                PreparedStatement datos=
                  con.estado().prepareStatement(
                  "SELECT per_rut, per_nombre, per_apellido, per_direccion, per_telefono, per_correo, cur_nombre"
                          + " FROM personas INNER JOIN cursos ON (personas.cur_cod = cursos.cur_cod) WHERE per_rut='"+v1+"'");
                ResultSet res=datos.executeQuery();
                if(res.next())
                    listb.add(new usuarios(
                            res.getString("per_rut"), 
                            res.getString("per_nombre"),
                            res.getString("per_apellido"),
                            res.getString("per_direccion"),
                            res.getString("per_telefono"),
                            res.getString("per_correo"),
                            res.getString("cur_nombre")));
            con.cerrar();
        }catch(SQLException e){
            System.err.println("Error "+e);
        }
        return listb;
    }
    //método para eliminar registro
    public void eliminar(String v1){
        try{
            con.conectar();
                PreparedStatement datos=
                  con.estado().prepareStatement(
                  "DELETE FROM personas WHERE "
                  + "per_rut='"+v1+"'");
                datos.execute();
            con.cerrar();
        }catch(SQLException e){
            System.err.println("Error "+e);
        }
    }
    //listar cursos
    public ArrayList lista_cursos(){
        ArrayList<cursos> lista=new ArrayList<>();
        try {
            con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("SELECT * FROM cursos");
            ResultSet res=datos.executeQuery();
            while (res.next()) {
                lista.add(new cursos(res.getString("cur_cod"),res.getString("cur_nombre")));
                con.cerrar();
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    return lista;
    }
    //método para modificar registro
    public void modificar(String v1, String v2, String v3, String v4, String v5, String v6, String v7){
        try{
            con.conectar();
                PreparedStatement datos=
                  con.estado().prepareStatement(
                  "UPDATE personas SET per_rut='"+v4+"', per_nombre='"+v2+"', per_apellido='"+v3+"',"
                          + " per_direccion='"+v5+"', per_telefono='"+v6+"', per_correo='"+v7+"' WHERE per_rut='"+v1+"'");
                datos.execute();
            con.cerrar();
        }catch(SQLException e){
            System.err.println("Error "+e);
        }
    }
}
