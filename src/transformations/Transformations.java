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


