package com.company.Points;

public class Point_1D {
    protected double x;

    public Point_1D(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getDistanceFromZero() {
        return Math.abs(this.x);
    }

    public void print() {
        System.out.println("Point: x: " + this.x);
    }
}
