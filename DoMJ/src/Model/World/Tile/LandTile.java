package Model.World.Tile;
import Model.Resource.*;
import Model.World.Terrain.*;

import java.util.Random;
import java.util.logging.*;

/**
 * Created by beamed on 5/26/2015.
 */
class LandTile extends Tile {
    final private Vegetation vegetation;
    final private Fertility fertility;
    final private Moisture moisture;
    final private Model.World.Terrain.Elevation elevation;
    final private Logger logger;

    LandTile(Vegetation veg, Fertility fert, Moisture moist, Model.World.Terrain.Elevation elev)
    {
        vegetation = veg;
        fertility = fert;
        moisture = moist;
        elevation = elev;
        logger = Logger.getLogger("LandTile");
        logger.log(logger.getLevel(), "Created tile with specific settings");
    }

    LandTile()
    {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        vegetation = Vegetation.values()[rand.nextInt(Vegetation.values().length)];
        fertility = Fertility.values()[rand.nextInt(Fertility.values().length)];
        moisture = Moisture.values()[rand.nextInt(Fertility.values().length)];
        elevation = Model.World.Terrain.Elevation.values()[rand.nextInt(Model.World.Terrain.Elevation.values().length)];
        logger = Logger.getLogger("LandTile");
        logger.log(logger.getLevel(), "Created randomized tile");
    }

    public String toString()
    {
        return vegetation.toString() + "_" + fertility.toString() + "_"
                + moisture.toString() + "_" + elevation.toString() + "_tile";
    }

    Boolean add_resource(Resource resource) {
        if(resource instanceof Land_Resource) {
            return super.add_resource(resource);
        } else return false;
    }
}