package com.company.Project1;

import com.company.Points.Point_2D;

import java.awt.*;

public class Circle implements Figure {
    private Point_2D center;
    private double radius;

    public Circle(Point_2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point_2D getCenter() {
        return center;
    }

    public void setCenter(Point_2D center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Circle c: " + this.center.toString() + " r: " + this.radius);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval((int)this.center.getX(), (int)this.center.getY(),  (int)this.radius, (int)this.radius);
    }

}
