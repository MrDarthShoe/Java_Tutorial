package com.company.Project1;

import com.company.Points.Point_2D;

import java.awt.*;

public class Triangle implements Figure {
    private Point_2D a, b, c;

    public Triangle(Point_2D a, Point_2D b, Point_2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point_2D getA() {
        return a;
    }

    public void setA(Point_2D a) {
        this.a = a;
    }

    public Point_2D getB() {
        return b;
    }

    public void setB(Point_2D b) {
        this.b = b;
    }

    public Point_2D getC() {
        return c;
    }

    public void setC(Point_2D c) {
        this.c = c;
    }

    @Override
    public void print() {
        System.out.println("Triangle a: " + this.a.toString() + " b: " + this.b.toString() + " c: " + this.c.toString());
    }

    @Override
    public void draw(Graphics g) {
        int[] x = {(int)this.a.getX(), (int)this.b.getX(), (int)this.c.getX()};
        int[] y = {(int)this.a.getY(), (int)this.b.getY(), (int)this.c.getY()};

        Polygon p = new Polygon(x, y, 3);
        g.setColor(Color.BLUE);
        g.fillPolygon(p);
    }
}
