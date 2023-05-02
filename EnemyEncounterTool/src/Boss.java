public class Boss extends  EnemyBehaviorComponent{

    public boolean disableOneShotFinisher;
    public int finisherDamage;

    public Boss(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed, String description, int health1, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean disableOneShotFinisher, int finisherDamage) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, health1, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB);
        this.disableOneShotFinisher = disableOneShotFinisher;
        this.finisherDamage = finisherDamage;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "disableOneShotFinisher=" + disableOneShotFinisher +
                ", finisherDamage=" + finisherDamage +
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
