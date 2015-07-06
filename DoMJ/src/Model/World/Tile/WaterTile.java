package Model.World.Tile;

import Model.World.Terrain.Sea;

import java.util.Random;

/**
 * Created by beamed on 5/27/2015.
 */
class WaterTile extends Tile {

    private Sea sea;

    WaterTile(Sea sea_)
    {
        sea = sea_;
    }
    WaterTile()
    {
        Random rand = new java.util.Random();
        rand.setSeed(System.currentTimeMillis());
        sea = Sea.values()[rand.nextInt(Sea.values().length)];
    }

    public String toString()
    {
        return sea.toString() + " sea";
    }
}