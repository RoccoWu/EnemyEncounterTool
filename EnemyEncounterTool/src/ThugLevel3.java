public class ThugLevel3 extends ThugLevel2 implements  WeaponUser{
    public boolean canCounter;
    public boolean canPickUpWeapon;

    public ThugLevel3(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos, boolean canPickUpWeapon, boolean doesLeapAttack, int leapAttackCooldown, boolean canPickUpWeapon1, boolean canCounter, boolean canPickUpWeapon2) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB, regularCombos, canPickUpWeapon, doesLeapAttack, leapAttackCooldown, canPickUpWeapon1);
        this.canCounter = canCounter;
        this.canPickUpWeapon = canPickUpWeapon2;
    }

    @Override
    public String toString() {
        return "ThugLevel3{" +
                "canCounter=" + canCounter +
                ", doesLeapAttack=" + doesLeapAttack +
                ", leapAttackCooldown=" + leapAttackCooldown +
                ", regularCombos=" + regularCombos +
                ", canPickUpWeapon=" + canPickUpWeapon +
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


}
