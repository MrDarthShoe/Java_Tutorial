package com.company.Snailz.Engine;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.Creatures.Creature;
import com.company.Snailz.Engine.Entities.Entities;
import com.company.Snailz.Engine.Entities.Entity;


public class Logic {

    private Entities _entities;

    public Logic(Entities entities) {
        _entities = entities;
    }

    public void update(long dt) {

        checkCollisions();

        _entities.getMap().update(dt);

        for (Entity i : _entities.getObjects()){
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    i.update(dt);
                }
            });
            thread.start();
        }
    }

    void checkCollisions() {
//        for (Square obj : _entities.getObjects()){
//            int left_tile = (int)(obj.getLeftBound() / Constants.TILE_SIZE);
//            int right_tile = (int)(obj.getRightBound() / Constants.TILE_SIZE);
//            int top_tile = (int)(obj.getUpperBound() / Constants.TILE_SIZE);
//            int bottom_tile = (int)(obj.getLowerBound() / Constants.TILE_SIZE);
//
//            if(left_tile < 0) left_tile = 0;
//            if(right_tile > _entities.getMap().getSizeX()) right_tile = _entities.getMap().getSizeX();
//            if(top_tile < 0) top_tile = 0;
//            if(bottom_tile > _entities.getMap().getSizeY()) bottom_tile = _entities.getMap().getSizeY();
//
//            for (int i = left_tile; i <= right_tile; ++i) {
//                for (int j = top_tile; i <= bottom_tile; ++i) {
//                    Tile t = _entities.getMap().getTile(i,j);
//
//                }
//            }
//        }

        for (Creature obj : _entities.getObjects()){
            obj.set_B_tile(_entities.getMap().getTileAt(obj.getX(),obj.getY()));
        }
    }
}
