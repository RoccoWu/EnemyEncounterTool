public class TankThug extends ThugLevel1{

    public boolean goesUnstoppable;
    public double unstoppableChance;

    public double unstoppableDuration;
    public double unstoppableCooldown;

    public TankThug(String name, int health, double walkSpeed, double runSpeed, double viewDistance, double blindedMovementSpeed, String description, int attackDamage, int initialAttackTimer, int minAttackTimer, int maxAttackTimer, boolean canUseWeapon, ComboDatabase comboDB, boolean regularCombos, boolean goesUnstoppable, double unstoppableChance, double unstoppableDuration, double unstoppableCooldown) {
        super(name, health, walkSpeed, runSpeed, viewDistance, blindedMovementSpeed, description, attackDamage, initialAttackTimer, minAttackTimer, maxAttackTimer, canUseWeapon, comboDB, regularCombos);
        this.goesUnstoppable = goesUnstoppable;
        this.unstoppableChance = unstoppableChance;
        this.unstoppableDuration = unstoppableDuration;
        this.unstoppableCooldown = unstoppableCooldown;
    }
    public String toCSV() {
        return name + ", " + description + ", " + viewDistance + ", " + regularCombos + ", " + health + ", " + attackDamage + ", " + initialAttackTimer +", " + minAttackTimer + ", "
                + maxAttackTimer + ", " + canUseWeapon + ", " + comboDB + ", " + goesUnstoppable + ", " + unstoppableChance + ", " + unstoppableDuration + ", " + unstoppableCooldown + ", " + walkSpeed + ", " + runSpeed + ", " + blindedMovementSpeed;
    }
    @Override
    public String toString() {
        String performsRegularCombos;
        String canUseWeaponString;
        String canGoUnstoppableString;
        if(regularCombos){performsRegularCombos = "Yes";}
        else {performsRegularCombos = "No";}
        if(canUseWeapon){canUseWeaponString = "Yes";}
        else {canUseWeaponString = "No";}
        if(goesUnstoppable){canGoUnstoppableString = "Yes";}
        else {canGoUnstoppableString = "No";}
        return "TankThug{" +
                "Thug Name: " + name + '\'' +
                ", Enemy Description: " + description + '\'' +
                ", View Distance: " + viewDistance +
                ", Default Combo: " + performsRegularCombos +
                ", Health: " + health +
                ", Attack Damage: " + attackDamage +
                ", Initial Attack Timer: " + initialAttackTimer +
                ", Min Attack Timer: " + minAttackTimer +
                ", Max Attack Timer: " + maxAttackTimer +
                ", Can Use Weapon: " + canUseWeaponString +
                ", Combo Database: " + comboDB +
                ", Can Go Unstoppable: " + canGoUnstoppableString +
                ", Unstoppable Chance" + unstoppableChance +
                ", Unstoppable Duration: " + unstoppableDuration +
                ", Unstoppable Cooldown: " + unstoppableCooldown +
                ", Walk Speed: " + walkSpeed +
                ", Run Speed: " + runSpeed +
                ", Blinded Movement Speed: " + blindedMovementSpeed +
                '}';
    }
}
