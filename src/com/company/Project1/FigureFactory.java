package com.company.Project1;

import com.company.Constants;
import com.company.Points.Point_2D;

import java.util.ArrayList;
import java.util.Random;

public class FigureFactory {

    public ArrayList<Figure> createRandomFigures(int n) {
        ArrayList<Figure> result_array = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            result_array.add(createRandomFigure());
        }
        return result_array;
    }

    public Figure createRandomFigure() {
        Random r = new Random();
        int whichFigure = r.nextInt(3);
        Figure result_figure;

        switch (whichFigure) {
            case 0:
                result_figure = createCircle(
                        new Point_2D(r.nextInt(Constants.WINDOW_WIDTH), r.nextInt(Constants.WINDOW_HEIGHT)),
                        r.nextInt(150));
                break;
            case 1:
                result_figure = createTriangle(
                        new Point_2D(r.nextInt(Constants.WINDOW_WIDTH), r.nextInt(Constants.WINDOW_HEIGHT)),
                        new Point_2D(r.nextInt(Constants.WINDOW_WIDTH), r.nextInt(Constants.WINDOW_HEIGHT)) ,
                        new Point_2D(r.nextInt(Constants.WINDOW_WIDTH), r.nextInt(Constants.WINDOW_HEIGHT)));
                break;
            case 2:
                int bok = r.nextInt(150);
                int a = r.nextInt(Constants.WINDOW_WIDTH - bok);
                int b = r.nextInt(Constants.WINDOW_HEIGHT - bok);
                int c = a + bok;
                int d = b + bok;
                result_figure = createSquare(
                        new Point_2D(a, b),
                        new Point_2D(c, d));
                break;
            default:
                result_figure = createSquare(
                        new Point_2D(0 ,0),
                        new Point_2D(0, 0));
                break;
        }
        return result_figure;
    }

    public Square createSquare(Point_2D left_upper, Point_2D right_lower) {
        return new Square(left_upper, right_lower);
    }

    public Circle createCircle(Point_2D center, double radius) {
        return new Circle(center, radius);
    }

    public Triangle createTriangle(Point_2D a, Point_2D b, Point_2D c) {
        return new Triangle(a, b, c);
    }
}
