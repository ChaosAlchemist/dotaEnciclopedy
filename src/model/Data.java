package model;

import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private Conexion c;
    private String q;
    private ResultSet rs;

    // Constantes de Estadísticas
    public final int FUERZA = 1;
    public final int AGILIDAD = 2;
    public final int INTELIGENCIA = 3;
    public final int VIDA = 4;
    public final int MANA = 5;
    public final int VELOCIDAD = 6;
    public final int NIVEL = 7;

    // Constantes de Nombres
    public final int NOMBRE = 1;
    public final int TITULO = 2;
    public final int RUTA = 3;

    // Constantes Doubles
    public final double REGEN_HP = 1;
    public final double REGEN_MANA = 2;
    public final double FUERZA_POR_NIVEL = 3;
    public final double AGILIDAD_POR_NIVEL = 4;
    public final double INTELIGENCIA_POR_NIVEL = 5;
    public final int ARMADURA = 6;

    // Constantes Recursos
    public final int IMAGEN = 1;
    public final int AUDIO = 2;

    public Data() throws SQLException {
        c = new Conexion(
                "localhost",
                "bd_dota",
                "root",
                "123456");

    }

    public Heroe getHeroe(int id) throws SQLException {
        Heroe h = null;
        q = "select * from heroes where id = " + id;
        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            h = new Heroe();
            h.setId(rs.getInt(1));
            h.setNombre(rs.getString(2));
            h.setTitulo(rs.getString(3));
        }

        c.desconectar();
        return h;

    }

    public List<Heroe> getListaHeroes() throws SQLException {
        List<Heroe> heroes = new ArrayList<>();
        Heroe h;
        q = "select * from heroes";
        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            h = new Heroe();
            h.setId(rs.getInt(1));
            h.setNombre(rs.getString(2));
            h.setTitulo(rs.getString(3));
            heroes.add(h);
        }

        c.desconectar();

        return heroes;
    }

    /**
     * @param id ID del héroe.
     * @param tipo Diferencia entre nombre o título.
     * @return Este método devuelve el Nombre y el Título del héroe.
     * @throws SQLException
     */
    public String getHeroeStrings(int id, int tipo) throws SQLException {
        String nombre = "";
        if (tipo == NOMBRE) {
            q = "select nombre from heroes where id = " + id;
            // De lo contrario devuelve TÍTULO
        } else if (tipo == TITULO) {
            q = "select titulo from heroes where id = " + id;
        } else if (tipo == RUTA) {
            q = "select ruta from heroes where id = " + id;
        }

        rs = c.ejecutarSelect(q);

        if (rs.next()) {
            nombre = rs.getString(1);
        }
        c.desconectar();
        return nombre;
    }

    public int getEstadisticas(int id, int stat) throws SQLException {
        if (stat == FUERZA) {
            q = "select fuerza from estadisticas where idHeroe = " + id;
        } else if (stat == AGILIDAD) {
            q = "select agilidad from estadisticas where idHeroe = " + id;
        } else if (stat == INTELIGENCIA) {
            q = "select inteligencia from estadisticas where idHeroe = " + id;
        } else if (stat == VIDA) {
            q = "select vida from estadisticas where idHeroe = " + id;
        } else if (stat == MANA) {
            q = "select mana from estadisticas where idHeroe = " + id;
        } else if (stat == VELOCIDAD) {
            q = "select velocidad from estadisticas where idHeroe = " + id;
        } else {
            q = "select nivel from estadisticas where idHeroe = " + id;
        }

        rs = c.ejecutarSelect(q);
        if (rs.next()) {
            stat = rs.getInt(1);
        }

        c.desconectar();

        return stat;
    }

    public double getEstadisticasDouble(int id, double stat) throws SQLException {
        if (stat == REGEN_HP) {
            q = "select regenV from estadisticas where idHeroe = " + id;
        } else if (stat == REGEN_MANA) {
            q = "select regenM from estadisticas where idHeroe = " + id;
        } else if (stat == FUERZA_POR_NIVEL) {
            q = "select nivelFue from estadisticas where idHeroe = " + id;
        } else if (stat == AGILIDAD_POR_NIVEL) {
            q = "select nivelAgi from estadisticas where idHeroe = " + id;
        } else if (stat == ARMADURA) {
            q = "select armadura from estadisticas where idHeroe = " + id;
        } else {
            q = "select nivelInt from estadisticas where idHeroe = " + id;
        }

        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            stat = rs.getDouble(1);
        }

        c.desconectar();
        return stat;
    }

    public int actualizarStats(int id) throws SQLException {
        int vida = -15;
        q = "update estadisticas set vida = vida + (fuerza*20), mana = mana + (inteligencia*12), isCalculado = true where idHeroe ='" + id + "' and isCalculado = false";
        c.ejecutar(q);

        c.desconectar();

        return vida;
    }

    public int getNivel(int id) throws SQLException {
        int nivel = 0;
        q = "select nivel from estadisticas where idHeroe =" + id;
        rs = c.ejecutarSelect(q);

        if (rs.next()) {
            nivel = rs.getInt(1);
        }

        c.desconectar();

        return nivel;
    }

    public void subirNivel(int id) throws SQLException {
        q = "update estadisticas set nivel = (nivel + 1), isCalculado = false, vida = 200, mana = 50 where idHeroe = " + id;
        c.ejecutar(q);

        q = "update estadisticas set fuerza = (fuerza + nivelFue), agilidad = (agilidad + nivelAgi), inteligencia = (inteligencia + nivelInt) where idHeroe =" + id;
        c.ejecutar(q);

        c.desconectar();
    }
}
