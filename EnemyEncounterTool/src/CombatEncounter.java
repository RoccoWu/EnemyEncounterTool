import java.util.ArrayList;

public class CombatEncounter {
    private String combatEncounterName;
    //make a list of enemies
    ArrayList<EnemyBehaviorComponent> enemies = new ArrayList<EnemyBehaviorComponent>();
    public CombatEncounter(String combatEncounterName) {
        this.combatEncounterName = combatEncounterName;
    }
    public String getCombatEncounterName() {
        return combatEncounterName;
    }
    public void setCombatEncounterName(String combatEncounterName) {
        this.combatEncounterName = combatEncounterName;
        this.combatEncounterName = combatEncounterName;
    }

    //add enemy
    public void addEnemy(EnemyBehaviorComponent enemy)
    {
        enemies.add(enemy);
    }

}
