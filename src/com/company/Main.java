package com.company;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(2, -3);
        ComplexNumber[] Array;
        ArrayList<ComplexNumber> myArray = new ArrayList<>();

        myArray.add(new ComplexNumber());
        myArray.add(new ComplexNumber());
        myArray.add(new ComplexNumber());

        first.print();

        first.conjugate().print();

        first.substract(new ComplexNumber(1, -10)).print();

        for (ComplexNumber aMyArray : myArray) {
            aMyArray.print();
        }
    }
}




