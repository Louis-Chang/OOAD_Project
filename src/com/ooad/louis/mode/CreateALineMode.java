package com.ooad.louis.mode;

import com.ooad.louis.factory.ALineFactory;

import java.awt.event.MouseEvent;

public class CreateALineMode extends CreateLineMode{


    public CreateALineMode() {
        super();
        //shapeFactory = new ALineFactory();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        startPt = e.getPoint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        //endPt = e.getPoint();
        //shapeFactory = new ALineFactory(startPt, endPt);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        endPt = e.getPoint();
        shapeFactory = new ALineFactory(startPt, endPt);
        canvas.repaint();
    }
}
