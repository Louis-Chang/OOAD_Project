package com.ooad.louis.factory;
import com.ooad.louis.shape.Class;

import java.awt.*;

public class ClassFactory extends EntityFactory{

    public ClassFactory(Point point) {
        super(point);
    }

    @Override
    public void createEntity(Point point) {
        shape = new Class(point);
        super.createEntity(point);
    }

    @Override
    public void createLine(Point startPt, Point endPt) {
    }
}
