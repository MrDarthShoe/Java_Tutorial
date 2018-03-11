package com.company;

import com.company.Points.Point_1D;
import com.company.Points.Point_2D;
import com.company.Points.Point_3D;
import com.company.Project1.Figure;
import com.company.Project1.FigureFactory;
import com.company.Project1.GraphicsHandler;

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
            case 3:
                project1();
                break;
            default:
                System.out.println("No such problem in ProblemHandler!");
        }
    }

    private void project1() {
        GraphicsHandler graphics = new GraphicsHandler();

        graphics.run();
    }

    private void pointsProblem() {
        ArrayList<Point_1D> pointsArray = new ArrayList<>();

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
            writer.write("8\n");
            writer.write("2 2\n");
            writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuffer = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                int[] points = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

                if (points.length == 3)
                    pointsArray.add(new Point_3D(points[0], points[1], points[2]));
                else if (points.length == 2)
                    pointsArray.add(new Point_2D(points[0], points[1]));
                else if (points.length == 1)
                    pointsArray.add(new Point_1D(points[0]));
            }
            reader.close();

            for (Point_1D i: pointsArray) {
                i.print();
                System.out.println("Distance is: " + i.getDistanceFromZero());
            }

            pointsArray.sort(Comparator.comparingDouble(Point_1D::getDistanceFromZero));

            for (Point_1D i: pointsArray) {
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
