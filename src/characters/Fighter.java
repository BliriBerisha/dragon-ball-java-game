public abstract class Fighter {
    protected String name;
    protected double HP;
    protected double DEFENSE;
    protected  double KI;
    protected double POWER;
    protected double ATTACK;

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

 

}