package units.motile.humans;

import gameplay.Civilization;
import gameplay.Point2D;
import units.motile.Motile;

public class Villager extends Motile {

    private int stockMax;
    private int stock;
    private String resType; // type of resource currently carried

    public Villager(Point2D position, Civilization civilization,
                    int contingentMax) {
        super(position, civilization, contingentMax);
        stockMax = 10;
        stock = 0;
        resType = "wood";
    }

    public String toString() {
        return "v";
    }

}
