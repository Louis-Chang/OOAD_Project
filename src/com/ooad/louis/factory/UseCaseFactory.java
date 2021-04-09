package com.ooad.louis.factory;

import com.ooad.louis.shape.UseCase;

import java.awt.*;

public class UseCaseFactory extends EntityFactory{
    public UseCaseFactory(Point point) {
        super(point);
    }

    @Override
    public void createEntity(Point point) {
        shape = new UseCase(point);
        super.createEntity(point);
    }

    @Override
    public void createLine(Point startPt, Point endPt) {
    }
}
