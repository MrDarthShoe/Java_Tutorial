package com.company.Snailz.Engine;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.Creatures.Snail;
import com.company.Snailz.Engine.Entities.Entities;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
    private Entities _entities;

    public MouseInput(Entities entities) {
        _entities = entities;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        _entities.getObjects().add(new Snail(e.getX(),e.getY(), Constants.TILE_SIZE));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
