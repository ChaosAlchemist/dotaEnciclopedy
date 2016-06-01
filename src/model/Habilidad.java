package model;

public class Habilidad {

    private int id;
    private String nombre;
    private boolean esPasiva;
    private int mana;
    private int recarga;

    public Habilidad() {
    }

    public Habilidad(int id, String nombre, boolean esPasiva, int mana, int recarga) {
        this.id = id;
        this.nombre = nombre;
        this.esPasiva = esPasiva;
        this.mana = mana;
        this.recarga = recarga;
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

    public boolean isEsPasiva() {
        return esPasiva;
    }

    public void setEsPasiva(boolean esPasiva) {
        this.esPasiva = esPasiva;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }
}
