package com.company.Points;

public class Point_2D extends Point_1D {
    protected double y;

    public Point_2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistanceFromZero() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public void print() {
        System.out.println("Point: x: " + this.x + " y: " + this.y);
    }

    public String toString() { return "(x_" + this.x + " y_" + this.y + ")";}
}
