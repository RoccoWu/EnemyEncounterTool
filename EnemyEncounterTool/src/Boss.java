public class Boss extends EnemyBehaviorComponent{

    public boolean disableOneShotFinisher;
    public int finisherDamage;

    public Boss(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean disableOneShotFinisher, int finisherDamage) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.disableOneShotFinisher = disableOneShotFinisher;
        this.finisherDamage = finisherDamage;
    }

    public String toCSV() {
        return name + ", " + description + ", " + viewDistance + ", " + health + ", " + attackDamage + ", " + initialAttackTimer +", " + minAttackTimer + ", " + maxAttackTimer + ", "
                + disableOneShotFinisher + ", " + finisherDamage + ", " + canUseWeapon + ", " + comboDB + ", " + walkSpeed + ", " + runSpeed + ", " + blindedMovementSpeed;
    }
    @Override
    public String toString() {
        String performsRegularCombos;
        String canUseWeaponString;
        String canBeOneShotWithFinisherString;

        if(canUseWeapon){canUseWeaponString = "Yes";}
        else {canUseWeaponString = "No";}
        if(disableOneShotFinisher){canBeOneShotWithFinisherString = "No";}
        else {canBeOneShotWithFinisherString = "Yes";}
        return "Boss{" +
                "Boss Name: " + name + '\'' +
                ", Enemy Description: " + description + '\'' +
                ", View Distance: " + viewDistance +
                ", Health: " + health +
                ", Attack Damage: " + attackDamage +
                ", Initial Attack Timer: " + initialAttackTimer +
                ", Min Attack Timer: " + minAttackTimer +
                ", Max Attack Timer: " + maxAttackTimer +
                ", Can Be One Shot With Finisher: " + canBeOneShotWithFinisherString +
                ", Finisher Damage: " + finisherDamage +
                ", Can Use Weapon: " + canUseWeaponString +
                ", Combo Database: " + comboDB +
                ", Walk Speed: " + walkSpeed +
                ", Run Speed: " + runSpeed +
                ", Blinded Movement Speed: " + blindedMovementSpeed +
                '}';
    }


}
