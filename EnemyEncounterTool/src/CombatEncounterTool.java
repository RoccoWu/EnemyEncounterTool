import java.util.ArrayList;

/**
 * EnemyEncounterTool runs the entire program.
 *
 * @author Rocco Wu
 * ITP 265, Section
 * Email: roccowu@usc.edu
 *
 */


public class CombatEncounterTool {
    public BFF bff;
    public ArrayList<CombatEncounter> combatEncounter;
    private MainMenu mainMenu;
    private boolean hasFinishedRunningProgram = false;
    private String userInput;
    private static final String ENEMYENCOUNTERLIST = "src/enemyencounters.csv";
    public CombatEncounterTool(BFF bff, ArrayList<CombatEncounter> combatEncounter, MainMenu mainMenu) {
        this.bff = bff;
        this.combatEncounter = combatEncounter;
        this.mainMenu = mainMenu;
    }

    public static void main(String[] args) {
        System.out.println("Big P3NIS");
        BFF bff = new BFF();
        ArrayList<CombatEncounter> combatDatabase = new ArrayList<>();
        MainMenu mainMenu = new MainMenu();
        CombatEncounterTool combatEncounterTool = new CombatEncounterTool(bff, combatDatabase, mainMenu);
        combatEncounterTool.runProgram();
    }
    public void runProgram()
    {
            hasFinishedRunningProgram = false;
            while(!hasFinishedRunningProgram) //while the program is running
            {
                userInput = bff.input("enter something to continue "); //user can choose from the menu
                bff.print(userInput);
                switch(userInput) //switch statement manages what the user can choose
                {
                    case "0":
                        createCombatEncounter();
                        break;
                    case "1":
                        viewAllCombatEncounter();
                        break;
                    case "2":
                        lookUpEnemyTypes();
                        break;
                    case "3":
                        quit();
                        break;
                }
            }
        bff.printFancy(mainMenu.getMenuString());
    }

    public void createCombatEncounter()
    {
        //TODO: Create a combat encounter object, ask what the name for the combat encounter, ask for size of combat encounter, show list of enemyTypes to add, and add this combat encounter to a database of other combat encounters
        String ceName = bff.input("What do you want to name this combat encounter?");
        int ceSize = bff.inputInt("How many enemies will be in this combat encounter?");
        for(int i = 0; i<= ceSize; i++)
        {
            //TODO: print enemy types, the user will select which enemy type, add that enemy type into a list of enemy types (npcs) that the Combat Encounter will hold, save the
        }
        boolean saveChoice = bff.inputYesNo("Do you want to save this combat encounter?");

        if(saveChoice)
        {
            //add combat encounter to database of combat encounters
        }

        else {
            //return to menu
        }
    }

    public void viewAllCombatEncounter()
    {
        //TODO: View all of the combat encounters into a list and show their contents
    }

    public void lookUpEnemyTypes()
    {
        //TODO: list all the enemy types in a list use ENEMYTYPE Enum, when user inputs a number it will show info no the corresponding enemy type
    }

    public void quit()
    {
        bff.print("Bye see you next time my g");
        hasFinishedRunningProgram = true;
    }
}