package transformations;
import characters.Fighter;


public abstract class Transformations {
    protected String name;
    protected String formINDEX;
    protected double HPmultiplier;
    protected double DEFENSEmultiplier;
    protected double KImultiplier;
    protected double POWERmultiplier;
    protected double ATTACKmultiplier;
    public Transformations(String name, String formINDEX,double HPmultiplier, double DEFENSEmultiplier, double KImultiplier, double POWERmultiplier, double ATTACKmultiplier) {
        this.formINDEX = formINDEX;
        this.ATTACKmultiplier = ATTACKmultiplier;
        this.DEFENSEmultiplier = DEFENSEmultiplier;
        this.HPmultiplier = HPmultiplier;
        this.KImultiplier = KImultiplier;
        this.name = name;
        this.POWERmultiplier = POWERmultiplier;
    }

    public abstract void transform(Fighter fighter);
    public abstract void detransform(Fighter fighter);

  

    @Override
    public String toString() {
        return name + " " + getFormINDEX();
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

    public double getHPmultiplier() {
        return HPmultiplier;
    }

    public void setHPmultiplier(double HPmultiplier) {
        this.HPmultiplier = HPmultiplier;
    }

    public double getDEFENSEmultiplier() {
        return DEFENSEmultiplier;
    }

    public void setDEFENSEmultiplier(double DEFENSEmultiplier) {
        this.DEFENSEmultiplier = DEFENSEmultiplier;
    }

    public double getKImultiplier() {
        return KImultiplier;
    }

    public void setKImultiplier(double KImultiplier) {
        this.KImultiplier = KImultiplier;
    }

    public double getPOWERmultiplier() {
        return POWERmultiplier;
    }

    public void setPOWERmultiplier(double POWERmultiplier) {
        this.POWERmultiplier = POWERmultiplier;
    }

    public double getATTACKmultiplier() {
        return ATTACKmultiplier;
    }

    public void setATTACKmultiplier(double ATTACKmultiplier) {
        this.ATTACKmultiplier = ATTACKmultiplier;
    }




} 


