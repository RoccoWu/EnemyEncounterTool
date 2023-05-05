public class EnemyBehaviorComponent extends NPCBehaviorComponent{

    public String description;
    public int attackDamage;
    public int initialAttackTimer;
    public int minAttackTimer;
    public int maxAttackTimer;
    public boolean canUseWeapon;
    public ComboDatabase comboDB;

    public EnemyBehaviorComponent(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed);
        this.description = description;
        this.attackDamage = attackDamage;
        this.initialAttackTimer = initialAttackTimer;
        this.minAttackTimer = minAttackTimer;
        this.maxAttackTimer = maxAttackTimer;
        this.canUseWeapon = canUseWeapon;
        this.comboDB = comboDB;
    }
}
