package com.company.Snailz.Engine.Entities;

import com.company.Snailz.Engine.Entities.Creatures.CreatureFactory;
import com.company.Snailz.Engine.Entities.Map.MapFactory;

public class EntityFactory {
    private MapFactory _map_factory;
    private CreatureFactory _creature_factory;

    public EntityFactory() {
        _creature_factory = new CreatureFactory();
        _map_factory = new MapFactory();
    }

    public Entities makeEntities() {
        Entities result = new Entities();

        result.setMap(_map_factory.makeMap());
        result.setObjects(_creature_factory.makeNSnails(10));

        return result;
    }
}
