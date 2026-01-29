import characters.Goku;
import characters.Vegeta;

public class Main {
    public static void main(String[] args) {

        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        goku.transformTo("SuperSaiyan", "3");
        goku.ATTACK(vegeta);


        
        
    }
}