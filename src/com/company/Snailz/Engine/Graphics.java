package com.company.Snailz.Engine;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.Entities;


import javax.swing.*;

public class Graphics {
    private JFrame _frame;
    private MainPanel _panel;


    public Graphics(Entities entities) {
        _panel = new MainPanel(entities);
        _frame = new JFrame();
    }

    public void makeFrame() {
        _frame.setTitle("SNAILZ");
        _frame.setSize(Constants.WINDOW_WIDTH + 16, Constants.WINDOW_HEIGHT + 40);
        _frame.setVisible(true);
        _frame.setResizable(false);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.add(_panel);
    }
    public void update() {
        _panel.repaint();
    }
}
