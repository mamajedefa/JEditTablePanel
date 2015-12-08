/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.att.fk9424.jedittable.util.table.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author fk9424
 */
public class AddAlertMenuItem extends JMenuItem implements ActionListener {
    private TablePopUpMenu menu;
    
    public AddAlertMenuItem(String title, TablePopUpMenu menu){
        super(title);
        this.menu = menu;
        this.addActionListener(this);
    }        

    @Override
    public void actionPerformed(ActionEvent e) {
        menu.fireAlertRowAdding();
    }
}