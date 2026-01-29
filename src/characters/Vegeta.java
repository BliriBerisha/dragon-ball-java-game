package characters;

import transformations.SuperSaiyan;

public class Vegeta extends Fighter{
    
    public Vegeta() {
        super("Vegeta", 140,60,100,1000,10);

        //register forms
  addTransformations(new SuperSaiyan("1", 1.1, 1.15 ,1.20 ,1.5 ,1.4)); // SSJ1
        addTransformations(new SuperSaiyan("2", 1.15, 1.25, 1.35, 2, 1.8)); // SSJ2
        addTransformations(new SuperSaiyan("3", 1.25, 1.35, 1.6, 2.7, 2.2 )); // SSJ3
        addTransformations(new SuperSaiyan("4", 1.3, 1.4 , 2, 3.2, 2.6)); // SSJ4
        // Super SSGSS's
        addTransformations(new SuperSaiyan("GOD", 1.45, 1.7, 2.7, 3.6, 3.0)); // SSJ GOD
        addTransformations(new SuperSaiyan("BLUE", 1.5, 1.75, 3.2, 4.2, 3.8));
        addTransformations(new SuperSaiyan("MASTERED BLUE", 1.6, 1.8, 5.0, 5.0, 5.0)); // SSJ MASTERED BLUE
    }
    @Override
    public void specialMoveUse(Fighter fighter) {
        System.out.println("GALICK..... GUNNNNNNNNN...!!!");
        double ultimateDamage = getUltimateGenerator();
        fighter.takeUltimateDamage(ultimateDamage);
        System.out.println(name + " attacks: " + fighter.name + " for: " + ultimateDamage + " damage!");
        fighter.checkHP();
    }
}