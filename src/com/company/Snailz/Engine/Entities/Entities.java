package com.company.Snailz.Engine.Entities;


import com.company.Snailz.Engine.Entities.Map.Map;

public class Entities {
    private Map _map;
    private Actors _objects;

    public void setMap(Map map) {
        _map = map;
    }

    public void setObjects(Actors objects) {
        _objects = objects;
    }

    public Map getMap() {
        return _map;
    }

    public Actors getObjects() {
        return _objects;
    }
}
