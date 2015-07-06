package Model.World.Tile;

import Model.Resource.Resource;

import java.util.ArrayList;

/**
 * empty for now; simply to provide World a global Tile to tie everything together
 * Created by beamed on 5/27/2015.
 */
public abstract class Tile {
    Boolean add_resource(Resource resource_) {
        Resources.add(resource_);
        return true;
    }
    private ArrayList<Resource> Resources;
}