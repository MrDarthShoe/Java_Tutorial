package com.company.Snailz.Engine.Entities.Creatures;

import com.company.Constants;
import com.company.Snailz.Engine.Entities.Map.Tile;
import com.company.Snailz.Engine.Entities.Square;

import java.awt.*;

public class Creature extends Square {

    protected Color _color;
    protected int _alpha;
    protected Direction _direction;
    protected Tile _N_tile;
    protected Tile _B_tile;
    protected Tile _S_tile;
    protected Tile _E_tile;
    protected Tile _W_tile;
    protected Tile _NE_tile;
    protected Tile _NW_tile;
    protected Tile _SE_tile;
    protected Tile _SW_tile;

    void matchPositionToGrid() {
        if (_x % Constants.TILE_SIZE != 0 ) {
            _x -= _x % Constants.TILE_SIZE;
        }
        if (_y % Constants.TILE_SIZE != 0 ) {
            _y -= _y % Constants.TILE_SIZE;
        }
    }

    public Tile get_N_tile() {
        return _N_tile;
    }

    public void set_N_tile(Tile _N_tile) {
        this._N_tile = _N_tile;
    }

    public Tile get_B_tile() {
        return _B_tile;
    }

    public void set_B_tile(Tile _B_tile) {
        this._B_tile = _B_tile;
    }

    public Tile get_S_tile() {
        return _S_tile;
    }

    public void set_S_tile(Tile _S_tile) {
        this._S_tile = _S_tile;
    }

    public Tile get_E_tile() {
        return _E_tile;
    }

    public void set_E_tile(Tile _E_tile) {
        this._E_tile = _E_tile;
    }

    public Tile get_W_tile() {
        return _W_tile;
    }

    public void set_W_tile(Tile _W_tile) {
        this._W_tile = _W_tile;
    }

    public Tile get_NE_tile() {
        return _NE_tile;
    }

    public void set_NE_tile(Tile _NE_tile) {
        this._NE_tile = _NE_tile;
    }

    public Tile get_NW_tile() {
        return _NW_tile;
    }

    public void set_NW_tile(Tile _NW_tile) {
        this._NW_tile = _NW_tile;
    }

    public Tile get_SE_tile() {
        return _SE_tile;
    }

    public void set_SE_tile(Tile _SE_tile) {
        this._SE_tile = _SE_tile;
    }

    public Tile get_SW_tile() {
        return _SW_tile;
    }

    public void set_SW_tile(Tile _SW_tile) {
        this._SW_tile = _SW_tile;
    }

    public Color get_color() {
        return _color;
    }

    public void set_color(Color _color) {
        this._color = _color;
    }

    public int get_alpha() {
        return _alpha;
    }

    public void set_alpha(int _alpha) {
        this._alpha = _alpha;
    }

    public Direction get_direction() {
        return _direction;
    }

    public void set_direction(Direction _direction) {
        this._direction = _direction;
    }

    public Creature(int x, int y, int a) {
        super(x, y, a, a);
        _color = Color.RED;
        _alpha = 100;
        _N_tile = null;
        _B_tile = null;
        _S_tile = null;
        _E_tile = null;
        _W_tile = null;
        _NE_tile = null;
        _NW_tile = null;
        _SE_tile = null;
        _SW_tile = null;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, _alpha * 0.01f));
        g.setColor(_color);
        g.fillRect(_x, _y, _width, _height);
        g.setColor(Color.BLACK);
        g.drawRect(_x, _y, _width,_height);
    }

    @Override
    public void update(long dt) {

    }

    public Direction getDirection() {
        return _direction;
    }

}
