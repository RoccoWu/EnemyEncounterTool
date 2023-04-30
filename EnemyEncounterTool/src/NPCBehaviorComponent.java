import java.util.Objects;

public class NPCBehaviorComponent {

    public String name;
    public int health;
    public int walkSpeed;
    public int runSpeed;
    public int viewDistance;
    public int blindedMovementSpeed;

    public NPCBehaviorComponent(String name, int health, int walkSpeed, int runSpeed, int viewDistance, int blindedMovementSpeed) {
        this.name = name;
        this.health = health;
        this.walkSpeed = walkSpeed;
        this.runSpeed = runSpeed;
        this.viewDistance = viewDistance;
        this.blindedMovementSpeed = blindedMovementSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(int viewDistance) {
        this.viewDistance = viewDistance;
    }

    public int getBlindedMovementSpeed() {
        return blindedMovementSpeed;
    }

    public void setBlindedMovementSpeed(int blindedMovementSpeed) {
        this.blindedMovementSpeed = blindedMovementSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NPCBehaviorComponent that = (NPCBehaviorComponent) o;
        return health == that.health && walkSpeed == that.walkSpeed && runSpeed == that.runSpeed && viewDistance == that.viewDistance && blindedMovementSpeed == that.blindedMovementSpeed && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed);
    }

    @Override
    public String toString() {
        return "NPCBehaviorComponent{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", walkSpeed=" + walkSpeed +
                ", runSpeed=" + runSpeed +
                ", viewDistance=" + viewDistance +
                ", blindedMovementSpeed=" + blindedMovementSpeed +
                '}';
    }
}
