public class EnemyBehaviorComponent extends NPCBehaviorComponent{

    public String description;
    public int health;
    public int attackDamage;
    public int initialAttackTimer;
    public int minAttackTimer;
    public int maxAttackTimer;
    public ComboDatabase comboDB;

    public EnemyBehaviorComponent(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int health1, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, ComboDatabase comboDB) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed);
        this.description = description;
        this.health = health1;
        this.attackDamage = attackDamage;
        this.initialAttackTimer = initialAttackTimer;
        this.minAttackTimer = minAttackTimer;
        this.maxAttackTimer = maxAttackTimer;
        this.comboDB = comboDB;
    }
}
