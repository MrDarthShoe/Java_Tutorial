package com.company.Project1;

import com.company.Points.Point_2D;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

    private FigureProcessor _figure_processor;

    public MouseInput(FigureProcessor figure_processor) {
        _figure_processor = figure_processor;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        _figure_processor.handleMouseInput(new Point_2D(e.getX(), e.getY()));
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
