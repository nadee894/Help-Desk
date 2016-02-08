/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commonclasses;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Nadeesha
 */
public class MyRender extends DefaultTableCellRenderer implements TableCellRenderer{
     @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
         
        Component c =super.getTableCellRendererComponent(table, value,isSelected, hasFocus,row, column);
        
        int qoh=Integer.parseInt(table.getValueAt(row, 2)+"");
        int rol=Integer.parseInt(table.getValueAt(row, 3)+"");
        if(qoh<rol){
            c.setBackground(Color.red);
        }else{
            c.setBackground(Color.white);
        }
        
        return c;
     }
}
