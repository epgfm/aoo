package units.motile;

import gameplay.Civilization;
import gameplay.Point2D;
import units.Unit;

public class Motile extends Unit {
    
    private Point2D direction;
    private int speed;
    private Point2D destination;

    public Motile(Point2D position, Civilization civilization,
                  int contingentMax) {
        super(position, civilization, contingentMax);
        this.direction = new Point2D(0, 0);
        this.speed = 0;
        setLos(3);
    }

    public void setDestination(Point2D destination) {
        this.destination = destination;
        int dx;
        int dy;
        if (destination.getX() > getPosition().getX()) {
            dx = 1;
        }
        else if (destination.getX() < getPosition().getX()) {
            dx = -1;
        }
        else {
            dx = 0;
        }
        if (destination.getY() > getPosition().getY()) {
            dy = 1;
        }
        else if (destination.getY() < getPosition().getY()){
            dy = -1;
        }
        else {
            dy = 0;
        }
        this.direction.setX(dx);
        this.direction.setY(dy);
    }

    public void move() {
        Point2D newPos = getPosition();
        newPos.setX(newPos.getX() + this.direction.getX());
        newPos.setY(newPos.getY() + this.direction.getY());
        setPosition(newPos);
        setDestination(destination);
    }


}
