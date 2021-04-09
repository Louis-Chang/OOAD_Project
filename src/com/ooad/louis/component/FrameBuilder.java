package com.ooad.louis.component;

import javax.swing.*;
import java.awt.*;

public class FrameBuilder extends JFrame{
    private JLayeredPane canvas;
    private JPanel toolPanel;
    private JMenuBar titleBar;

    public FrameBuilder() {
        JFrame jframe = new JFrame("UML Editor");
        jframe.setSize(1200, 900);
        jframe.setLocation(0,0);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().setLayout(new BorderLayout(5, 5));

        canvas = Canvas.getInstance();
        canvas.setBackground(Color.white);
        canvas.setOpaque(true);

        toolPanel = new ToolPanel(this);
        toolPanel.setPreferredSize(new Dimension(150, 1150));

        titleBar = new TitleBar();

        jframe.setJMenuBar(titleBar);
        jframe.add(canvas, BorderLayout.CENTER);
        jframe.add(toolPanel, BorderLayout.WEST);

        jframe.setVisible(true);
    }

    public ToolPanel getToolPanel() {
        return (ToolPanel) toolPanel;
    }

    public Canvas getCanvas() {
        return (Canvas) this.canvas;
    }


}
