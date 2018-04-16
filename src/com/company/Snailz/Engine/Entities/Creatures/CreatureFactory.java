package com.company.Snailz.Engine.Entities.Creatures;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.Actors;

import java.util.Random;

public class CreatureFactory {
    public Actors makeNSnails(int n) {
        Actors result = new Actors();
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            result.add(new Snail(r.nextInt(Constants.WINDOW_WIDTH - Constants.TILE_SIZE),
                                 r.nextInt(Constants.WINDOW_HEIGHT - Constants.TILE_SIZE),
                                 Constants.TILE_SIZE));
        }
        return result;
    }
}
