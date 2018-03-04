package com.company.Points;

public class Point_3D extends Point_2D {
    private double z;

    public Point_3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDistanceFromZero() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public void print() {
        System.out.println("Point: x: " + this.x + " y: " + this.y + " z: " + this.z);
    }
}
