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
        entity.setIsSelect(entity.getIsSelect()+1);

        if (entity.getIsSelect()%2 == 1) { //select
            System.out.println("select");
            canvas.setEntityNow(entity);
            for (JPanel panel : entity.getPortPanelList()) {
                panel.setOpaque(true);
                System.out.println("true");
                //panel.setBackground(Color.BLACK);
            }
            for (int i=0; i<canvas.getEntityList().size(); i++) {
                Shape shape = canvas.getEntityList().get(i);
                if (!shape.equals(entity)) {
                    for (JPanel jPanel : shape.getPortPanelList()) {
                        //jPanel.setBackground(Color.white);
                        jPanel.setOpaque(false);
                        System.out.println("false");
                    }
                }
            }
            canvas.setPanelNow((JPanel)e.getSource());
            //canvas.setPortsToDraw(entity.getPorts());
        } else { //unselect
            System.out.println("unselect");
            canvas.setEntityNow(null);
            canvas.setPanelNow(null);
            for (JPanel panel : entity.getPortPanelList()) {
                //panel.setBackground(Color.WHITE);
                panel.setOpaque(false);
            }
            //canvas.setPortsToDraw(new ArrayList<>());
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
        entity.setPoint(new Point(x, y));
        entity.getPanel().setBounds(x, y, entity.getWidth(), entity.getHeight());
        entity.setPortPanelPosition();
    }


    public List<Point> getPorts() {
        return ports;
    }

    public void setPorts(List<Point> ports) {
        this.ports = ports;
    }
}
