package battle.PVP;

import characters.Fighter;
import java.util.ArrayList;

public class scene {
    protected String name;
    protected String map_name;
    protected boolean gameOver;
    protected ArrayList<Fighter> players_in_field = new ArrayList<>();
    protected Fighter winner;
    
    public scene(String name, String map_name) {
        this.name = name;
        this.map_name = map_name;
        this.gameOver = false;
        
    }
}
