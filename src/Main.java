
import characters.Beerus;
import tools.FormStatsTable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Dragon Ball Battle Game!!");

        Beerus beerus = new Beerus();
        FormStatsTable.printFor(beerus);
       
    }
}