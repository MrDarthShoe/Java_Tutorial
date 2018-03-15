package com.company.Project1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

    private FigureProcessor _figure_processor;

    public KeyInput(FigureProcessor _figure_processor) {
        this._figure_processor = _figure_processor;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        _figure_processor.handleKeyboardInput(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
