package com.ooad.louis.mode;

import com.ooad.louis.component.Canvas;
import com.ooad.louis.factory.ShapeFactory;
import com.ooad.louis.shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public abstract class CreateLineMode extends Mode{
    protected ShapeFactory shapeFactory;
    protected Point startPt, endPt;
    protected JPanel entityStart, entityEnd;

    public CreateLineMode() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        startPt = e.getPoint();
        //(JPanel)e.getSource()
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
    }
}
