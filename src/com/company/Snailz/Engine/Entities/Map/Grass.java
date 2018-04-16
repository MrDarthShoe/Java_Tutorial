package com.company.Snailz.Engine.Entities.Map;

import com.company.Snailz.Engine.Entities.Creatures.Snail;

import java.awt.*;

public class Grass extends Tile{

    private int _grass_level;
    private long _accumulated_time;

    public Grass(int x, int y, int a) {
        super(x, y, a);
        _color = Color.GREEN;
        _grass_level = 100;
        _accumulated_time = 0;
    }

    public void decreaseLevel(int n) {
        _grass_level -= n;
    }

    synchronized public void grow(int n) {
        _grass_level += n;
    }

    synchronized public void interact(Snail snail) {
        if(_grass_level > 20)
            _grass_level -= 20;
    }

    @Override
    synchronized public void update(long dt) {
        super.update(dt);

        if (_accumulated_time > 100) {
            if (_grass_level < 100)
                grow(1);
            _accumulated_time = 0;
        } else
            _accumulated_time += dt;

    }

    @Override
    public void draw(Graphics2D g) {

        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, _grass_level * 0.01f));
        g.setColor(_color);
        g.fillRect(_x-1, _y-1, _width+1, _height+1);

        g.setColor(Color.BLACK);
        g.drawRect(_x, _y, _width, _height);
    }
}
