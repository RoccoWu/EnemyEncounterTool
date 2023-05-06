import java.util.Objects;

public class NPCBehaviorComponent {

    public String name;
    public int health;
    public double walkSpeed;
    public double runSpeed;
    public double viewDistance;
    public double blindedMovementSpeed;

    public NPCBehaviorComponent(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed) {
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

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public double getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(int viewDistance) {
        this.viewDistance = viewDistance;
    }

    public double getBlindedMovementSpeed() {
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
