package com.ooad.louis.mode;

import com.ooad.louis.factory.ClassFactory;

import java.awt.event.MouseEvent;

public class CreateClassMode extends CreateEntityMode {

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        shapeFactory = new ClassFactory(e.getPoint());
        System.out.println("Create class mode");
    }
}
