import characters.Goku;
import characters.Vegeta;
import tools.FormStatsTable;

public class Main {
    public static void main(String[] args) {

        Goku goku = new Goku();
     
        Vegeta vegeta = new Vegeta();
        goku.setKI(0);
        goku.ATTACK(vegeta);
                goku.showStats();
                goku.setKI(0);

        goku.specialMoveUse(vegeta);
        goku.showStats();

        
        
    }
}