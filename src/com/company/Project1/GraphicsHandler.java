package com.company.Project1;

import com.company.ComplexNumber;
import com.company.Constants;

import javax.swing.*;

public class GraphicsHandler {

    private JFrame _frame;

    public GraphicsHandler() {
        _frame = new JFrame();
    }

    public void makeFrame(FiguresPanel panel) {
        _frame.setTitle("Simple Objects ?");
        _frame.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        _frame.setVisible(true);
        _frame.setResizable(false);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.add(panel);
        _frame.addKeyListener(new KeyInput(panel.getFigureProcessor()));
    }

    public void update(JPanel panel) {
        panel.repaint();
    }
}
