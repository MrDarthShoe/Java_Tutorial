package com.company.Project1;

import javax.swing.*;
import java.util.ArrayList;

public class GraphicsHandler {

    private JFrame _frame;
    private FigureDrawer _figure_drawer;
    private FigureFactory _factory;

    public GraphicsHandler() {
        _frame = new JFrame();
        _factory = new FigureFactory();
        _figure_drawer = new FigureDrawer(_factory.createRandomFigures(5));
    }

    public void run() {
        makeFrame();
    }

    private void makeFrame() {

        _frame.setTitle("Simple Objects ?");
        _frame.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        _frame.setVisible(true);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.add(_figure_drawer);
    }
}
