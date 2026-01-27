
import characters.Goku;
import tools.FormStatsTable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Dragon Ball Battle Game!!");

        Goku goku = new Goku();
        FormStatsTable.printFor(goku);
       
    }
}