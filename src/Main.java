import battle.PVP.*;
import characters.Goku;
import characters.Vegeta;
import tools.FormStatsTable;

public class Main {
    public static void main(String[] args) {

        Goku goku = new Goku();
     
        Vegeta vegeta = new Vegeta();
        Scene scene = new Scene("namek","namek_1");
        scene.addPlayerToScene(vegeta);
        scene.addPlayerToScene(goku);
        scene.generateCurrent_alive();
        System.out.println("HI:" + scene.getPlayers_in_field());
        System.out.println(goku.getIsAlive());
        System.out.println(vegeta.getIsAlive());
        System.out.println(scene.getCurrent_alive());

        scene.checkGameOver();

        goku.ATTACK(vegeta);

      
        System.out.println(goku.getIsAlive());
        System.out.println(vegeta.getIsAlive());
        System.out.println(scene.getCurrent_alive());

         scene.checkGameOver();

         FormStatsTable.printFor(vegeta);
         scene.showLeaderboard();

        
        
    }
}