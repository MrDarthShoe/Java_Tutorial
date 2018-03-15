package com.company.Project1;


import com.company.Points.Point_2D;

import java.awt.*;

public class Square implements Figure {
    private Point_2D leftUpper;
    private Point_2D rightLower;

    public Square(Point_2D leftUpper, Point_2D rightLower) {
        this.leftUpper = leftUpper;
        this.rightLower = rightLower;
    }

    public Point_2D getLeftUpper() {
        return leftUpper;
    }

    public void setLeftUpper(Point_2D leftUpper) {
        this.leftUpper = leftUpper;
    }

    public Point_2D getRightLower() {
        return rightLower;
    }

    public void setRightLower(Point_2D rightLower) {
        this.rightLower = rightLower;
    }

    @Override
    public void print() {
        System.out.println("Square lu: " + this.leftUpper.toString() + " rl: " + this.rightLower.toString());
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int)this.leftUpper.getX(), (int)this.leftUpper.getY(),(int)this.rightLower.getX() - (int)this.leftUpper.getX(),(int)this.rightLower.getY() -(int)this.leftUpper.getY());
    }

    @Override
    public boolean isInside(Point_2D point) {
        return  point.getX() > leftUpper.getX()  &&
                point.getX() < rightLower.getX() &&
                point.getY() > leftUpper.getY()  &&
                point.getY() < rightLower.getY();
    }

    @Override
    public void moveUp(int n) {
        this.leftUpper.setY(this.leftUpper.getY() - n);
        this.rightLower.setY(this.rightLower.getY() - n);
    }

    @Override
    public void moveDown(int n) {
        this.leftUpper.setY(this.leftUpper.getY() + n);
        this.rightLower.setY(this.rightLower.getY() + n);
    }

    @Override
    public void moveLeft(int n) {
        this.leftUpper.setX(this.leftUpper.getX() - n);
        this.rightLower.setX(this.rightLower.getX() - n);
    }

    @Override
    public void moveRight(int n) {
        this.leftUpper.setX(this.leftUpper.getX() + n);
        this.rightLower.setX(this.rightLower.getX() + n);
    }
}
