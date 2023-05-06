import java.util.ArrayList;

public class MainMenu {

    public enum MenuOptions {
        CREATE_A_COMBAT_ENCOUNTER("Create a combat encounter"),
        VIEW_ALL_COMBAT_ENCOUNTERS("Display all combat encounters"),
        LOOK_UP_NPC_ENEMY_TYPES("Look up NPC Enemy Types"),
        QUIT("Quit");

        private final String menuString;
        MenuOptions(String menuString)
        {
            this.menuString = menuString;
        }

        public String getMenuString(){
            return  menuString;
        }
    }

    public String getMenuString() {
        ArrayList<String> menuOptions = new ArrayList<String>();
        String output = "";
        menuOptions.add(MenuOptions.CREATE_A_COMBAT_ENCOUNTER.getMenuString());
        menuOptions.add(MenuOptions.VIEW_ALL_COMBAT_ENCOUNTERS.getMenuString());
        menuOptions.add(MenuOptions.LOOK_UP_NPC_ENEMY_TYPES.getMenuString());
        menuOptions.add(MenuOptions.QUIT.getMenuString());

        for (int i = 0; i < menuOptions.size(); i++) //prints each state of the enums for users to read
        {
            String option = menuOptions.get(i);
            output += i +1 + ":" + option + "\n";
        }
        return output;
    }

}
