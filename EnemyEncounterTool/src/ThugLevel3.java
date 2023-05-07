public class ThugLevel3 extends ThugLevel2 implements  WeaponUser{
    public boolean canCounter;

    public ThugLevel3(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos, boolean doesLeapAttack, int leapAttackCooldown, boolean canCounter) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB, regularCombos, doesLeapAttack, leapAttackCooldown);
        this.canCounter = canCounter;
    }

    @Override
    public String toString() {
        String performsRegularCombos;
        String canUseWeaponString;
        String canPerformLeapAttack;
        String canCounterPlayerAttacks;
        if(regularCombos){performsRegularCombos = "Yes";}
        else {performsRegularCombos = "No";}
        if(canUseWeapon){canUseWeaponString = "Yes";}
        else {canUseWeaponString = "No";}
        if(doesLeapAttack){canPerformLeapAttack = "Yes";}
        else {canPerformLeapAttack = "No";}
        if(canCounter){canCounterPlayerAttacks = "Yes";}
        else {canCounterPlayerAttacks = "No";}

        return "ThugLevel3{" +
                "Thug Name: " + name + '\'' +
                ", Enemy Description: " + description + '\'' +
                ", View Distance: " + viewDistance +
                ", Default Combo: " + regularCombos +
                ", Health: " + health +
                ", Attack Damage: " + attackDamage +
                ", Initial Attack Timer: " + initialAttackTimer +
                ", Min Attack Timer: " + minAttackTimer +
                ", Max Attack Timer: " + maxAttackTimer +
                ", Can Counter Player Attacks: " + canCounter +
                ", Can Perform Leap Attack: " + doesLeapAttack +
                ", Leap Attack Cooldown: " + leapAttackCooldown +
                ", Can Use Weapon: " + canUseWeapon +
                ", Combo Database: " + comboDB +
                ", Walk Speed: " + walkSpeed +
                ", Run Speed: " + runSpeed +
                ", Blinded Movement Speed: " + blindedMovementSpeed +
                '}';
    }
    @Override
    public boolean useWeapon() {
        return canUseWeapon;
    }
}
