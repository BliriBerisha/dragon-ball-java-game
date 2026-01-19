
import characters.Goku;
public class Main {
    public static void main(String[] args) {
        System.out.println("🐉 Welcome to Dragon Ball Battle Game!");

        Goku goku = new Goku();
        goku.transformTo("SuperSaiyan", "2");
        System.out.println("HP: " + goku.getHP() + " form: " + goku.getCurrentForm());

        goku.transformTo("SuperSaiyan", "2");
        System.out.println("HP: " + goku.getHP());


        
        
       






       
    }
}