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
                switch(userInput) //switch statement manages what the player can choose
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
        //TODO: create some shit here
    }

    public void viewAllCombatEncounter()
    {
        //TODO: create some shit here
    }

    public void lookUpEnemyTypes()
    {
        //TODO: create some shit here

    }

    public void quit()
    {
        bff.print("Bye see you next time my g");
        hasFinishedRunningProgram = true;
    }
}