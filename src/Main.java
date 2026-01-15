
import characters.Goku;

public class Main {
    public static void main(String[] args) {
        System.out.println("🐉 Welcome to Dragon Ball Battle Game!");

        Goku goku = new Goku();

        goku.transform(2);
        

        goku.transform(3);
        System.out.println(goku.getHP());
        System.out.println(goku.getIsHumanTransformed());
       

        // Uses the transformations registered in Goku's constructor
     
        


        // or equivalently:
        // goku.transform(goku.getForms().get(0));

       
    }
}