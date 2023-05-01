public enum WeaponType {
    KnifeType,
    ThrowableType,
    PoleType,
    ChainType,
    ShieldType;

    public static String makeWeaponDatabase() {

        String categoryMenu = "Choose type of weapon that can be picked up: ";
        for(WeaponType t : WeaponType.values()){
            categoryMenu += "\n" + (t.ordinal() + 1)
                    + ": " + t.name();
        }
        return categoryMenu;

    }
    /**
     *
     * @param num (Indexed starting at 1)
     * @return
     */
    public static WeaponType getEnemyNumber(int num) {
        WeaponType[] allProducts = WeaponType.values();
        return allProducts[num-1];
    }
}
