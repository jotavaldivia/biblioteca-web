package modelo;
public class cursos {
    private String cur_cod;
    private String cur_nombre;

    public cursos() {
    }

    public cursos(String cur_nombre) {
        this.cur_nombre = cur_nombre;
    }

    public cursos(String cur_cod, String cur_nombre) {
        this.cur_cod = cur_cod;
        this.cur_nombre = cur_nombre;
    }

    public String getCur_cod() {
        return cur_cod;
    }

    public void setCur_cod(String cur_cod) {
        this.cur_cod = cur_cod;
    }

    public String getCur_nombre() {
        return cur_nombre;
    }

    public void setCur_nombre(String cur_nombre) {
        this.cur_nombre = cur_nombre;
    }
    //sobresscritura
    @Override
    public String toString(){
        return cur_nombre;
    }
}
