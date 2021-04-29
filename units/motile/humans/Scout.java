package units.motile.humans;

import gameplay.Civilization;
import gameplay.Point2D;
import units.motile.Motile;

public class Scout extends Motile {
    public Scout(Point2D position, Civilization civilization,
                 int contingentMax) {
        super(position, civilization, contingentMax);
        setLos(6);
    }

    public String toString() {
        return "s";
    }
}
