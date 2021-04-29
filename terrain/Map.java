package terrain;

import java.util.LinkedList;

import gameplay.Point2D;
import units.Unit;

public class Map {

    private int height;
    private int width;

    private String[][] grid;

    public Map() {
        height = 40;
        width = 40;
        grid = new String[height][width];
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                grid[r][c] = " ";
            }
        }
    }

    public String toString() {
        String out = "";
        out += "# ".repeat(width + 2) + "\n";
        for (int r = 0; r < height; r++) {
            out += "# ";
            for (int c = 0; c < width; c++) {
                out += grid[r][c] + " ";
            }
            out += "# \n";
        }
        out += "# ".repeat(width + 2) + "\n";
        return out;
    }

    public void placeUnit(Unit u, int y, int x) {
        grid[y][x] = "" + u;
    }

    public void drawFog(LinkedList<Unit> units) {

        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                grid[r][c] = "%";
            }
        }
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                for (int i = 0; i < units.size(); i++) {
                    Unit u = units.pop();
                    Point2D pos = u.getPosition();
                    int px = pos.getX();
                    int py = pos.getY();
                    int dy = Math.abs(py - r);
                    int dx = Math.abs(px - c);
                    if (dx+dy < u.getLos()) {
                        if (grid[r][c].equals("%")) {
                            grid[r][c] = " ";
                        }
                    }
                    units.addLast(u);
                }
            }
        }
        for (int i = 0; i < units.size(); i++) {
            Unit u = units.pop();
            Point2D pos = u.getPosition();
            int px = pos.getX();
            int py = pos.getY();
            grid[py][px] = "" + u;
            units.addLast(u);
        }
    }
    
}
