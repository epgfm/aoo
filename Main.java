import gameplay.Civilization;
import gameplay.Game;
import gameplay.Point2D;
import units.immotile.buildings.Forum;
import units.motile.humans.Scout;
import units.motile.humans.Villager;

class Main {


    public static void main(String[] args) {
        System.out.println("Game Start!");
        Game game = new Game();
        game.start();
        System.out.println(game);
        
    }


    
}