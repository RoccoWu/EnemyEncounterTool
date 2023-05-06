public class TankThug extends EnemyBehaviorComponent{

    public boolean goesUnstoppable;
    public double unstoppableChance;

    public double unstoppableDuration;
    public double unstoppableCooldown;

    public TankThug(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean goesUnstoppable, double unstoppableChance, double unstoppableDuration, double unstoppableCooldown) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.goesUnstoppable = goesUnstoppable;
        this.unstoppableChance = unstoppableChance;
        this.unstoppableDuration = unstoppableDuration;
        this.unstoppableCooldown = unstoppableCooldown;
    }

    @Override
    public String toString() {
        return "TankThug{" +
                "goesUnstoppable=" + goesUnstoppable +
                ", unstoppableChance=" + unstoppableChance +
                ", unstoppableDuration=" + unstoppableDuration +
                ", unstoppableCooldown=" + unstoppableCooldown +
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
