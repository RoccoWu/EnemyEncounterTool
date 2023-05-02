public class ThugLevel1 extends EnemyBehaviorComponent implements  WeaponUser{
    public boolean regularCombos;
    public boolean canPickUpWeapon;

    public ThugLevel1(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int health1, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, health1, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.regularCombos = regularCombos;
    }

    @Override
    public String toString() {
        return "ThugLevel1{" +
                "regularCombos=" + regularCombos +
                ", description='" + description + '\'' +
                ", health=" + health +
                ", attackDamage=" + attackDamage +
                ", initialAttackTimer=" + initialAttackTimer +
                ", minAttackTimer=" + minAttackTimer +
                ", maxAttackTimer=" + maxAttackTimer +
                ", canUseWeapon=" + canUseWeapon +
                ", comboDB=" + comboDB +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", walkSpeed=" + walkSpeed +
                ", runSpeed=" + runSpeed +
                ", viewDistance=" + viewDistance +
                ", blindedMovementSpeed=" + blindedMovementSpeed +
                '}';
    }

    @Override
    public boolean useWeapon() {
        return canPickUpWeapon;
    }
}
