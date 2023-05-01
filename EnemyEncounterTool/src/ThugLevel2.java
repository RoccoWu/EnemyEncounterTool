public class ThugLevel2 extends ThugLevel1{
    public boolean doesLeapAttack;
    public int leapAttackCooldown;

    public ThugLevel2(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int health1, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean doesLeapAttack, int leapAttackCooldown) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, health1, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.doesLeapAttack = doesLeapAttack;
        this.leapAttackCooldown = leapAttackCooldown;
    }

    @Override
    public String toString() {
        return "ThugLevel2{" +
                "doesLeapAttack=" + doesLeapAttack +
                ", leapAttackCooldown=" + leapAttackCooldown +
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
