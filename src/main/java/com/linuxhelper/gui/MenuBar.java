package com.linuxhelper.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;

/**
 *
 * @author mrsaqibale
 */

public class MenuBar extends JMenuBar {
    public MenuBar() {
        // file items 
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        add(fileMenu);

        //edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        add(editMenu);
        
        
        //Tools
        JMenu toolMenu = new JMenu("Tools");
        JMenuItem cmdOfflineItem = new JMenuItem("Commands Offline");
        toolMenu.add(cmdOfflineItem);
        add(toolMenu);

        // Add more menus and items as needed
    }
}