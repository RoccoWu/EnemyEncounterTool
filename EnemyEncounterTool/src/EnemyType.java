import java.util.ArrayList;
public enum EnemyType {
    THUGLEVEL1,
    THUGLEVEL2,
    THUGLEVEL3,
    TANKTHUG,
    AGILETHUG,
    KNIFETHUG,
    SHIELDTHUG,
    BOSS;

    public static String makeEnemyDastabase() {

        String enenmyMenu = "Choose type of enemies: ";
        for(EnemyType t : EnemyType.values()){
            enenmyMenu += "\n" + (t.ordinal() + 1)
                    + ": " + t.name();
        }
        return enenmyMenu;
    }
    /**
     *
     * @param num (Indexed starting at 1)
     * @return
     */
    public static EnemyType getEnemyNumber(int num) {
        EnemyType[] allProducts = EnemyType.values();
        return allProducts[num-1];
    }
}


