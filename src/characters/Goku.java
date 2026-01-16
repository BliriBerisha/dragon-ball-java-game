package characters;

import transformations.KAIOKEN;

public class Goku extends Fighter{
    
    public Goku() {
        super("Goku", 100,20,100,1000,10);

        //register forms
        addTransformations(new KAIOKEN(2));
        addTransformations(new KAIOKEN(4));
        addTransformations(new KAIOKEN(10));
        addTransformations(new KAIOKEN(20));
    }
    @Override
    public void specialMoveUse(Fighter fighter) {
        System.err.println("Ka...mee...haa..meeeeee.. HAAAAAAAAAA!");
        fighter.takeUltimateDamage();
        System.out.println(name + " attacks: " + fighter.name + " for: " + (HP+((DEFENSE+KI+POWER+ATTACK)/5)) + " damage!");
        fighter.checkHP();
    }
}