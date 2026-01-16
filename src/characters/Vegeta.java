package characters;

import transformations.KAIOKEN;

public class Vegeta extends Fighter{
    
    public Vegeta() {
        super("Vegeta", 100,20,100,9000,10);

        //register forms
        addTransformations(new KAIOKEN(2));
        addTransformations(new KAIOKEN(4));
        addTransformations(new KAIOKEN(10));
        addTransformations(new KAIOKEN(20));
    }
    @Override
    public void specialMove(Fighter fighter) {
        System.err.println("GALICK..... GUNNNNNNNNN...!!!");
        fighter.takeUltimateDamage();
        System.out.println(name + " attacks: " + fighter.name + " for: " + (HP+((DEFENSE+KI+POWER+ATTACK)/5)) + " damage!");
        fighter.checkHP();
    }
}