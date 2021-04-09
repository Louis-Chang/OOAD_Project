package com.ooad.louis.factory;

import com.ooad.louis.component.Canvas;
import com.ooad.louis.shape.Shape;

import javax.swing.*;
import java.awt.*;

public abstract class EntityFactory implements ShapeFactory{

    protected Canvas canvas;
    protected JPanel panel;
    protected JLabel label;
    protected Shape shape;

    public EntityFactory(Point point) {
        canvas = Canvas.getInstance();
        createEntity(point);
    }

    @Override
    public void createEntity(Point point) {
        shape.setPoint(point);
        panel = new JPanel();
        label = new JLabel("Unnamed");
        panel.add(label);
        panel.setOpaque(true);
        panel.setBackground(shape.getColor());
        panel.setBounds(point.x, point.y, shape.getWidth(), shape.getHeight());
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        shape.setPanel(panel);
        shape.setLabel(label);
        canvas.getEntityList().add(shape);
        canvas.getPanelList().add(panel);
        canvas.add(panel, new Integer(canvas.getEntityList().indexOf(shape)));

        for (int i=0; i<shape.getPorts().size(); i++) {
            //g.fillRect(portsToDraw.get(i).x, portsToDraw.get(i).y, 20, 20);
            JPanel panel1 = new JPanel();
            panel1.setBounds(shape.getPorts().get(i).x, shape.getPorts().get(i).y, 20, 20);
            panel1.setBackground(Color.white);
            panel1.setOpaque(true);
            panel1.addMouseListener(canvas.getMode());
            panel1.addMouseMotionListener(canvas.getMode());
            shape.getPortPanelList().add(panel1);
            canvas.add(panel1, new Integer(canvas.getEntityList().indexOf(shape)));
        }
    }


    public JPanel getPanel() {
        return panel;
    }

    public void setPosition(Shape shape, JPanel panel, Point point) {
        panel.setBounds(point.x, point.y, shape.getWidth(), shape.getHeight());
    }

    public JLabel getLable() {
        return label;
    }

    public void setName(String name) {
        this.label.setText(name);
    }

}
