package com.company.Project1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FiguresPanel extends JPanel {

    private ArrayList<Figure> _figures;
    private Figure _focused_figure;
    private boolean _is_focus_found;

    public FiguresPanel(ArrayList<Figure> _figures) {
        super();
        this._is_focus_found = false;
        this._figures = _figures;
        this.setBackground(Color.BLACK);
        this.addMouseListener(new MouseInput(_figures));

        for (Figure i : (_figures)) {
            i.print();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figure i : _figures) {
            i.draw(g);
        }
    }
}
