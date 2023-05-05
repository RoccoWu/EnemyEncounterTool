public class ThugLevel2 extends ThugLevel1 implements  WeaponUser{
    public boolean doesLeapAttack;
    public int leapAttackCooldown;
    public boolean canPickUpWeapon;

    public ThugLevel2(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos, boolean canPickUpWeapon, boolean doesLeapAttack, int leapAttackCooldown, boolean canPickUpWeapon1) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB, regularCombos, canPickUpWeapon);
        this.doesLeapAttack = doesLeapAttack;
        this.leapAttackCooldown = leapAttackCooldown;
        this.canPickUpWeapon = canPickUpWeapon1;
    }

    @Override
    public String toString() {
        return "ThugLevel2{" +
                "doesLeapAttack=" + doesLeapAttack +
                ", leapAttackCooldown=" + leapAttackCooldown +
                ", canPickUpWeapon=" + canPickUpWeapon +
                ", regularCombos=" + regularCombos +
                ", canPickUpWeapon=" + canPickUpWeapon +
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
}
