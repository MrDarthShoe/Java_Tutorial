package com.company.Project1;

import com.company.Points.Point_2D;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MouseInput implements MouseListener {

    private ArrayList<Figure> _figures;
    private Figure _focused_figure;
    private boolean _is_focus_found;

    public MouseInput(ArrayList<Figure> _figures) {
        _is_focus_found = false;
        this._figures = _figures;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point_2D p = new Point_2D(e.getX(), e.getY());
        for (Figure i : _figures) {
            if (i.isInside(p)) {
                _focused_figure = i;
                _is_focus_found = true;
                i.moveUp(10);
                System.out.println("Selected figure at point: " + p.toString());
                return;
            }
        }
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
