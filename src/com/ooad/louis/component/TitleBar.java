package com.ooad.louis.component;

import com.ooad.louis.mode.GroupMode;
import com.ooad.louis.mode.SelectMode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleBar extends JMenuBar {
    private Canvas canvas;
    private JMenu file;
    private JMenu edit;
    private JMenuItem group, ungroup, changeObjectName;

    public TitleBar() {
        canvas = Canvas.getInstance();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        group = new JMenuItem("Group");
        group.addActionListener(new GroupObjectListener());
        ungroup = new JMenuItem("UnGroup");
        ungroup.addActionListener(new UngroupObjectListener());
        changeObjectName = new JMenuItem("Change object name");
        changeObjectName.addActionListener(new ChangeNameListener());

        edit.add(group);
        edit.add(ungroup);
        edit.add(changeObjectName);
        this.add(file);
        this.add(edit);
    }

    public void changeName() {
        if (canvas.getEntityNow()!=null && canvas.getPanelNow()!=null) {
            String name = JOptionPane.showInputDialog("Enter new name");
            if(name != null || "".equals(name)) {
                canvas.getEntityNow().getLabel().setText(name);
            }
        } else {
            JOptionPane.showMessageDialog(canvas, "No item is selected! ");
        }
    }

    class GroupObjectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //canvas.group();
            if (SelectMode.class.equals(canvas.getMode().getClass())) {
                canvas.addMouseListener(new GroupMode());
                canvas.addMouseMotionListener(new GroupMode());
            } else {
                JOptionPane.showMessageDialog(canvas, "Please change to Select mode! ");
            }
        }
    }

    class UngroupObjectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //canvas.unGroup();
            //canvas.removeMode();
        }
    }

    class ChangeNameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            changeName();
        }
    }
}
