package com.ooad.louis.mode;

import com.ooad.louis.component.Canvas;
import com.ooad.louis.factory.ShapeFactory;
import com.ooad.louis.shape.Shape;

import java.awt.*;
import java.awt.event.MouseEvent;


public abstract class CreateLineMode extends Mode{
    protected ShapeFactory shapeFactory;
    protected Point startPt, endPt;

    public CreateLineMode() {
    }

}
