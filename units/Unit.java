package units;

import gameplay.Point2D;
import gameplay.Civilization;

public class Unit {

    private int hp;
    private Point2D position;
    private boolean operational;
    private Civilization civilization;
    private int contingent;
    private int contingentMax;

    private int los;
    private int aggroDistance;

    public Unit(Point2D position, Civilization civilization,
                int contingentMax) {
        this.position = position;
        this.civilization = civilization;
        this.contingentMax = contingentMax;
        hp = 10;
        operational = true;
        contingent = 0;
        los = 0;
        aggroDistance = 0;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public void setLos(int los) {
        this.los = los;
    }
    public int getLos() {
        return los;
    }


}



















