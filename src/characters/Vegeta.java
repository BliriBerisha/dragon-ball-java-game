package characters;

public class Vegeta extends Fighter{
    
    public Vegeta() {
        super("Vegeta", 100,20,100,9000,10);

        //register forms

    }
    @Override
    public void specialMoveUse(Fighter fighter) {
        System.err.println("GALICK..... GUNNNNNNNNN...!!!");
        fighter.takeUltimateDamage();
        System.out.println(name + " attacks: " + fighter.name + " for: " + (HP+((DEFENSE+KI+POWER+ATTACK)/5)) + " damage!");
        fighter.checkHP();
    }
}