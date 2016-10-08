package modelo;
public class autores {
    private String aut_cod;
    private String aut_nombre;
    private String aut_nacionalidad;

    public autores() {
    }

    public autores(String aut_nombre) {
        this.aut_nombre = aut_nombre;
    }
    
    public autores(String aut_cod, String aut_nombre, String aut_nacionalidad) {
        this.aut_cod = aut_cod;
        this.aut_nombre = aut_nombre;
        this.aut_nacionalidad = aut_nacionalidad;
    }

    public String getAut_cod() {
        return aut_cod;
    }

    public void setAut_cod(String aut_cod) {
        this.aut_cod = aut_cod;
    }

    public String getAut_nombre() {
        return aut_nombre;
    }

    public void setAut_nombre(String aut_nombre) {
        this.aut_nombre = aut_nombre;
    }

    public String getAut_nacionalidad() {
        return aut_nacionalidad;
    }

    public void setAut_nacionalidad(String aut_nacionalidad) {
        this.aut_nacionalidad = aut_nacionalidad;
    }
    //sobresscritura
    @Override
    public String toString(){
        return aut_nombre;
    }
}
