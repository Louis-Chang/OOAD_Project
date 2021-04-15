package com.ooad.louis.shape;

import com.ooad.louis.mode.CreateEntityMode;
import com.ooad.louis.util.ConstantValue;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UseCase extends Entity{

    private final int width = ConstantValue.USECASE_LENGTH;
    private final int height = ConstantValue.USECASE_LENGTH;

    public UseCase() {
    }

    public UseCase(Point point) {
        super(point);
        //createEntityMode = new CreateEntityMode();
        color = Color.cyan;
        ports = new ArrayList<>();
        ports.add(new Point(point.x+40, point.y-20));
        ports.add(new Point(point.x+100, point.y+40));
        ports.add(new Point(point.x+40, point.y+100));
        ports.add(new Point(point.x-20, point.y+40));

        portPanelList = new ArrayList<>();
    }

    @Override
    public void setPoint(Point point) {
        super.setPoint(point);
        ports = new ArrayList<>();
        ports.add(new Point(point.x+40, point.y-20));
        ports.add(new Point(point.x+100, point.y+40));
        ports.add(new Point(point.x+40, point.y+100));
        ports.add(new Point(point.x-20, point.y+40));
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
