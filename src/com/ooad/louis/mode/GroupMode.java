package com.ooad.louis.mode;

import com.ooad.louis.component.Canvas;
import com.ooad.louis.shape.Entity;
import com.ooad.louis.shape.Shape;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class GroupMode extends SelectMode{

    public GroupMode() {
        canvas = Canvas.getInstance();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //super.mousePressed(e);
        canvas.setStartPoint(e.getX(), e.getY());
        canvas.setEndPoint(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //super.mouseReleased(e);
        //canvas.setEndPoint(e.getX(), e.getY());
        for (Shape entity : canvas.getEntityList()) {
            if (canvas.isGroup(entity)) {
                entity.setIsSelect(entity.getIsSelect()+1);
                JPanel jPanel = canvas.getPanelList().get(canvas.getEntityList().indexOf(entity));
                for (JPanel port : entity.getPortPanelList()) {
                    port.setOpaque(true);
                }
            }
        }
        canvas.setStartPoint(0, 0);
        canvas.setEndPoint(0, 0);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //super.mouseDragged(e);
        canvas.setEndPoint(e.getX(), e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //super.mouseClicked(e);
        canvas.setStartPoint(0, 0);
        canvas.setEndPoint(0, 0);
    }
}
