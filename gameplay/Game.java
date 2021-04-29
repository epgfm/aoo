package gameplay;

import java.util.LinkedList;
import java.util.List;

import terrain.Map;
import units.Unit;
import units.immotile.buildings.Forum;
import units.motile.humans.Scout;
import units.motile.humans.Villager;

public class Game {

    private int nPlayers;
    private Player[] players;

    private int difficultyLevel;
    private int gameMode;

    private boolean gameOver;
    private boolean isPaused;

    private StopWatch timer;
    private Map map;

    private LinkedList<Unit> units;

    public Game() {
        nPlayers = 2;
        players = new Player[2];
        difficultyLevel = 0;
        gameMode = 0;
        gameOver = false;
        isPaused = true;
        timer = new StopWatch();
        map = new Map();
        this.units = new LinkedList<Unit>();
    }

    public void drawUnits(Unit[] units) {
        for (int i = 0; i < units.length; i++) {
            Point2D pos = units[i].getPosition();
            int y = pos.getY();
            int x = pos.getX();
            map.placeUnit(units[i], y, x);
        }
    }

    public void start() {
        Civilization c1 = new Civilization();
        Villager v11 = new Villager(new Point2D(3, 3), c1, 0);
        Villager v12 = new Villager(new Point2D(3, 5), c1, 0);
        Villager v13 = new Villager(new Point2D(5, 3), c1, 0);
        Scout s1 = new Scout(new Point2D(5, 10), c1, 0);
        Forum f1 = new Forum(new Point2D(5, 5), c1, 15);
        
        Civilization c2 = new Civilization();
        Villager v21 = new Villager(new Point2D(4, 35), c2, 0);
        Villager v22 = new Villager(new Point2D(7, 35), c2, 0);
        Villager v23 = new Villager(new Point2D(5, 37), c2, 0);
        Scout s2 = new Scout(new Point2D(10, 35), c2, 0);
        Forum f2 = new Forum(new Point2D(5, 35), c2, 15);

        Unit[] units = {v11, v12, v13, s1, f1, v21, v22, v23, s2, f2};
        for (int i = 0; i < units.length; i++) {
            this.units.push(units[i]);
        }
        map.drawFog(this.units);
        isPaused = false;
        s2.setDestination(new Point2D(35, 5));
        while (true) {
            s2.move();
            map.drawFog(this.units);
            try  {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(map);
        }
    }

    public String toString() {
        return "" + map;
    }
    
}
