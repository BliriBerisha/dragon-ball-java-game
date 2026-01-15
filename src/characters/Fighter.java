package characters;

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
    

    public Fighter(String name, double HP,double DEFENSE, double KI, double POWER, double ATTACK) {
        this.name = name;
        this.HP = HP;
        this.DEFENSE = DEFENSE;
        this.KI = KI;
        this.POWER = POWER;
        this.ATTACK = ATTACK;
    }

    public abstract void specialMove();
    
    // is dead , is alive
    public boolean isAlive() {
        return HP > 0;
    }
        
    public boolean isDead() {
        return !isAlive();
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
        if (target.isDead()) {
            System.out.println(target.name + " is dead! HP: " + target.HP);
        } else {
            System.out.println(target.name + ": Ouchh!!");
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

    public boolean isIsTransformed() {
        return isTransformed;
    }

    public void setIsTransformed(boolean isTransformed) {
        this.isTransformed = isTransformed;
    }

 

}