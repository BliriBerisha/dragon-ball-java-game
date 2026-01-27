
import characters.Goku;
import characters.Vegeta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Dragon Ball Battle Game!!");

        Goku goku = new Goku();
        goku.transformTo("SuperSaiyan","BLUE" );
                goku.showStats();
System.out.println(" x : x");
        goku.transformTo("KAIOKEN", "X20");
        goku.showStats();

System.out.println(" x : x");

        Vegeta vegeta = new Vegeta();
        vegeta.transformTo("SuperSaiyan", "MASTERED BLUE");
        vegeta.showStats();
       
    }
}