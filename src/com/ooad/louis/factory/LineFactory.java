package com.ooad.louis.factory;


import com.ooad.louis.component.Canvas;
import com.ooad.louis.shape.Line;
import com.ooad.louis.shape.Shape;

import java.awt.*;

public abstract class LineFactory implements ShapeFactory{

    protected Canvas canvas;
    protected Point startPt, endPt;
    protected Line line;

    public LineFactory() {
    }

    public LineFactory(Point startPt, Point endPt) {
        canvas = Canvas.getInstance();
        this.startPt = startPt;
        this.endPt = endPt;
    }

    @Override
    public void createEntity(Point point) {
    }

    @Override
    public void createLine(Point startPt, Point endPt) {
        line.setStartPt(startPt);
        line.setEndPt(endPt);
    }
}
