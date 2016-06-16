package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMObjeto implements TableModel {

    List<Objeto> objetos;

    public TMObjeto(List<Objeto> objetos) {
        this.objetos = objetos;
    }

    @Override
    public int getRowCount() {
        return objetos.size();
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
            return "Objeto";
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
        Objeto o = objetos.get(rowIndex);
        if (columnIndex == 0) {
            return o.getId();
        } else {
            return o.getNombre();
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
