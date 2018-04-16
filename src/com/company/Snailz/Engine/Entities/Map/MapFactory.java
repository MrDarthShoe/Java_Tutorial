package com.company.Snailz.Engine.Entities.Map;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.Entities;

public class MapFactory {

    public Map makeMap( ) {
        int num_x_tiles = Constants.MAP_WIDTH / Constants.TILE_SIZE + 1;
        int num_y_tiles = Constants.MAP_HEIGHT / Constants.TILE_SIZE + 1;
        Map result = new Map(num_x_tiles, num_y_tiles);

        for (int x = 0; x < Constants.MAP_WIDTH; x += Constants.TILE_SIZE) {
            for (int y = 0; y < Constants.MAP_HEIGHT; y += Constants.TILE_SIZE) {
                result.setTileAt(new Grass(x,y,Constants.TILE_SIZE), x / Constants.TILE_SIZE, y / Constants.TILE_SIZE);
            }
        }
        return result;
    }
}
