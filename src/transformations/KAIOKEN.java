package transformations;

//kaioken

import characters.Fighter;

public class KAIOKEN extends Transformations {
    protected int multiplier;
    public KAIOKEN(int multiplier) {
        super("KAIOKEN",0,0,0,0,0);
        this.multiplier = multiplier;
    }
    @Override
    public void transform(Fighter fighter) {
        if (fighter.getIsHumanTransformed() == false) {
        fighter.setIsHumanTransformed(true);
        fighter.setHP(fighter.getHP() * multiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() * multiplier);
        fighter.setKI(fighter.getKI() * multiplier);
        fighter.setPOWER(fighter.getPOWER() * multiplier);
        fighter.setATTACK(fighter.getATTACK() * multiplier);
        System.out.println("Transformed to: " + name);
        } else {
            System.out.println("I'm already transformed to " + name);
        }
       
        
    }
    @Override
    public void detransform(Fighter fighter) {
        if (fighter.getIsHumanTransformed() == true) {
        fighter.setIsHumanTransformed(false);
        fighter.setHP(fighter.getHP() / multiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() / multiplier);
        fighter.setKI(fighter.getKI() / multiplier);
        fighter.setPOWER(fighter.getPOWER() / multiplier);
        fighter.setATTACK(fighter.getATTACK() / multiplier);
        } else {
            System.out.println("You dont haven't transformed yet to detransform!");
        }
       
        
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }



}