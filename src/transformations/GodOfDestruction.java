package transformations;



import characters.Fighter;

public class GodOfDestruction extends Transformations {   
                //HP DEF KI PWR ATK
    public GodOfDestruction(String formINDEX, double HPmultiplier, double DEFENSEmultiplier, double KImultiplier, double POWERmultiplier, double ATTACKmultiplier) {
        super("God of Destruction", formINDEX, HPmultiplier, DEFENSEmultiplier, KImultiplier, POWERmultiplier, ATTACKmultiplier);
    }
    @Override
    public void transform(Fighter fighter) {
        if (fighter.getIsTransformed() == false) {
        fighter.setIsTransformed(true);
        fighter.setCurrentForm(this);
        fighter.setHP(fighter.getHP() * HPmultiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() * DEFENSEmultiplier);
        fighter.setKI(fighter.getKI() * KImultiplier);
        fighter.setPOWER(fighter.getPOWER() * POWERmultiplier);
        fighter.setATTACK(fighter.getATTACK() * ATTACKmultiplier);
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
        fighter.setHP(fighter.getHP() / HPmultiplier);
        fighter.setDEFENSE(fighter.getDEFENSE() / DEFENSEmultiplier);
        fighter.setKI(fighter.getKI() / KImultiplier);
        fighter.setPOWER(fighter.getPOWER() / POWERmultiplier);
        fighter.setATTACK(fighter.getATTACK() / ATTACKmultiplier);
        fighter.setCurrentForm(null);
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