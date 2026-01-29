package characters;

import transformations.GodOfDestruction;

public class Beerus extends Fighter{
    
    public Beerus() {
        super("Beerus", 900,260,1500,60000,200);

        //register forms
        addTransformations(new GodOfDestruction("",2, 2, 2, 2,2));
    }
    @Override
    public void specialMoveUse(Fighter fighter) {
        System.out.println("HAKAI...!!!");
        fighter.setHP(0);
        System.out.println(name + " attacks: " + fighter.name + " for infinite damage!");
        fighter.checkHP();
    }
}