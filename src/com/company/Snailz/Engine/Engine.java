package com.company.Snailz.Engine;
import com.company.Snailz.Engine.Entities.Entities;
import com.company.Snailz.Engine.Entities.EntityFactory;

import static com.company.Constants.SKIP_TICKS;

public class Engine {

    private Graphics _graphics;
    private Logic _logic;
    private Entities _entities;
    private EntityFactory _factory;

    public Engine() {
        _factory = new EntityFactory();
        _entities = _factory.makeEntities();
        _graphics = new Graphics(_entities);
        _logic = new Logic(_entities);
    }

    public void run() {
        long sleep_time;
        long next_tick = System.currentTimeMillis();
        long tick_start = System.currentTimeMillis();

        _graphics.makeFrame();

        while (true) {
            long dt = System.currentTimeMillis() - tick_start;
            _graphics.update();
            _logic.update(dt);

            next_tick += SKIP_TICKS;
            sleep_time = next_tick - System.currentTimeMillis();
            tick_start = System.currentTimeMillis();
            if( sleep_time >= 0 ) {
                try {
                    Thread.sleep(sleep_time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
