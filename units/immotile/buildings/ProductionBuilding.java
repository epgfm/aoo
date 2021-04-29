package units.immotile.buildings;

import gameplay.Civilization;
import gameplay.Point2D;
import units.Unit;

public class ProductionBuilding extends Unit {
    
    private int productionPoolMax;
    private int productionPool;

    private int productionSpeed;

    public ProductionBuilding(Point2D position, Civilization civilization,
                              int contingentMax) {
        super(position, civilization, contingentMax);
        productionPoolMax = 10;
        productionPool = 0;
        productionSpeed = 1;
    }

}
