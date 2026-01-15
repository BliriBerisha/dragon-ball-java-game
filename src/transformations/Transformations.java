package transformations;
import characters.Fighter;


public abstract class Transformations {
    protected String name;
    protected double hpBOOST;
    protected double defenseBOOST;
    protected double kiBOOST;
    protected double powerBOOST;
    protected double attackBOOST;
    public Transformations(String name, double hpBOOST, double defenseBOOST, double kiBOOST, double powerBOOST, double attackBOOST) {
        this.attackBOOST = attackBOOST;
        this.defenseBOOST = defenseBOOST;
        this.hpBOOST = hpBOOST;
        this.kiBOOST = kiBOOST;
        this.name = name;
        this.powerBOOST = powerBOOST;
    }

    public abstract void transform(Fighter fighter);
    public abstract void detransform(Fighter fighter);
 
    
} 



 //kaioken
 class KAIOKEN extends Transformations {
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
}