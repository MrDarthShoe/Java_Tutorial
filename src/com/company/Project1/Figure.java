package com.company.Project1;


import com.company.Points.Point_2D;

import java.awt.*;

public interface Figure {
    void print();
    void draw(Graphics g);
    boolean isInside(Point_2D point);
    void moveUp(int n);
    void moveDown(int n);
    void moveLeft(int n);
    void moveRight(int n);
}
