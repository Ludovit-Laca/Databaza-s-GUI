/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lacal
 */
public class SimpleTableModel extends AbstractTableModel {

    ResultSet rs;
    ResultSetMetaData md;
    int numcols, numrows;
    Statement stmt;
    String[] hlavicky;

    public SimpleTableModel(Connection con) {
        try {
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void RefreshResultSet(String command) {
        try {
            rs = stmt.executeQuery(command);
            md = rs.getMetaData();
            numcols = md.getColumnCount();
            rs.last();
            numrows = rs.getRow();
            fireTableDataChanged();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String getColumnName(int column) {
        try {
            ResultSetMetaData md = rs.getMetaData();
            int stlpce = md.getColumnCount();
            hlavicky = new String[stlpce];
            for (int i = 0; i < stlpce; i++) {
                hlavicky[i] = md.getColumnName(i + 1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hlavicky[column];
    }

    @Override
    public int getRowCount() {
        return numrows;
    }

    @Override
    public int getColumnCount() {
        return numcols;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        try {
            rs.absolute(i+1);
            Object o = rs.getObject(i1+1);
            if (o == null) {
                return null;
            } else {
                return o.toString();
            }

        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    
}
