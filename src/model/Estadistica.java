package model;

public class Estadistica {

    private int id;
    private int idHeroe;
    private int nivel;
    private int vida;
    private int mana;
    private int velocidad;
    private double fuerza;
    private double agilidad;
    private double inteligencia;
    private double regenV;
    private double regenM;
    private double nivelFue;
    private double nivelAgi;
    private double nivelInt;
    private boolean isCalculado;

    public Estadistica() {
    }

    public Estadistica(int id, int idHeroe, int nivel, int vida, int mana, int velocidad, double fuerza, double agilidad, double inteligencia, double regenV, double regenM, double nivelFue, double nivelAgi, double nivelInt, boolean isCalculado) {
        this.id = id;
        this.idHeroe = idHeroe;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.regenV = regenV;
        this.regenM = regenM;
        this.nivelFue = nivelFue;
        this.nivelAgi = nivelAgi;
        this.nivelInt = nivelInt;
        this.isCalculado = isCalculado;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getRegenV() {
        return regenV;
    }

    public void setRegenV(double regenV) {
        this.regenV = regenV;
    }

    public double getRegenM() {
        return regenM;
    }

    public void setRegenM(double regenM) {
        this.regenM = regenM;
    }

    public double getNivelFue() {
        return nivelFue;
    }

    public void setNivelFue(double nivelFue) {
        this.nivelFue = nivelFue;
    }

    public double getNivelAgi() {
        return nivelAgi;
    }

    public void setNivelAgi(double nivelAgi) {
        this.nivelAgi = nivelAgi;
    }

    public double getNivelInt() {
        return nivelInt;
    }

    public void setNivelInt(double nivelInt) {
        this.nivelInt = nivelInt;
    }

    public boolean isIsCalculado() {
        return isCalculado;
    }

    public void setIsCalculado(boolean isCalculado) {
        this.isCalculado = isCalculado;
    }

}
