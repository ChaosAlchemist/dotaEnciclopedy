package model;

public class Habilidad {

    private int id;
    private int idHeroe;
    private int idSlot;
    private String nombre;
    private int mana;
    private int recarga;

    public Habilidad() {
    }

    public Habilidad(int id, int idHeroe, int idSlot, String nombre, int mana, int recarga) {
        this.id = id;
        this.idHeroe = idHeroe;
        this.idSlot = idSlot;
        this.nombre = nombre;
        this.mana = mana;
        this.recarga = recarga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHeroe() {
        return idHeroe;
    }

    public void setIdHeroe(int idHeroe) {
        this.idHeroe = idHeroe;
    }

    public int getIdSlot() {
        return idSlot;
    }

    public void setIdSlot(int idSlot) {
        this.idSlot = idSlot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
