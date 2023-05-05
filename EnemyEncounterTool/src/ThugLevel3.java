public class ThugLevel3 extends ThugLevel2 implements  WeaponUser{
    public boolean canCounter;

    public ThugLevel3(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos, boolean doesLeapAttack, int leapAttackCooldown, boolean canCounter) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB, regularCombos, doesLeapAttack, leapAttackCooldown);
        this.canCounter = canCounter;
    }
    @Override
    public String toString() {
        return "ThugLevel3{" +
                "canCounter=" + canCounter +
                ", doesLeapAttack=" + doesLeapAttack +
                ", leapAttackCooldown=" + leapAttackCooldown +
                ", regularCombos=" + regularCombos +
                ", description='" + description + '\'' +
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
        return canUseWeapon;
    }
}
