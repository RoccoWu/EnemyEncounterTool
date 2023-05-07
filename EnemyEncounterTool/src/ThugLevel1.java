public class ThugLevel1 extends EnemyBehaviorComponent implements  WeaponUser{
    public boolean regularCombos;

    public ThugLevel1(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.regularCombos = regularCombos;
    }

    @Override
    public String toString() {
        String performsRegularCombos;
        String canUseWeaponString;
        if(regularCombos){performsRegularCombos = "Yes";}
        else {performsRegularCombos = "No";}
        if(canUseWeapon){canUseWeaponString = "Yes";}
        else {canUseWeaponString = "No";}

        return "ThugLevel1{" +
                "Thug Name: " + name + '\'' + //this can be done in another time
                ", Enemy Description:'" + description + '\'' +
                ", View Distance: " + viewDistance +
                ", Default Combo:" + performsRegularCombos +
                ", Health: " + health +
                ", Attack Damage: " + attackDamage +
                ", Initial Attack Timer: " + initialAttackTimer +
                ", Min Attack Timer: " + minAttackTimer +
                ", Max Attack Timer: " + maxAttackTimer +
                ", Can Use Weapon: " + canUseWeaponString +
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
