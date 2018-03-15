package com.company.Project1;

import com.company.Points.Point_2D;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class FigureProcessor {

    public static int FIGURES_SPEED = 4;

    private ArrayList<Figure> _figures;
    private Figure _focused_figure;
    private boolean _is_focus_present;

    public FigureProcessor(ArrayList<Figure> _figures) {
        this._figures = _figures;
        _is_focus_present = false;
    }

    public void handleMouseInput(Point_2D p) {
        for (Figure i : _figures) {
            if (i.isInside(p)) {
                _focused_figure = i;
                _is_focus_present = true;

                // move i to the end of list - for setting to foreground (temporary)
                _figures.remove(i);
                _figures.add(i);

                System.out.println("Selected figure at point: " + p.toString());
                return; // Not sure about which first
            }
        }
    }

    public void handleKeyboardInput(KeyEvent e) {
        if (_is_focus_present) {
            int key_id = e.getKeyCode();
            switch (key_id) {
                case KeyEvent.VK_DOWN:
                    _focused_figure.moveDown(FIGURES_SPEED);
                    break;
                case KeyEvent.VK_LEFT:
                    _focused_figure.moveLeft(FIGURES_SPEED);
                    break;
                case KeyEvent.VK_RIGHT:
                    _focused_figure.moveRight(FIGURES_SPEED);
                    break;
                case KeyEvent.VK_UP:
                    _focused_figure.moveUp(FIGURES_SPEED);
                    break;
                case KeyEvent.VK_DELETE:
                    _figures.remove(_focused_figure);
                    break;
                default:
                    break;
            }
        }
    }
}
