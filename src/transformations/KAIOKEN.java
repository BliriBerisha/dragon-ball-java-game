package transformations;
import characters.Fighter;

public class KAIOKEN extends Transformations {
    protected int multiplier;
    public KAIOKEN(String formINDEX, int multiplier) {
        super("KAIOKEN", formINDEX, 0, 0, 0, 0, 0);
        this.multiplier = multiplier;
        
    }
    @Override
    public void transform(Fighter fighter) {
        if (fighter.getIsHumanTransformed() == false) {
        fighter.setIsHumanTransformed(true);
        fighter.setCurrentHumanForm(this);
        fighter.setHP(fighter.getHP() * multiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() * multiplier);
        fighter.setKI(fighter.getKI() * multiplier);
        fighter.setPOWER(fighter.getPOWER() * multiplier);
        fighter.setATTACK(fighter.getATTACK() * multiplier);
        System.out.println("Transformed to: " + name);
        } else if (fighter.getCurrentHumanForm() != this) {
            fighter.getCurrentHumanForm().detransform(fighter);
            transform(fighter);
        } else if (fighter.getCurrentHumanForm().equals(this)) {
            System.out.println("Im already transformed to: " + name + " X" + formINDEX);
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
        fighter.setCurrentHumanForm(null);
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