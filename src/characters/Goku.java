package characters;

import transformations.KAIOKEN;
import transformations.SuperSaiyan;

public class Goku extends Fighter{
    
    public Goku() {
        super("Goku", 100,20,100,1000,10);

        //register forms
        // Kaiokens
        addTransformations(new KAIOKEN("X2",2)); // Kaioiken x2
        addTransformations(new KAIOKEN("X4",4));   // Kaioken x4
        addTransformations(new KAIOKEN("X10", 10)); // Kaioken x10
        addTransformations(new KAIOKEN("X20", 20)); // Kaioken x20 (technique forms)
        // SuperSaiyan
        addTransformations(new SuperSaiyan("1", 50));
        addTransformations(new SuperSaiyan("2", 100));
        addTransformations(new SuperSaiyan("3", 400));
        addTransformations(new SuperSaiyan("4", 500));
        // Super SSGSS's
        addTransformations(new SuperSaiyan("GOD", 40000));
        addTransformations(new SuperSaiyan("BLUE", 2000000));




    }
    @Override
    public void specialMove(Fighter fighter) {
        System.err.println("Ka...mee...haa..meeeeee.. HAAAAAAAAAA!");
        fighter.takeUltimateDamage();
        System.out.println(name + " attacks: " + fighter.name + " for: " + (HP+((DEFENSE+KI+POWER+ATTACK)/5)) + " damage!");
        fighter.checkHP();
    }
}