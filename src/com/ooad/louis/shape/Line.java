package com.ooad.louis.shape;

import java.awt.*;

public abstract class Line extends Shape{

    private Point startPt, endPt;

    public Line(Point startPt, Point endPt) {
        this.startPt = startPt;
        this.endPt = endPt;
    }

    @Override
    public Color getColor() {
        return Color.black;
    }

    public Point getStartPt() {
        return startPt;
    }

    public void setStartPt(Point startPt) {
        this.startPt = startPt;
    }

    public Point getEndPt() {
        return endPt;
    }

    public void setEndPt(Point endPt) {
        this.endPt = endPt;
    }
}
