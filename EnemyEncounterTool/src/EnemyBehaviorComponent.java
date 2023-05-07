public class EnemyBehaviorComponent extends NPCBehaviorComponent{

    public String description;
    public int attackDamage;
    public int initialAttackTimer;
    public int minAttackTimer;
    public int maxAttackTimer;
    public boolean canUseWeapon;
    public ComboDatabase comboDB;

    public EnemyBehaviorComponent(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed);
        this.description = description;
        this.attackDamage = attackDamage;
        this.initialAttackTimer = initialAttackTimer;
        this.minAttackTimer = minAttackTimer;
        this.maxAttackTimer = maxAttackTimer;
        this.canUseWeapon = canUseWeapon;
        this.comboDB = comboDB;
    }
    public String toCSV() {
        return "";
    }
    public String toString() {
        return "EnemyBehaviorComponent{" +
                "description='" + description + '\'' +
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
