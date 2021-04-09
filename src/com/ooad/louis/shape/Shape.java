package com.ooad.louis.shape;

import com.ooad.louis.mode.CreateEntityMode;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public abstract class Shape {
    protected String name;
    protected CreateEntityMode createEntityMode;
    protected Point point;
    protected int width, height;
    protected int isSelect;
    protected List<Point> ports;
    protected Color color;
    protected JPanel panel;
    protected JLabel label;
    protected List<JPanel> portPanelList;

    public Shape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEntityMode getCreateEntityMode() {
        return createEntityMode;
    }

    public void setCreateEntityMode(CreateEntityMode createEntityMode) {
        this.createEntityMode = createEntityMode;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
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

    public void setPorts(List<Point> ports) {
        this.ports = ports;
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

    public abstract Color getColor();

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

    public List<JPanel> getPortPanelList() {
        return portPanelList;
    }
}
