package modelo;
public class usuarios extends cursos{
    private String per_rut;
    private String per_nombre;
    private String per_apellido;
    private String per_direccion;
    private String per_telefono;
    private String per_contraseña;
    private String per_correo;
    //constructor
    public usuarios() {
    }

    public usuarios(String per_rut, String per_nombre, String per_apellido, String per_direccion, String per_telefono, String per_correo, String cur_nombre) {
        super(cur_nombre);
        this.per_rut = per_rut;
        this.per_nombre = per_nombre;
        this.per_apellido = per_apellido;
        this.per_direccion = per_direccion;
        this.per_telefono = per_telefono;
        this.per_correo = per_correo;
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

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public String getPer_contraseña() {
        return per_contraseña;
    }

    public void setPer_contraseña(String per_contraseña) {
        this.per_contraseña = per_contraseña;
    }

    public String getPer_correo() {
        return per_correo;
    }

    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }
    
}
