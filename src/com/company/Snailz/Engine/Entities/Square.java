package com.company.Snailz.Engine.Entities;

import java.awt.*;

public class Square implements Entity {
    protected int _x;
    protected int _y;
    protected int _height;
    protected int _width;


    public Square(int x, int y, int height, int width) {
        this._x = x;
        this._y = y;
        this._height = height;
        this._width = width;
    }

    public int getX() {
        return _x;
    }

    public void setX(int _x) {
        this._x = _x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int _y) {
        this._y = _y;
    }

    public int getHeight() {
        return _height;
    }

    public void setHeight(int _height) {
        this._height = _height;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int _width) {
        this._width = _width;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.black);
        g.fillRect(_x, _y, _width, _height);
    }

    @Override
    public void update(long dt) {

    }

    public double getLeftBound() {
        return _x;
    }

    public double getRightBound() {
        return _x + _width;
    }

    public double getUpperBound() {
        return _y;
    }

    public double getLowerBound() {
        return _y + _height;
    }
}
