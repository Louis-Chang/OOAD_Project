package com.ooad.louis.mode;

import com.ooad.louis.shape.Entity;
import com.ooad.louis.shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class SelectMode extends Mode{
    //private int entityIsSelect;
    private List<Point> ports;

    public SelectMode() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        Entity entity = (Entity) canvas.getEntityList().get(canvas.getPanelList().indexOf((JPanel)e.getSource()));
        System.out.println("e list: " + canvas.getEntityList().size() + "  p list: " + canvas.getPanelList().size());
        //setEntityIsSelect(getEntityIsSelect()+1);
        entity.setIsSelect(entity.getIsSelect()+1);
        if (entity.getIsSelect()%2 == 1) { //select
            System.out.println("select");
            canvas.setEntityNow(entity);
            canvas.setPanelNow((JPanel)e.getSource());
            canvas.setPortsToDraw(entity.getPorts());
        } else { //unselect
            System.out.println("unselect");
            canvas.setEntityNow(null);
            canvas.setPanelNow(null);
            canvas.setPortsToDraw(new ArrayList<>());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        Entity entity = (Entity) canvas.getEntityList().get(canvas.getPanelList().indexOf((JPanel)e.getSource()));
        int x = e.getX() + entity.getPoint().x;
        int y = e.getY() + entity.getPoint().y;
        //entity.setIsSelect(entity.getIsSelect()+1);

        canvas.getPortsToDraw().clear();

        entity.setPoint(new Point(x, y));
        entity.getPanel().setBounds(x, y, entity.getWidth(), entity.getHeight());
        //entity.setPortPanelPosition();
    }

    /*public int getEntityIsSelect() {
        return entityIsSelect;
    }

    public void setEntityIsSelect(int entityIsSelect) {
        this.entityIsSelect = entityIsSelect;
    }*/

    public List<Point> getPorts() {
        return ports;
    }

    public void setPorts(List<Point> ports) {
        this.ports = ports;
    }
}
