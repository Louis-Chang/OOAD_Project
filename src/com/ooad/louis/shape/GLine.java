package com.ooad.louis.shape;

import java.awt.*;

public class GLine extends Line {
    public GLine(Point startPt, Point endPt) {
        super(startPt, endPt);
        color = Color.magenta;
    }
    /*@Override
    public void createLine(Graphics g, int x1, int y1, int x2, int y2) {
        super.createLine(g, x1, y1, x2, y2);
    }*/
}
