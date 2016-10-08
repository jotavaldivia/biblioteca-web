package modelo;
public class libros extends autores{
    private String lib_cod;
    private String lib_nombre;
    private String lib_stock;

    public libros() {
    }

    public libros(String lib_nombre) {
        this.lib_nombre = lib_nombre;
    }
    
    public libros(String lib_cod, String lib_nombre, String lib_stock, String aut_nombre) {
        super(aut_nombre);
        this.lib_cod = lib_cod;
        this.lib_nombre = lib_nombre;
        this.lib_stock = lib_stock;
    }

    public String getLib_cod() {
        return lib_cod;
    }

    public void setLib_cod(String lib_cod) {
        this.lib_cod = lib_cod;
    }

    public String getLib_nombre() {
        return lib_nombre;
    }

    public void setLib_nombre(String lib_nombre) {
        this.lib_nombre = lib_nombre;
    }

    public String getLib_stock() {
        return lib_stock;
    }

    public void setLib_stock(String lib_stock) {
        this.lib_stock = lib_stock;
    }
    //sobresscritura
    @Override
    public String toString(){
        return lib_nombre;
    }
}
