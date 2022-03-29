/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitylookuptool;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bzc5373
 */
public class ResultTable extends AbstractTableModel {
    private String[] columnNames = {"First Name", "Last Name", "Campus"};
    private ArrayList<Person> personList;
    
    public ResultTable(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    @Override
    public int getRowCount() {
        return personList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
       switch(col) {
           case 0: return (Object) personList.get(row).getFirstName();
           case 1: return (Object) personList.get(row).getLastName();
           case 2: return (Object) personList.get(row).getCampus();
           default: return null;
       }
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
}
