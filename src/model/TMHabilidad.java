package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMHabilidad implements TableModel {

    List<Habilidad> habilidades;

    public TMHabilidad(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public int getRowCount() {
        return habilidades.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else {
            return "Habilidad";
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
        Habilidad h = habilidades.get(rowIndex);
        if (columnIndex == 0) {
            return h.getId();
        } else {
            return h.getNombre();
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
