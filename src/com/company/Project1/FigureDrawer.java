package com.company.Project1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FigureDrawer extends JPanel {

    private ArrayList<Figure> _figures;

    public FigureDrawer(ArrayList<Figure> _figures) {
        this._figures = _figures;

        for (Figure i : _figures) {
            i.print();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Figure i : _figures) {
            i.draw(g);
        }
    }
}
