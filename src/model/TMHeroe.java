package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMHeroe implements TableModel {

    List<Heroe> heroes;

    public TMHeroe(List<Heroe> heroes) {
        this.heroes = heroes;
    }

    @Override
    public int getRowCount() {
        return heroes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else if (columnIndex == 1) {
            return "Nombre";
        } else {
            return "Título";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Heroe h = heroes.get(rowIndex);

        if (columnIndex == 0) {
            return h.getId();
        } else if (columnIndex == 1) {
            return h.getNombre();
        } else {
            return h.getTitulo();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
