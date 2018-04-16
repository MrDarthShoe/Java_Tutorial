package com.company.Snailz.Engine.Entities.Map;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.IDrawable;
import com.company.Snailz.Engine.Entities.IUpdatable;

import java.awt.*;
import java.util.ArrayList;

public class Map implements IUpdatable, IDrawable{
    private ArrayList<ArrayList<Tile>> _map;

    public Map(int rows, int columns) {
        _map = new ArrayList<>();

        for (int i = 0; i < rows; ++i) {
            _map.add(new ArrayList<Tile>());
            for(int j = 0; j < columns; ++j) {
                _map.get(i).add(new Tile(0,0,0));
            }
        }
    }

    public int getSizeX() {
        return _map.size();
    }

    public int getSizeY() {
        return  _map.get(0).size();
    }

    public void printSize() {
        System.out.println("size of map: " + _map.size() + " " + _map.get(0).size());
    }

    public Tile getTileAt(int x, int y) {
        return _map.get(x / Constants.TILE_SIZE).get(y / Constants.TILE_SIZE);
    }

    public Tile getTile(int row, int column) {
        return _map.get(row).get(column);
    }

    public void setTileAt(Tile tile, int row, int column) {
        _map.get(row).set(column, tile);
    }

    @Override
    public void update(long dt) {
        for (ArrayList<Tile> list : _map) {
            for (Tile tile : list) {

//                Thread thread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        tile.update(dt);
//                    }
//                });
//                thread.start();
                tile.update(dt);
            }
        }
    }

    @Override
    public void draw(Graphics2D g) {
        for (ArrayList<Tile> list : _map) {
            for (Tile tile : list) {
                tile.draw(g);
            }
        }
    }
}
