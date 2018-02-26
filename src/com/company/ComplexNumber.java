package com.company;

import java.util.Random;

public class ComplexNumber {

    // Private attributes of ComplexNumber:
    private double re;
    private double im;

    // Constructors:
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber() {
        Random rand1 = new Random();
        Random rand2 = new Random();

        this.re = rand1.nextInt(100) + 1;
        this.im = rand2.nextInt(100) + 1;
    }

    // Functional methods:
    public void print() {
        if (this.im >= 0)
            System.out.println(this.re + "+" + this.im + "i");
        else
            System.out.println(this.re + "" + this.im + "i");
    }

    public double modulus() {
        return Math.sqrt(this.re * this.re + this.im * this.im);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.re, -1 * this.im);
    }

    public ComplexNumber add(ComplexNumber x) {
        this.re += x.getRe();
        this.im += x.getIm();
        return this;
    }

    public ComplexNumber substract(ComplexNumber x) {
        this.re -= x.getRe();
        this.im -= x.getIm();
        return this;
    }

    // Getters & setters:
    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }
}
