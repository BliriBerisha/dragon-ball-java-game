package characters;
import java.util.ArrayList;
import transformations.KAIOKEN;
import transformations.SuperSaiyan;
import transformations.Transformations;



public abstract class Fighter {
    protected String name;
    protected double HP;
    protected double DEFENSE;
    protected double KI;
    protected double POWER;
    protected double ATTACK;

    protected final double baseHP;
    protected final double baseDEFENSE;
    protected final double baseKI;
    protected final double basePOWER;
    protected final double baseATTACK;
    //transform
    protected boolean isTechniqueTransformed = false;
    protected boolean isTransformed = false;

    //forms
    protected ArrayList<Transformations> forms = new ArrayList<>();
    protected Transformations currentTechniqueForm;
    protected Transformations currentForm;


    

    public Fighter(String name, double HP,double DEFENSE, double KI, double POWER, double ATTACK) {
        this.name = name;
        this.HP = HP;
        this.DEFENSE = DEFENSE;
        this.KI = KI;
        this.POWER = POWER;
        this.ATTACK = ATTACK;

        this.baseHP = HP;
        this.baseDEFENSE = DEFENSE;
        this.baseKI = KI;
        this.basePOWER = POWER;
        this.baseATTACK = ATTACK;
    }

    public abstract void specialMoveUse(Fighter fighter);
    //add forms
    public final void addTransformations(Transformations form) {
        forms.add(form);
    }




// form logic from transformations


    public void transformTo(String formName,String formINDEX) {

        for (Transformations t : forms) {
            if (t instanceof KAIOKEN) {
                if ((t.getName().equals(formName)) && (formINDEX.equals(t.getFormINDEX())) ){
                    t.transform(this);
                    break;
                }
            } else if(t instanceof SuperSaiyan) {
                if ((t.getName().equals(formName)) && (formINDEX.equals(t.getFormINDEX()))) {
                    t.transform(this);
                    break;
                } 
            }
        }
    }




    // is dead , is alive
    public boolean isAlive() {
        return HP > 0;
    }
        
    public boolean isDead() {
        return !isAlive();
    }

    public void checkHP() {
         if (isDead()) {
            System.out.println(name + " is dead! HP: " + HP);
        } else {
            System.out.println(name + ": Ouchh!!");
            showStats();

        }
    }

    // damageCombat



    public void takeDamage(double damage) {
        double actualDamage = Math.max(0, damage - DEFENSE);
        DEFENSE = Math.max(0, DEFENSE - damage);
        HP -= actualDamage;
        if (HP <= 0) {
            HP = 0;
        }

    }
    

    public void ATTACK(Fighter target) {
        if (KI >= 10) {
        KI = KI - (ATTACK * 0.5); // KI WASTER HALF OF ATTACK
        target.takeDamage(ATTACK);
        System.out.println(name + "attacks: " + target.name + " for: " + ATTACK + " damage!");
        target.checkHP();
        } else {
            System.out.println( name +"'s KI is depleted can't ATTACK. Remaining KI: " + KI);  
        }

    }
 
    

    public double getUltimateGenerator() {
       // actual attack * 2;
        return this.getATTACK() * 2.0;
    }

    public void takeUltimateDamage(double ultimate) {
        double actualUltimate = Math.max(0, ultimate - DEFENSE);
        DEFENSE = Math.max(0, DEFENSE - ultimate);
        HP -= actualUltimate;
         if (HP <= 0) {
            HP = 0;
        }
    }



    public void showStats () {
        System.out.println(
                name + " stats | " +
                "HP=" + HP + " | " +
                "DEF=" + DEFENSE + " | " +
                "KI=" + KI + " | " +
                "PWR=" + POWER + " | " +
                "ATK=" + ATTACK + " | " +
                "Form=" + (currentForm == null ? "None" : (currentForm.getName() + " " + currentForm.getFormINDEX())) + " | " +
                "TechniqueForm=" + (currentTechniqueForm == null ? "None" : (currentTechniqueForm.getName() + " " + currentTechniqueForm.getFormINDEX()))
        );
    }







// getters setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getDEFENSE() {
        return DEFENSE;
    }

    public void setDEFENSE(double DEFENSE) {
        this.DEFENSE = DEFENSE;
    }

    public double getKI() {
        return KI;
    }

    public void setKI(double KI) {
        this.KI = KI;
    }

    public double getPOWER() {
        return POWER;
    }

    public void setPOWER(double POWER) {
        this.POWER = POWER;
    }

    public double getATTACK() {
        return ATTACK;
    }

    public double getBaseHP() {
        return baseHP;
    }

    public double getBaseDEFENSE() {
        return baseDEFENSE;
    }

    public double getBaseKI() {
        return baseKI;
    }

    public double getBasePOWER() {
        return basePOWER;
    }

    public double getBaseATTACK() {
        return baseATTACK;
    }

    public void setATTACK(double ATTACK) {
        this.ATTACK = ATTACK;
    }

    public boolean getIsTransformed() {
        return isTransformed;
    }

    public void setIsTransformed(boolean isTransformed) {
        this.isTransformed = isTransformed;
    }

    public boolean getIsTechniqueTransformed() {
        return isTechniqueTransformed;
    }

    public void setIsTechniqueTransformed(boolean isTechniqueTransformed) {
        this.isTechniqueTransformed = isTechniqueTransformed;
    }

 


// end of setters and getters

    public ArrayList<Transformations> getForms() {
        return forms;
    }

    public void setForms(ArrayList<Transformations> forms) {
        this.forms = forms;
    }

    public Transformations getCurrentForm() {
        return currentForm;
    }

    public void setCurrentForm(Transformations currentForm) {
        this.currentForm = currentForm;
    }

    public Transformations getCurrentTechniqueForm() {
        return currentTechniqueForm;
    }

    public void setCurrentTechniqueForm(Transformations currentTechniqueForm) {
        this.currentTechniqueForm = currentTechniqueForm;
    }



}


