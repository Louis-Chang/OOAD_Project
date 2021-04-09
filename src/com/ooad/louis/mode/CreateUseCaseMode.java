package com.ooad.louis.mode;

import com.ooad.louis.factory.UseCaseFactory;

import java.awt.event.MouseEvent;

public class CreateUseCaseMode extends CreateEntityMode {

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        shapeFactory = new UseCaseFactory(e.getPoint());
        System.out.println("Create useCase mode");
    }
}
