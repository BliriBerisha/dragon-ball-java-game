package characters;
import java.util.ArrayList;
import transformations.KAIOKEN;
import transformations.Transformations;



public abstract class Fighter {
    protected String name;
    protected double HP;
    protected double DEFENSE;
    protected double KI;
    protected double POWER;
    protected double ATTACK;
    //transform
    protected boolean isHumanTransformed = false;
    protected boolean isTransformed = false;

    //forms
    protected ArrayList<Transformations> forms = new ArrayList<>();
    protected Transformations currentForm;


    

    public Fighter(String name, double HP,double DEFENSE, double KI, double POWER, double ATTACK) {
        this.name = name;
        this.HP = HP;
        this.DEFENSE = DEFENSE;
        this.KI = KI;
        this.POWER = POWER;
        this.ATTACK = ATTACK;
    }

    public abstract void specialMove(Fighter fighter);
    //add forms
    public final void addTransformations(Transformations form) {
        forms.add(form);
    }




// form logic from transformations


    public void transform(int multiplier) {

        for (Transformations t : forms) {
            if (t instanceof KAIOKEN) {
                KAIOKEN k = (KAIOKEN) t;
                if (k.getMultiplier() == multiplier) {
                    k.transform(this);
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
        }
    }

    // damageCombat



    public void takeDamage(double damage) {
        double actualDamage = Math.max(0, damage - DEFENSE);
        HP -= actualDamage;
        if (HP <= 0) {
            HP = 0;
        }

    }
    

    public void ATTACK(Fighter target) {
        target.takeDamage(ATTACK);
        System.out.println(name + "attacks: " + target.name + " for: " + ATTACK + " damage!");
        target.checkHP();
    }


    public void takeUltimateDamage() {
        double actualUltimate = Math.max(0,((HP+DEFENSE+KI+POWER+ATTACK)/5));
        HP -= actualUltimate;
         if (HP <= 0) {
            HP = 0;
        }
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

    public void setATTACK(double ATTACK) {
        this.ATTACK = ATTACK;
    }

    public boolean IsTransformed() {
        return isTransformed;
    }

    public void setIsTransformed(boolean isTransformed) {
        this.isTransformed = isTransformed;
    }

    public boolean getIsHumanTransformed() {
        return isHumanTransformed;
    }

    public void setIsHumanTransformed(boolean isHumanTransformed) {
        this.isHumanTransformed = isHumanTransformed;
    }

 

// end of setters and getters

}


