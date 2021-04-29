package units.immotile.buildings;

import gameplay.Civilization;
import gameplay.Point2D;

public class Forum extends ProductionBuilding {
    
    public Forum(Point2D position, Civilization civilization,
                 int contingentMax) {
        super(position, civilization, contingentMax);
        setLos(6);
    }


    public String toString() {
        return "F";
    }
}
