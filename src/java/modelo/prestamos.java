package modelo;
public class prestamos extends libros{
    private String pres_cod;
    private String per_rut;
    private String per_nombre;
    private String per_apellido;
    private String fecha_prestamo;
    public prestamos() {
    }

    public prestamos(String pres_cod, String per_rut, String per_nombre, String per_apellido, String fecha_prestamo, String lib_nombre) {
        super(lib_nombre);
        this.pres_cod = pres_cod;
        this.per_rut = per_rut;
        this.per_nombre = per_nombre;
        this.per_apellido = per_apellido;
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getPres_cod() {
        return pres_cod;
    }

    public void setPres_cod(String pres_cod) {
        this.pres_cod = pres_cod;
    }

    public String getPer_rut() {
        return per_rut;
    }

    public void setPer_rut(String per_rut) {
        this.per_rut = per_rut;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }
    
}
