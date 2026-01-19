package transformations;
import characters.Fighter;

public class KAIOKEN extends Transformations {


    public KAIOKEN(String formINDEX, double HPmultiplier, double DEFENSEmultiplier, double KImultiplier, double POWERmultiplier, double ATTACKmultiplier) {
        super("KAIOKEN", formINDEX, HPmultiplier, DEFENSEmultiplier, KImultiplier, POWERmultiplier, ATTACKmultiplier);
    }
    @Override
    public void transform(Fighter fighter) {
        if (fighter.getIsTechniqueTransformed() == false) {
        fighter.setIsTechniqueTransformed(true);
        fighter.setCurrentTechniqueForm(this);
        fighter.setHP(fighter.getHP() * HPmultiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() * DEFENSEmultiplier);
        fighter.setKI(fighter.getKI() * KImultiplier);
        fighter.setPOWER(fighter.getPOWER() * POWERmultiplier);
        fighter.setATTACK(fighter.getATTACK() * ATTACKmultiplier);
        System.out.println("Transformed to: " + name + " " + formINDEX);
        } else if (fighter.getCurrentTechniqueForm() != this) {
            fighter.getCurrentTechniqueForm().detransform(fighter);
            transform(fighter);
        } else if (fighter.getCurrentTechniqueForm().equals(this)) {
            System.out.println("Im already transformed to: " + name + " " + formINDEX);
        }
       
        
    }
    @Override
    public void detransform(Fighter fighter) {
        if (fighter.getIsTechniqueTransformed() == true) {
        fighter.setIsTechniqueTransformed(false);
        fighter.setHP(fighter.getHP() / HPmultiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() / DEFENSEmultiplier);
        fighter.setKI(fighter.getKI() / KImultiplier);
        fighter.setPOWER(fighter.getPOWER() / POWERmultiplier);
        fighter.setATTACK(fighter.getATTACK() / ATTACKmultiplier);
        fighter.setCurrentTechniqueForm(null);
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