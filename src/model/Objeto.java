package model;

public class Objeto {

    private int id;
    private String nombre;
    private int precio;
    private int fuerza;
    private int agilidad;
    private int inteligencia;
    private String imagen;

    public Objeto() {
    }

    public Objeto(int id, String nombre, int precio, int fuerza, int agilidad, int inteligencia, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.imagen = imagen;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
