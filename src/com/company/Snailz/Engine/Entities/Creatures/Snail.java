package com.company.Snailz.Engine.Entities.Creatures;

import com.company.Constants;
import static com.company.Snailz.Engine.Entities.Creatures.Direction.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Snail extends Creature {

    private BufferedImage _texture;
    private long _accumulated_time;

    public Snail(int x, int y, int a) {
        super(x, y, a);
        _accumulated_time = 0;
        _direction = N;
        try {
            _texture = ImageIO.read(new File("Snail.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        matchPositionToGrid();
    }

    @Override
    synchronized public void update(long dt) {
        super.update(dt);

        if (_accumulated_time > 100) {
            eatGrass();
            moveAtRandomDirection();
            _accumulated_time = 0;
        } else
            _accumulated_time += dt;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, _alpha * 0.01f));
//        AffineTransform tx = new AffineTransform();
//        tx.rotate(Math.atan2(_y / _x,0), _texture.getWidth() / 2, _texture.getHeight() / 2);
//
//        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
//        _texture = op.filter(_texture, null);
        g.drawImage(_texture,_x, _y, null);
    }



    private void moveAtRandomDirection() {
        Random r = new Random();
        int high = 3;
        int dir = r.nextInt(high + 1);

        switch (dir) {
            case 0: //TODO better directions !  N
                if(_y - Constants.TILE_SIZE > 0) {
                    _y -= Constants.TILE_SIZE;
                    _direction = N;
                }
                break;
            case 1: //S
                if(_y + Constants.TILE_SIZE < Constants.MAP_HEIGHT) {
                    _y += Constants.TILE_SIZE;
                    _direction = S;
                }
                break;
            case 2:
                if(_x - Constants.TILE_SIZE > 0) {
                    _x -= Constants.TILE_SIZE;
                    _direction = W;
                }
                break;
            case 3:
                if(_x + Constants.TILE_SIZE < Constants.MAP_WIDTH) {
                    _x += Constants.TILE_SIZE;
                    _direction = E;
                }
                break;
            default:
                System.out.println("Snail invalid direction!");
                break;
        }
    }

    private void eatGrass() {
        if (_B_tile != null) {
            _B_tile.interact(this);
        }
    }

    private boolean isInsideMap() {
        if (_x < 0 || (_x + _width >= Constants.WINDOW_WIDTH)) {
            return false;
        }
        if (_y < 0 || (_y + _height >= Constants.WINDOW_HEIGHT)) {
            return false;
        }
        return true;
    }
}
