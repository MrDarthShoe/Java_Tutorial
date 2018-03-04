package com.company;

import com.company.Points.Point_3D;

import java.io.*;
import java.util.*;

public class ProblemHandler {

    public void solve(int problemNumber) {
        switch (problemNumber)  {
            case 1:
                complexNumberProblem();
                break;
            case 2:
                pointsProblem();
                break;
            default:
                System.out.println("No such problem in ProblemHandler!");
        }
    }

    private void pointsProblem() {
        ArrayList<Point_3D> pointsArray = new ArrayList<>();

        try {

            File file = new File("points.txt");

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("1 1 1\n");
            writer.write("2 2 2\n");
            writer.write("3 3 3\n");
            writer.write("4 4 4\n");
            writer.write("1 0 0\n");
            writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuffer = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                int[] points = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
                pointsArray.add(new Point_3D(points[0], points[1], points[2]));
            }
            reader.close();

            for (Point_3D i: pointsArray) {
                i.print();
                System.out.println("Distance is: " + i.getDistanceFromZero());
            }

            pointsArray.sort(Comparator.comparingDouble(Point_3D::getDistanceFromZero));

            for (Point_3D i: pointsArray) {
                i.print();
                System.out.println("Distance is: " + i.getDistanceFromZero());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void complexNumberProblem() {
        ComplexNumber first = new ComplexNumber(2, -3);
        ArrayList<ComplexNumber> complexArray = new ArrayList<>();

        complexArray.add(new ComplexNumber());
        complexArray.add(new ComplexNumber());
        complexArray.add(new ComplexNumber());

        first.print();

        first.conjugate().print();

        first.substract(new ComplexNumber(1, -10)).print();

        for (ComplexNumber MyArray : complexArray) {
            MyArray.print();
        }
    }
}
