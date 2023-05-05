public class TankThug extends EnemyBehaviorComponent{

    public boolean goesUnstoppable;
    public int unstoppableChance;
    public int unstoppableDuration;

    public TankThug(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean goesUnstoppable, int unstoppableChance, int unstoppableDuration) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.goesUnstoppable = goesUnstoppable;
        this.unstoppableChance = unstoppableChance;
        this.unstoppableDuration = unstoppableDuration;
    }

    @Override
    public String toString() {
        return "TankThug{" +
                "goesUnstoppable=" + goesUnstoppable +
                ", unstoppableChance=" + unstoppableChance +
                ", unstoppableDuration=" + unstoppableDuration +
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
