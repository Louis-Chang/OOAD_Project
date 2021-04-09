package com.ooad.louis.shape;

import com.ooad.louis.mode.CreateEntityMode;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public abstract class Entity extends Shape{


    public Entity() {
    }

    public Entity(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(int isSelect) {
        this.isSelect = isSelect;
    }

    public List<Point> getPorts() {
        return ports;
    }

    public void setPortPanelPosition() {
        for (int i=0; i<getPortPanelList().size(); i++) {
            JPanel panel1 = getPortPanelList().get(i);
            panel1.setBounds(getPorts().get(i).x, getPorts().get(i).y, 20, 20);
        }
    }


    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public List<JPanel> getPortPanelList() {
        return super.getPortPanelList();
    }

}
