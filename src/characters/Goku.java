package characters;

import transformations.KAIOKEN;
import transformations.SuperSaiyan;

public class Goku extends Fighter{
    
    public Goku() {
        super("Goku", 100,20,100,1000,10);

        //register forms

        // Kaiokens HP DEF KI PWR ATK
        addTransformations(new KAIOKEN("X2",1.0, 0.95, 1.2, 1.35 , 1.3)); // Kaioiken x2
        addTransformations(new KAIOKEN("X4",0.98, 0.9, 1.4, 1.65, 1.55));   // Kaioken x4
        addTransformations(new KAIOKEN("X10", 0.95, 0.8, 1.7, 2.1, 1.95)); // Kaioken x10
        addTransformations(new KAIOKEN("X20", 0.9, 0.7, 2, 2.6, 2.35)); // Kaioken x20 (technique forms)
        // SuperSaiyan HP DEF KI PWR ATK
        addTransformations(new SuperSaiyan("1", 1.1, 1.15 ,1.20 ,1.5 ,1.4)); // SSJ1
        addTransformations(new SuperSaiyan("2", 1.15, 1.25, 1.35, 2, 1.8)); // SSJ2
        addTransformations(new SuperSaiyan("3", 1.25, 1.35, 1.6, 2.7, 2.2 )); // SSJ3
        addTransformations(new SuperSaiyan("4", 1.3, 1.4 , 2, 3.2, 2.6)); // SSJ4
        // Super SSGSS's
        addTransformations(new SuperSaiyan("GOD", 1.45, 1.7, 2.7, 3.6, 3.0)); // SSJ GOD
        addTransformations(new SuperSaiyan("BLUE", 1.5, 1.75, 3.2, 4.2, 3.8)); // SSJ BLUE




    }
    @Override
    public void specialMoveUse(Fighter fighter) {
        System.err.println("Ka...mee...haa..meeeeee.. HAAAAAAAAAA!");
        fighter.takeUltimateDamage();
        System.out.println(name + " attacks: " + fighter.name + " for: " + (HP+((DEFENSE+KI+POWER+ATTACK)/5)) + " damage!");
        fighter.checkHP();
    }
}