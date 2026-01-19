package transformations;
import characters.Fighter;

public class KAIOKEN extends Transformations {


    public KAIOKEN(String formINDEX, double HPmultiplier, double DEFENSEmultiplier, double KImultiplier, double POWERmultiplier, double ATTACKmultiplier) {
        super("KAIOKEN", formINDEX, HPmultiplier, DEFENSEmultiplier, KImultiplier, POWERmultiplier, ATTACKmultiplier);
    }
    @Override
    public void transform(Fighter fighter) {
        if (fighter.getIsHumanTransformed() == false) {
        fighter.setIsHumanTransformed(true);
        fighter.setCurrentHumanForm(this);
        fighter.setHP(fighter.getHP() * HPmultiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() * DEFENSEmultiplier);
        fighter.setKI(fighter.getKI() * KImultiplier);
        fighter.setPOWER(fighter.getPOWER() * POWERmultiplier);
        fighter.setATTACK(fighter.getATTACK() * ATTACKmultiplier);
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
        fighter.setHP(fighter.getHP() / HPmultiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() / DEFENSEmultiplier);
        fighter.setKI(fighter.getKI() / KImultiplier);
        fighter.setPOWER(fighter.getPOWER() / POWERmultiplier);
        fighter.setATTACK(fighter.getATTACK() / ATTACKmultiplier);
        fighter.setCurrentHumanForm(null);
        } else {
            System.out.println("You  haven't transformed yet to detransform!");
        }
       
        
    }

    public int getMultiplier() {
        return (int) HPmultiplier;
    }

    public void setMultiplier(int multiplier) {
        this.HPmultiplier = multiplier;
        this.DEFENSEmultiplier = multiplier;
        this.KImultiplier = multiplier;
        this.POWERmultiplier = multiplier;
        this.ATTACKmultiplier = multiplier;
    }



}