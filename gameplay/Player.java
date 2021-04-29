package gameplay;

public class Player {

    private String name;
    private String color;
    private String team;

    private Civilization civilization;

    private boolean hasLost;

    public Player(String name, String color, String team, Civilization civilization) {
        this.name = name;
        this.color = color;
        this.team = team;
        this.civilization = civilization;
        hasLost = false;
    }
    
}
