package com.company.Snailz.Engine;

import com.company.Snailz.Engine.Entities.Entities;
import com.company.Snailz.Engine.Entities.Entity;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class MainPanel extends JPanel {

    private Entities _entities;
    private MouseInput _mouse;

    public MainPanel(Entities entities) {
        this.setBackground(Color.BLACK);
        _entities = entities;
        _mouse = new MouseInput(entities);
        this.addMouseListener(_mouse);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        _entities.getMap().draw(g2d);
        for (Entity i : _entities.getObjects()) {
            i.draw(g2d);
        }
    }
}
