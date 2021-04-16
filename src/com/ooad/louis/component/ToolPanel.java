package com.ooad.louis.component;

import com.ooad.louis.mode.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ToolPanel extends JPanel {
    //private JFrame jFrame;
    private Canvas canvas;
    private List<functionBtn> toolBar;
    //private int tool;

    public ToolPanel(FrameBuilder frameBuilder) {
        //this.jFrame = frameBuilder;
        canvas = Canvas.getInstance();
        this.setLayout(new GridLayout(6, 1, 10, 10));

        Icon icnSelect = resize(new ImageIcon(getClass().getResource("../img/select.png")));
        Icon icnALine = resize(new ImageIcon(getClass().getResource("../img/ALine.png")));
        Icon icnGLine = resize(new ImageIcon(getClass().getResource("../img/GLine.png")));
        Icon icnCLine = resize(new ImageIcon(getClass().getResource("../img/CLine.png")));
        Icon icnClass = resize(new ImageIcon(getClass().getResource("../img/class.png")));
        Icon icnUseCase = resize(new ImageIcon(getClass().getResource("../img/useCase.png")));

        /*functionBtn selectBtn = new functionBtn(new SelectMode(), icnSelect, "select");
        functionBtn aLineBtn = new functionBtn(new CreateLineMode(), icnALine, "ALine");
        functionBtn gLineBtn = new functionBtn((new CreateLineMode(), icnGLine, "GLine");
        functionBtn cLineBtn = new functionBtn(new CreateLineMode(), icnCLine, "CLine");
        functionBtn classBtn = new functionBtn(new CreateEntityMode(), icnClass, "class");
        functionBtn useCaseBtn = new functionBtn(new CreateEntityMode(), icnUseCase, "useCase");

        //Default
        selectBtn.setBackground(Color.blue);
        selectBtn.setOpaque(true);*/


        toolBar = new ArrayList<>();
        toolBar.add(new functionBtn(new SelectMode(), icnSelect, "select"));
        toolBar.add(new functionBtn(new CreateALineMode(), icnALine, "ALine"));
        toolBar.add(new functionBtn(new CreateGLineMode(), icnGLine, "GLine"));
        toolBar.add(new functionBtn(new CreateCLineMode(), icnCLine, "CLine"));
        toolBar.add(new functionBtn(new CreateClassMode(), icnClass, "class"));
        toolBar.add(new functionBtn(new CreateUseCaseMode(), icnUseCase, "useCase"));

        //Default
        toolBar.get(0).setBackground(Color.blue);
        toolBar.get(0).setOpaque(true);
        canvas.setMode(toolBar.get(0).getMode());
        //tool = 0;

        for (int i=0; i<toolBar.size(); i++) {
            this.add(toolBar.get(i));
            toolBar.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    functionBtn btn = (functionBtn) e.getSource();
                    canvas.removeMode();
                    canvas.setMode(btn.getMode());
                    if (SelectMode.class.equals(canvas.getMode().getClass())) {
                        canvas.addModeToPanel();
                    } else {
                        canvas.addMouseListener(btn.getMode());
                    }
                    System.out.println(canvas.getMode());
                    //tool = toolBar.indexOf(btn);
                    for (int j=0; j<toolBar.size(); j++) {
                        if (toolBar.indexOf(btn) == j) {
                            btn.setBackground(Color.blue);
                            btn.setOpaque(true);
                        } else {
                            toolBar.get(j).setBackground(Color.white);
                            toolBar.get(j).setOpaque(true);
                        }
                    }
                }
            });
        }

    }
    public ImageIcon resize(ImageIcon imageIcon) {
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new ImageIcon(newImage);
    }

    /*public int getTool() {
        return tool;
    }*/




    private class functionBtn extends JButton{
        private Mode mode;
        private Icon icon;
        private String name;

        public functionBtn(Mode mode, Icon icon, String name) {
            super(icon);
            this.mode = mode;
            this.icon = icon;
            this.name = name;
            //this.addMouseListener(mode);
        }

        public Mode getMode() {
            return mode;
        }
    }
}
