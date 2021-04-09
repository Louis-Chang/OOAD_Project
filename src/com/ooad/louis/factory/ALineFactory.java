package com.ooad.louis.factory;

import com.ooad.louis.shape.ALine;

import java.awt.*;

public class ALineFactory extends LineFactory{
    public ALineFactory() {
    }

    public ALineFactory(Point startPt, Point endPt) {
        super(startPt, endPt);
        createLine(startPt, endPt);
    }

    @Override
    public void createLine(Point startPt, Point endPt) {
        line = new ALine(startPt, endPt);
        super.createLine(startPt, endPt);
        canvas.getLineList().add(line);
    }
}
