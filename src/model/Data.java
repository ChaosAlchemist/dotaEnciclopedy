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

    private List<Heroe> heroes;

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
    public final int PRECIO = 4;

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
    public final int RECARGA = 2;
    public final int ID_HEROE = 3;

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

    public List<Habilidad> getListaHabilidades() throws SQLException {
        List<Habilidad> habilidades = new ArrayList<>();
        Habilidad h;
        q = "select * from habilidades";
        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            h = new Habilidad();
            h.setId(rs.getInt(1));
            h.setIdHeroe(rs.getInt(2));
            h.setNombre(rs.getString(3));
            h.setMana(rs.getInt(4));
            h.setRecarga(rs.getInt(5));
            habilidades.add(h);
        }
        c.desconectar();

        return habilidades;
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

    public List<Objeto> getListaObjetos() throws SQLException {
        List<Objeto> objetos = new ArrayList<>();
        Objeto o;
        q = "select * from objetos";
        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            o = new Objeto();
            o.setId(rs.getInt(1));
            o.setNombre(rs.getString(2));
            o.setPrecio(rs.getInt(3));
            o.setFuerza(rs.getInt(4));
            o.setAgilidad(rs.getInt(5));
            o.setInteligencia(rs.getInt(6));
            o.setImagen(rs.getString(7));
            objetos.add(o);
        }
        c.desconectar();
        return objetos;
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

    public void bajarNivel(int id) throws SQLException {
        q = "update estadisticas set nivel = (nivel - 1), isCalculado = false, vida = 200, mana = 50 where idHeroe = " + id;
        c.ejecutar(q);

        q = "update estadisticas set fuerza = (fuerza - nivelFue), agilidad = (agilidad - nivelAgi), inteligencia = (inteligencia - nivelInt) where idHeroe =" + id;
        c.ejecutar(q);

        c.desconectar();
    }

    public List<Heroe> buscarHeroes(String filtro) throws SQLException {
        heroes = new ArrayList<>();
        Heroe h;

        q = "select * from heroes where "
                + "id like '%" + filtro + "%' or "
                + "nombre like '%" + filtro + "%' or "
                + "titulo like '%" + filtro + "%'";
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

    public Habilidad getHabilidad(int id) throws SQLException {
        Habilidad h = null;
        q = "select * from habilidades where id = " + id;
        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            h = new Habilidad();
            h.setId(rs.getInt(1));
            h.setIdHeroe(rs.getInt(2));
            h.setNombre(rs.getString(3));
            h.setMana(rs.getInt(4));
            h.setRecarga(rs.getInt(5));
        }

        c.desconectar();
        return h;

    }

    public Objeto getObjeto(int id) throws SQLException {
        Objeto o = null;
        q = "select * from objetos where id = " + id;
        rs = c.ejecutarSelect(q);

        while (rs.next()) {
            o = new Objeto();
            o.setId(rs.getInt(1));
            o.setNombre(rs.getString(2));
            o.setPrecio(rs.getInt(3));
            o.setFuerza(rs.getInt(4));
            o.setAgilidad(rs.getInt(5));
            o.setInteligencia(rs.getInt(6));
            o.setImagen(rs.getString(7));
        }
        c.desconectar();
        return o;
    }

    public int getEstadisticaHabilidad(int id, int stat) throws SQLException {
        if (stat == MANA) {
            q = "select mana from habilidades where id = " + id;
        } else if (stat == RECARGA) {
            q = "select recarga from habilidades where id = " + id;
        } else if (stat == ID_HEROE) {
            q = "select idHeroe from habilidades where id = " + id;
        }
        rs = c.ejecutarSelect(q);
        if (rs.next()) {
            stat = rs.getInt(1);
        }
        c.desconectar();
        return stat;

    }

    public int getEstadisticasObjetos(int id, int stat) throws SQLException {
        if (stat == FUERZA) {
            q = "select fuerza from objetos where id = " + id;
        } else if (stat == AGILIDAD) {
            q = "select agilidad from objetos where id = " + id;
        } else if (stat == INTELIGENCIA) {
            q = "select inteligencia from objetos where id = " + id;
        } else if (stat == PRECIO) {
            q = "select precio from objetos where id = " + id;
        }
        rs = c.ejecutarSelect(q);
        if (rs.next()) {
            stat = rs.getInt(1);
        }
        c.desconectar();
        return stat;

    }

    public String getHabilidadString(int id, int tipo) throws SQLException {
        String nombre = "";
        if (tipo == NOMBRE) {
            q = "select nombre from habilidades where id = " + id;
        } else if (tipo == 2) {
            q = "select imagen from habilidades where id = " + id;
        }

        rs = c.ejecutarSelect(q);

        if (rs.next()) {
            nombre = rs.getString(1);
        }
        c.desconectar();
        return nombre;
    }

    public String getObjetoString(int id, int tipo) throws SQLException {
        String nombre = "";
        if (tipo == NOMBRE) {
            q = "select nombre from objetos where id = " + id;
        } else if (tipo == 2) {
            q = "select imagen from objetos where id = " + id;
        }

        rs = c.ejecutarSelect(q);

        if (rs.next()) {
            nombre = rs.getString(1);
        }
        c.desconectar();
        return nombre;
    }
}
