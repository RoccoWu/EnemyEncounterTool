public enum EnemyType {
    THUGLEVEL1,
    THUGLEVEL2,
    THUGLEVEL3,
    TANKTHUG,
    AGILETHUG,
    KNIFETHUG,
    SHIELDTHUG,
    BOSS;

    public static String makeEnemyDatabase() {

        String enemyMenu = "Choose type of enemies: ";
        for(EnemyType t : EnemyType.values()){
            enemyMenu += "\n" + (t.ordinal() + 1)
                    + ": " + t.name();
        }
        return enemyMenu;
    }
    public static String readEnemyTypes() {

        String enemyMenu = "";
        for(EnemyType t : EnemyType.values()){
            enemyMenu += "\n" + (t.ordinal() + 1)
                    + ": " + t.name();
        }
        return enemyMenu;
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

    public void createEnemy(int enemyTypeID)
    {
        switch(enemyTypeID)
        {
            case 1:
                EnemyType.getEnemyNumber(1);
                break;
            case 2:
                EnemyType.getEnemyNumber(2);
                break;
            case 3:
                EnemyType.getEnemyNumber(3);
                break;
            case 4:
                EnemyType.getEnemyNumber(4);
                break;
            case 5:
                EnemyType.getEnemyNumber(5);
                break;
            case 6:
                EnemyType.getEnemyNumber(6);
                break;
            case 7:
                EnemyType.getEnemyNumber(7);
                break;
            case 8:
                EnemyType.getEnemyNumber(8);
                break;
        }
    }
}


