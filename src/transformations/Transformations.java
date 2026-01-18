package transformations;
import characters.Fighter;


public abstract class Transformations {
    protected String name;
    protected String formINDEX;
    protected double hpBOOST;
    protected double defenseBOOST;
    protected double kiBOOST;
    protected double powerBOOST;
    protected double attackBOOST;
    public Transformations(String name, String formINDEX,double hpBOOST, double defenseBOOST, double kiBOOST, double powerBOOST, double attackBOOST) {
        this.formINDEX = formINDEX;
        this.attackBOOST = attackBOOST;
        this.defenseBOOST = defenseBOOST;
        this.hpBOOST = hpBOOST;
        this.kiBOOST = kiBOOST;
        this.name = name;
        this.powerBOOST = powerBOOST;
    }

    public abstract void transform(Fighter fighter);
    public abstract void detransform(Fighter fighter);

  

    @Override
    public String toString() {
        return name;
    }
 
    // getters and setters
      public String getName() {
        return name;
    }

    public String getFormINDEX() {
        return formINDEX;
    }

    public void setFormINDEX(String formINDEX) {
        this.formINDEX = formINDEX;
    }

    public double getHpBOOST() {
        return hpBOOST;
    }

    public void setHpBOOST(double hpBOOST) {
        this.hpBOOST = hpBOOST;
    }

    public double getDefenseBOOST() {
        return defenseBOOST;
    }

    public void setDefenseBOOST(double defenseBOOST) {
        this.defenseBOOST = defenseBOOST;
    }

    public double getKiBOOST() {
        return kiBOOST;
    }

    public void setKiBOOST(double kiBOOST) {
        this.kiBOOST = kiBOOST;
    }

    public double getPowerBOOST() {
        return powerBOOST;
    }

    public void setPowerBOOST(double powerBOOST) {
        this.powerBOOST = powerBOOST;
    }

    public double getAttackBOOST() {
        return attackBOOST;
    }

    public void setAttackBOOST(double attackBOOST) {
        this.attackBOOST = attackBOOST;
    }




} 


