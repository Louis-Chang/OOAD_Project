package com.ooad.louis.shape;

import java.awt.*;

public class ALine extends Line {

    public ALine(Point startPt, Point endPt) {
        super(startPt, endPt);
        color = Color.green;
    }


    /* 畫箭頭
    private final int ARR_SIZE = 20;
    @Override
    public void createLine(Graphics g1, int x1, int y1, int x2, int y2) {
        Graphics2D g = (Graphics2D) g1.create();

        double dx = x2 - x1, dy = y2 - y1;
        double angle = Math.atan2(dy, dx);
        int len = (int) Math.sqrt(dx*dx + dy*dy);
        AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
        at.concatenate(AffineTransform.getRotateInstance(angle));
        g.transform(at);

        // Draw horizontal arrow starting in (0, 0)
        g.drawLine(0, 0, len, 0);
        g.drawPolygon(new int[] {len, len-ARR_SIZE, len-ARR_SIZE, len},
                new int[] {0, -ARR_SIZE, ARR_SIZE, 0}, 4);
    }*/

    /*@Override
    public void createLine(Graphics g, int x1, int y1, int x2, int y2) {
        super.createLine(g, x1, y1, x2, y2);
    }*/
}
