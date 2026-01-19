package transformations;

//kaioken

import characters.Fighter;

public class SuperSaiyan extends Transformations {   
    protected int multiplier;
    public SuperSaiyan(String formINDEX,int multiplier) {
        super("SuperSaiyan", formINDEX, 0, 0, 0, 0, 0);
        this.multiplier = multiplier;
    }
    @Override
    public void transform(Fighter fighter) {
        if (fighter.getIsTransformed() == false) {
        fighter.setIsTransformed(true);
        fighter.setCurrentForm(this);
        fighter.setHP(fighter.getHP() * multiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() * multiplier);
        fighter.setKI(fighter.getKI() * multiplier);
        fighter.setPOWER(fighter.getPOWER() * multiplier);
        fighter.setATTACK(fighter.getATTACK() * multiplier);
        System.out.println("Transformed to: " + name + " " + formINDEX);


        } else if (fighter.getCurrentForm() != this) {
            fighter.getCurrentForm().detransform(fighter);
            transform(fighter);
        } else if (fighter.getCurrentForm().equals(this)) {
            System.out.println("Im already transformed to: " + name + " " + formINDEX);
        }
       
        
    }
    @Override
    public void detransform(Fighter fighter) {
        if (fighter.getIsTransformed() == true) {
        fighter.setIsTransformed(false);
        fighter.setHP(fighter.getHP() / multiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() / multiplier);
        fighter.setKI(fighter.getKI() / multiplier);
        fighter.setPOWER(fighter.getPOWER() / multiplier);
        fighter.setATTACK(fighter.getATTACK() / multiplier);
        fighter.setCurrentForm(null);
        } else {
            System.out.println("You  haven't transformed yet to detransform!");
        }
       
        
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }



}