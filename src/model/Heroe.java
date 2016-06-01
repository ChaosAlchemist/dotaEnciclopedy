package model;

public class Heroe {

    private int id;
    private String nombre;
    private String titulo;
    private String imagen;
    private String audio;

    public Heroe() {
    }

    public Heroe(int id, String nombre, String titulo, String imagen, String audio) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.imagen = imagen;
        this.audio = audio;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

}
