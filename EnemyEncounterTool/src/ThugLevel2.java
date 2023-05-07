public class ThugLevel2 extends ThugLevel1 implements  WeaponUser{
    public boolean doesLeapAttack;
    public int leapAttackCooldown;
    public ThugLevel2(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos, boolean doesLeapAttack, int leapAttackCooldown) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB, regularCombos);
        this.doesLeapAttack = doesLeapAttack;
        this.leapAttackCooldown = leapAttackCooldown;
    }

    public String toCSV() {
        return name + ", " + description + ", " + viewDistance + ", " + regularCombos + ", " + health + ", " + attackDamage + ", " + initialAttackTimer +", " + minAttackTimer + ", "
                + maxAttackTimer + ", " + doesLeapAttack + ", " + leapAttackCooldown + ", " + canUseWeapon + ", " + comboDB + ", " + walkSpeed + ", " + runSpeed + ", " + blindedMovementSpeed;
    }

    @Override
    public String toString() {
        String performsRegularCombos;
        String canUseWeaponString;
        String canPerformLeapAttackString;
        if(regularCombos){performsRegularCombos = "Yes";}
        else {performsRegularCombos = "No";}
        if(canUseWeapon){canUseWeaponString = "Yes";}
        else {canUseWeaponString = "No";}
        if(doesLeapAttack){canPerformLeapAttackString = "Yes";}
        else {canPerformLeapAttackString = "No";}

        return "ThugLevel2{" +
                "Thug Name: " + name + '\'' +
                ", Enemy Description: " + description + '\'' +
                ", View Distance: " + viewDistance +
                ", Default Combo: " + performsRegularCombos +
                ", Health: " + health +
                ", Attack Damage: " + attackDamage +
                ", Initial Attack Timer: " + initialAttackTimer +
                ", Min Attack Timer: " + minAttackTimer +
                ", Max Attack Timer: " + maxAttackTimer +
                ", Can Perform Leap Attack: " + canPerformLeapAttackString +
                ", Leap Attack Cooldown: " + leapAttackCooldown +
                ", Can Use Weapon: " + canUseWeaponString +
                ", Combo Database: " + comboDB +
                ", Walk Speed: " + walkSpeed +
                ",  Run Speed: " + runSpeed +
                ", Blinded Movement Speed: " + blindedMovementSpeed +
                '}';
    }

    @Override
    public boolean useWeapon() {
        return canUseWeapon;
    }
}
