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
        g.fillOval((int)(this.center.getX() - radius), (int)(this.center.getY() - radius),  2 * (int)this.radius, 2 * (int)this.radius);
    }

    @Override
    public boolean isInside(Point_2D point) {
        return radius > Math.sqrt(Math.pow((int)center.getX() - (int)point.getX(),2) + Math.pow((int)center.getY() - (int)point.getY(),2) );
    }

    @Override
    public void moveUp(int n) {
        this.center.setY(this.center.getY() - n);
    }

    @Override
    public void moveDown(int n) {
        this.center.setY(this.center.getY() + n);
    }

    @Override
    public void moveLeft(int n) {
        this.center.setX(this.center.getX() - n);
    }

    @Override
    public void moveRight(int n) {
        this.center.setX(this.center.getX() + n);
    }
}
