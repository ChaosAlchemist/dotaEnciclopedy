package model;

public class Heroe {

    private int id;
    private String nombre;
    private String titulo;
    private String ruta;

    public Heroe() {
    }

    public Heroe(int id, String nombre, String titulo, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
