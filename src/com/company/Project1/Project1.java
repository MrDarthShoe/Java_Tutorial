package com.company.Project1;

import java.util.ArrayList;

import static com.company.Project1.Constants.SKIP_TICKS;

public class Project1 {
    private ArrayList<Figure> _figures;
    private GraphicsHandler _graphics;
    private FiguresPanel _figure_processor;

    public Project1(int n) {
        FigureFactory _factory = new FigureFactory();
        _figures = _factory.createRandomFigures(n);
        _graphics = new GraphicsHandler();
        _figure_processor = new FiguresPanel(_figures);
    }

    public void run() {
        long sleep_time;
        long next_tick = System.currentTimeMillis();

        _graphics.makeFrame(_figure_processor);

        while (true) {

            _graphics.update(_figure_processor);

            next_tick += SKIP_TICKS;
            sleep_time = next_tick - System.currentTimeMillis();

            if( sleep_time >= 0 ) {
                try {
                    Thread.sleep(sleep_time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            else {
//                System.out.println("ERR: Program is running slow!");
//            }
        }
    }
}
