package com.ooad.louis.shape;
import com.ooad.louis.mode.CreateEntityMode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Class extends Entity {
    private final int width = 150;
    private final int height = 200;


    public Class(Point point) {
        super(point);
        color = Color.gray;
        //createEntityMode = new CreateEntityMode();
        ports = new ArrayList<>();
        ports.add(new Point(point.x+65, point.y-20));
        ports.add(new Point(point.x+150, point.y+90));
        ports.add(new Point(point.x+65, point.y+200));
        ports.add(new Point(point.x-20, point.y+90));

        portPanelList = new ArrayList<>();
        /*for (Point point1 : ports) {
            JPanel panel = new JPanel();
            panel.setBackground(Color.black);
            panel.setBounds(point1.x, point1.y, width, height);
            portPanelList.add(panel);
        }*/
    }

    public Class() {

    }

    @Override
    public void setPoint(Point point) {
        super.setPoint(point);
        ports = new ArrayList<>();
        ports.add(new Point(point.x+65, point.y-20));
        ports.add(new Point(point.x+150, point.y+90));
        ports.add(new Point(point.x+65, point.y+200));
        ports.add(new Point(point.x-20, point.y+90));

        /*for (Point point1 : ports) {
            JPanel panel = new JPanel();
            panel.setBackground(Color.black);
            panel.setBounds(point1.x, point1.y, width, height);
            portPanelList.add(panel);
        }*/
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
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
