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

    public void transform(Fighter fighter) {
        fighter.setHP(fighter.getHP() + hpBOOST);
        fighter.setDEFENSE(fighter.getDEFENSE() + defenseBOOST);
        fighter.setKI(fighter.getKI() + kiBOOST);
        fighter.setPOWER(fighter.getPOWER() + powerBOOST);
        fighter.setATTACK(fighter.getATTACK() + attackBOOST);
    }
    
}