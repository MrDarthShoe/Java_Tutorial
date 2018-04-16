package com.company.Snailz.Engine.Entities.Map;

import com.company.Snailz.Engine.Entities.Creatures.Snail;
import com.company.Snailz.Engine.Entities.Square;

import java.awt.*;

public class Tile extends Square{

    protected Color _color;

    public Tile(int x, int y, int a) {
        super(x,y, a, a);
    }

    @Override
    public void draw(Graphics2D g) {

        g.setColor(_color);
        g.fillRect(_x, _y, _width, _height);

        g.setColor(Color.BLACK);
        g.drawRect(_x, _y, _width, _height);
    }

    @Override
    synchronized public void update(long dt) {

    }

    public void interact(Snail snail) {

    }
}
