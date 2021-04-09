package com.ooad.louis.component;

import com.ooad.louis.mode.CreateLineMode;
import com.ooad.louis.mode.Mode;
import com.ooad.louis.shape.*;
import com.ooad.louis.factory.EntityFactory;
import com.ooad.louis.shape.Class;
import com.ooad.louis.shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JLayeredPane {

    private static Canvas instance = null;
    private List<Shape> entityList;
    private List<JPanel> panelList;
    private List<Line> lineList;
    private List<Point> portsToDraw = new ArrayList<>();
    private Entity entityNow;
    private JPanel panelNow;
    //private int x1, y1, x2, y2;
    private Mode mode;


    private Canvas() {
        entityList = new ArrayList<>();
        panelList = new ArrayList<>();
        lineList = new ArrayList<>();
        addMouseListener(mode);
        addMouseMotionListener(mode);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(100, 100, 100, 100);
        panel.setOpaque(false);
        this.add(panel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (int i=0; i<portsToDraw.size(); i++) {
            g.fillRect(portsToDraw.get(i).x, portsToDraw.get(i).y, 20, 20);
            /*JPanel panel = new JPanel();
            panel.setBounds(portsToDraw.get(i).x, portsToDraw.get(i).y, 20, 20);
            panel.setBackground(Color.black);
            panel.addMouseListener(mode);
            panel.addMouseMotionListener(mode);
            this.add(panel);*/
        }
        //associationLine.createLine(g, 30, 300, 30, 190);
        //g.setColor(Color.lightGray);
        //g.fillRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));
        repaint();
    }

    public void removeMode() {
        for (MouseListener ml : this.getMouseListeners()) {
            this.removeMouseListener(ml);
        }
        for (MouseMotionListener mml : this.getMouseMotionListeners()) {
            this.removeMouseMotionListener(mml);
        }
        for (JPanel panel : this.getPanelList()) {
            for (MouseListener ml : panel.getMouseListeners()) {
                panel.removeMouseListener(ml);
            }
            for (MouseMotionListener mml : panel.getMouseMotionListeners()) {
                panel.removeMouseMotionListener(mml);
            }
        }
    }

    public void addModeToPanel() {
        for (JPanel panel : getPanelList()) {
            panel.addMouseListener(getMode());
            panel.addMouseMotionListener(getMode());
        }
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public List<Shape> getEntityList() {
        return entityList;
    }

    public void setPortsToDraw(List<Point> portsToDraw) {
        this.portsToDraw = portsToDraw;
    }

    public void addPortsToDraw(List<Point> portsToDraw) {
        for (int i=0; i<portsToDraw.size(); i++) {
            this.portsToDraw.add(portsToDraw.get(i));
        }
    }

    public List<Point> getPortsToDraw() {
        return portsToDraw;
    }

    public List<JPanel> getPanelList() {
        return panelList;
    }

    public List<Line> getLineList() {
        return lineList;
    }

    public void setLineList(List<Line> lineList) {
        this.lineList = lineList;
    }

    public boolean isInside(Point point, int x1, int y1, int x2, int y2) {
        boolean isInside;
        if (point.x>x1 && point.x<x2 && point.y>y1 && point.y<y2) {
            isInside = true;
        } else {
            isInside = false;
        }
        return isInside;
    }

    public Entity getEntityNow() {
        return entityNow;
    }

    public void setEntityNow(Entity entityNow) {
        this.entityNow = entityNow;
    }

    public JPanel getPanelNow() {
        return panelNow;
    }

    public void setPanelNow(JPanel panelNow) {
        this.panelNow = panelNow;
    }

    public void group() {

    }

    public void unGroup() {

    }

    public static Canvas getInstance() {
        if (instance == null) {
            instance = new Canvas();
        }
        return instance;
    }
}
