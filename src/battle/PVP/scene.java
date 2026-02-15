package battle.PVP;

import characters.Fighter;
import java.util.ArrayList;

public class Scene {
    protected String name;
    protected String map_name;
    protected String mode;
    protected boolean gameOver;
    protected ArrayList<Fighter> players_in_field = new ArrayList<>();
    protected Fighter winner;
    protected int current_alive;
    
    public Scene(String name, String map_name) {
        this.name = name;
        this.map_name = map_name;
        this.gameOver = false;
        this.current_alive = 0;
        
        
        
    }


    
    public void checkGameOver() {
        if (current_alive == 0) {
            System.out.println("Everyone is dead!!");
        } else if (current_alive == 1) {
            for (Fighter f: players_in_field) {
                if(f.getIsAlive() == true) {
                    System.out.println("Winner of this match is!!!: " + f.getName());
                } 
            }
        }



}



public void addPlayerToScene(Fighter fighter) {
    fighter.setScene(this);
    players_in_field.add(fighter);
}

public void showLeaderboard() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║           🏆  BATTLE LEADERBOARD  🏆                  ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║  Battle:   " + String.format("%-42s", name) + "║");
        System.out.println("║  Location: " + String.format("%-42s", map_name) + "║");
        System.out.println("║  Mode:     " + String.format("%-42s", mode != null ? mode : "Standard") + "║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.printf("║ %-4s %-12s %-12s %-10s %-8s ║%n",
                "Rank", "Character", "Form", "Score", "Kills");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        
        int rank = 1;
        for (Fighter f : players_in_field) {
            String formDisplay = f.getCurrentForm() != null ? f.getCurrentForm().toString() : "Base";
            if (formDisplay.length() > 12) formDisplay = formDisplay.substring(0, 12);
            String characterName = f.getName();
            if (characterName.length() > 12) characterName = characterName.substring(0, 12);
            
            System.out.printf("║ %-4d %-12s %-12s %-10d %-8d ║%n",
                    rank++, characterName, formDisplay, f.getPlayer_score(), f.getPlayer_kills());
        }
        
        System.out.println("╚════════════════════════════════════════════════════════╝\n");
    }


















// getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap_name() {
        return map_name;
    }

    public void setMap_name(String map_name) {
        this.map_name = map_name;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public ArrayList<Fighter> getPlayers_in_field() {
        return players_in_field;
    }

    public void setPlayers_in_field(ArrayList<Fighter> players_in_field) {
        this.players_in_field = players_in_field;
    }

    public Fighter getWinner() {
        return winner;
    }

    public void setWinner(Fighter winner) {
        this.winner = winner;
    }


    public int getCurrent_alive() {
        return current_alive;
    }


    public void reduceCurrent_alive() {
        this.current_alive -= 1;
        
    }
    
    public void generateCurrent_alive() {
        this.current_alive = this.players_in_field.size();
    }


}

