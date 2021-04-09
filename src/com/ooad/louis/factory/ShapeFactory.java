package com.ooad.louis.factory;

import com.ooad.louis.component.Canvas;
import com.ooad.louis.shape.Shape;

import java.awt.*;

public interface ShapeFactory {
    public void createEntity(Point point);
    public void createLine(Point startPt, Point endPt);
}
