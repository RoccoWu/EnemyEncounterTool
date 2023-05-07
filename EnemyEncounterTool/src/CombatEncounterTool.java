import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList; //in case i want to use arraylist
import java.util.HashMap;
import java.util.Map;

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
    //public ArrayList<CombatEncounter> combatEncounter;
    public HashMap<String, CombatEncounter> combatEncounterDB;
    private MainMenu mainMenu;
    private boolean hasFinishedRunningProgram = false;
    private int maxEnemiesInCounter = 10;
    private String userInput;
    private static ComboDatabase comboDB= new ComboDatabase();
    private static final String ENEMYENCOUNTERLIST = "src/enemyencounters.csv";
    public static HashMap<EnemyType,EnemyBehaviorComponent> enemyDefinitions;

    public CombatEncounterTool(BFF bff, HashMap<String, CombatEncounter> combatEncounterDB, MainMenu mainMenu) {
        this.bff = bff;
        this.combatEncounterDB = combatEncounterDB;
        this.mainMenu = mainMenu;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to Combat Encounter Tool");
        BFF bff = new BFF();
        //ArrayList<CombatEncounter> combatDatabase = new ArrayList<>();
        HashMap<String, CombatEncounter> combatEncounterDB = new HashMap<>();
        MainMenu mainMenu = new MainMenu();
        CombatEncounterTool combatEncounterTool = new CombatEncounterTool(bff, combatEncounterDB, mainMenu);
        File  CombatEncounterList = new File("enemyencounters.csv");
        PrintWriter out = new PrintWriter(CombatEncounterList);
        enemyDefinitions = new HashMap<EnemyType, EnemyBehaviorComponent>(); //created a hashmap called enemyDefinitions that can store all the enemy types and their stats so I can reuse.
        //THUG LEVEL 1
        enemyDefinitions.put(EnemyType.THUGLEVEL1, new ThugLevel1("Thug Level 1", 100, 1,
                5, 10, 2,
                " these thugs are the more numerous types you will encounter ", 20, 3,
                3, 5, true, comboDB, true));
        //THUG LEVEL 2
        enemyDefinitions.put(EnemyType.THUGLEVEL2, new ThugLevel2("Thug Level 2", 100, 1,
                5, 10, 2, " these thugs are able similar to Thug Level 1s except they can also leap attack to close in distance ",
                20, 25, 2, 3,true, comboDB, true, true, 5));

        //THUG LEVEL 3
        enemyDefinitions.put(EnemyType.THUGLEVEL3, new ThugLevel3("Thug Level 3", 120, 1, 6, 15, 2,
                " these thugs are more advanced with the ability to even counter the player's attacks ", 20, 25, 2, 3,
                true,  comboDB, true, true, 4, true));

        //TANK THUG
        enemyDefinitions.put(EnemyType.TANKTHUG, new TankThug("Tank Thug", 150,0.8 , 4, 10, 1.5,
                " these tank thugs are the more beefier types that take a lot longer to defeat as well as having a chance to go unstoppable where their attacks can't be interrupted ",
                20 , 25, 2, 3,false,  comboDB, false, true, 0.25, 4, 10));

        //AGILE THUG
        enemyDefinitions.put(EnemyType.AGILETHUG, new AgileThug("Agile Thug", 80, 1.25, 8, 10, 2.2,
                " these thugs are nimble and are able to move a lot quicker as well as dodge the player's attacks ", 15, 2,
                2, 3,false,  comboDB, true, true, 4, 0.25, 10));

        //KNIFE THUG
        enemyDefinitions.put(EnemyType.KNIFETHUG,new KnifeThug("Thug (Knife)", 100, 1, 6, 15, 2,
                " these thugs spawn with a knife already ", 20, 2, 2, 3,true,  comboDB, true));

        //SHIELD THUG
        enemyDefinitions.put(EnemyType.SHIELDTHUG,new ShieldThug("Thug (Shield)", 100, 1, 6, 15, 2,
                " these thugs spawn with a shield already ", 10, 3, 3, 4,true,  comboDB, true));

        //BOSS
        enemyDefinitions.put(EnemyType.BOSS,new Boss("Big Boss", 100, 1, 6, 15, 2,
                " These are boss type enemies that will ", 30, 2, 2, 4,true, comboDB,
                true, 100));
        combatEncounterTool.runProgram(); //run the rest of the program.
    }
    public void runProgram()
    {
            bff.printFancy(mainMenu.getMenuString());
            hasFinishedRunningProgram = false;
            while(!hasFinishedRunningProgram) //while the program is running
            {
                userInput = bff.input("enter something to continue "); //user can choose from the menu below
                bff.print(userInput);
                switch(userInput) //switch statement manages what the user can choose
                {
                    case "1":
                        createCombatEncounter();
                        break;
                    case "2":
                        viewAllCombatEncounter();
                        break;
                    case "3":
                        lookUpEnemyTypes();
                        break;
                    case "4":
                        quit();
                        break;
                }
            }
        bff.printFancy(mainMenu.getMenuString());
    }

    public void createCombatEncounter()
    {
        bff.print("CREATE COMBAT ENCOUNTER");
        //TODO: Create a combat encounter object, ask for size of combat encounter, show list of enemyTypes to add, and add this combat encounter to a database of other combat encounters
        String ceName = bff.input("What do you want to name this combat encounter?");
        int ceSize = bff.inputInt("How many enemies will be in this combat encounter?");
        boolean finishedFillingEncounters = false;
        while(ceSize <1 || ceSize > maxEnemiesInCounter) //runs the following until the system gets the correct input from user
        {
            if (ceSize == -1) { //user can input -1 if they want to quit
                hasFinishedRunningProgram = false;
                bff.printFancy(mainMenu.getMenuString());
                ArrayList<EnemyType> enemyTypes = new ArrayList<>();
                EnemyType.makeEnemyDatabase();
                bff.printFancy(EnemyType.makeEnemyDatabase());
                return;
            } else if (ceSize < 1 || ceSize > maxEnemiesInCounter) {
                ceSize = bff.inputInt("Invalid Input, please input a number between 1 and " + maxEnemiesInCounter + " or -1 to quit");
            }
        }

            CombatEncounter newCombatEncounter = new CombatEncounter(ceName);

            for(int i = 1; i<= ceSize; i++) //runs for loop based on the size of what the player wants
            {
                //TODO: print enemy types menu, the user will select which enemy type, add that enemy type into a list of enemy types (npcs) that the Combat Encounter will hold, save the
                bff.printFancy(EnemyType.makeEnemyDatabase());
                int userEnemyTypeInput = bff.inputInt("Select enemy type");
                //switch statement here
                //TODO: check to see if input is in bounds
                EnemyType enemyToAdd = EnemyType.values()[userEnemyTypeInput - 1];
                switch(enemyToAdd)
                {
                    case THUGLEVEL1:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.THUGLEVEL1)); //adds thug level 1 enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new ThugLevel1("Thug Level 1", 100, 1, 5, 10, 2, " these thugs are the more numerous types you will encounter ", 20, 3, 3, 5, true, comboDB, true));
                        bff.print("Added a Thug Level 1 Enemy to " + ceName);
                        break;

                    case THUGLEVEL2:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.THUGLEVEL2)); //adds thug level 2 enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new ThugLevel2("Thug Level 2", 100, 1, 5, 10, 2, " these thugs are able similar to Thug Level 1s except they can also leap attack to close in distance ", 20, 25, 2, 3,true, comboDB, true, true, 5));
                        bff.print("Added a Thug Level 2 Enemy to " + ceName);
                        break;
                    case THUGLEVEL3:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.THUGLEVEL3)); //adds thug level 3 enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new ThugLevel3("Thug Level 3", 120, 1, 6, 15, 2, " these thugs are more advanced with the ability to even counter the player's attacks ", 20, 25, 2, 3,true,  comboDB, true, true, 4, true));
                        bff.print("Added a Thug Level 3 Enemy to " + ceName);
                        break;
                    case TANKTHUG:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.TANKTHUG)); //adds tank thug enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new TankThug("Tank Thug", 150,0.8 , 4, 10, 1.5, " these tank thugs are the more beefier types that take a lot longer to defeat as well as having a chance to go unstoppable where their attacks can't be interrupted ", 20 , 25, 2, 3,false,  comboDB, false, true, 0.25, 4, 10));
                        bff.print("Added a Tank Thug Enemy to " + ceName);
                        break;
                    case AGILETHUG:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.AGILETHUG)); //adds agile thug enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new AgileThug("Agile Thug", 80, 1.25, 8, 10, 2.2, " these thugs are nimble and are able to move a lot quicker as well as dodge the player's attacks ", 15, 2, 2, 3,false,  comboDB, true, true, 4, 0.25, 10));
                        bff.print("Added a Agile Thug Enemy to " + ceName);
                        break;
                    case KNIFETHUG:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.KNIFETHUG)); //adds knife thug enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new KnifeThug("Thug (Knife)", 100, 1, 6, 15, 2, " these thugs spawn with a knife already ", 20, 2, 2, 3,true,  comboDB, true));
                        bff.print("Added a Knife Thug Enemy to " + ceName);
                        break;
                    case SHIELDTHUG:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.SHIELDTHUG)); //adds shield thug enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new ShieldThug("Thug (Shield)", 100, 1, 6, 15, 2, " these thugs spawn with a shield already ", 10, 3, 3, 4,true,  comboDB, true));
                        bff.print("Added a Shield Thug Enemy to " + ceName);
                        break;
                    case BOSS:
                        newCombatEncounter.addEnemy(enemyDefinitions.get(EnemyType.BOSS)); //adds boss enemy type to the new combat encounter that is being made
                        //newCombatEncounter.addEnemy(new Boss("Big Boss", 100, 1, 6, 15, 2, " These are boss type enemies that will ", 30, 2, 2, 4,true, comboDB, true, 100));
                        bff.print("Added a Boss Enemy to " + ceName);
                        break;
                    }
                }
                //add that enemy to the combatencounter by calling a create enemy method in EnemyType and then adding that enemy in CombatEncounter class
            finishedFillingEncounters = true; //makes it that once the player has finished filling all the spaces in the size, they can move on.
            if(finishedFillingEncounters)
            {
            boolean saveChoice = bff.inputYesNo("Do you want to save this combat encounter?");
            if(saveChoice) //allows players to save their choice.
            {
                //add combat encounter to database of combat encounters via hashmap and writes to csv
                addCombatEncountertoDB(ceName, newCombatEncounter);
                String data = ceName +" Combat Encounter: \n";
                for(EnemyBehaviorComponent enemy : newCombatEncounter.enemies) //writes each enemy to the csv
                {
                    data += enemy.toCSV() +  "\n";
                    Path path = Paths.get("enemyencounters.csv"); //gets the path of the enemyencounters
                    try {
                        Files.writeString(path, data, StandardCharsets.UTF_8);
                        } catch (IOException ex) {
                    }
                }
                bff.print("Added " + ceName + " combat encounter to the list");
            }
            //bff.printFancy(mainMenu.getMenuString());
            }
        bff.printFancy(mainMenu.getMenuString());
    }

    public void viewAllCombatEncounter()
    {
        bff.print("VIEW ALL COMBAT ENCOUNTER");
        //TODO: View all of the combat encounters into a list and show their contents
        for(Map.Entry<String, CombatEncounter> entry: combatEncounterDB.entrySet()) //loops through all combat encounters saved in the combat encounter database
        {
            String key = entry.getKey();
            CombatEncounter combatEncounter = entry.getValue();
            // Access the properties or perform operations on the CombatEncounter object
            bff.print(combatEncounter.getCombatEncounterName() + " Combat Encounter: ");
            for (EnemyBehaviorComponent enemy : combatEncounter.enemies) { //loops through and prints each enemy in each combat encounter.
                bff.print("\t" + enemy);
            }
            bff.print("");
            //list out everything under here
            //bff.print(combatEncounter);
            String name = combatEncounter.getCombatEncounterName();
        }
        //bff.print(userInput);
        bff.printFancy(mainMenu.getMenuString());

    }

    public void lookUpEnemyTypes()
    {
        boolean lookUpEnemyTypeMenu = false;
        bff.print("LOOK UP ENEMY ENCOUNTER");
        //TODO: list all the enemy types in a list use ENEMYTYPE Enum, when user inputs a number it will show info no the corresponding enemy type
        bff.printFancy(EnemyType.readEnemyTypes());
        int userEnemyTypeInput = bff.inputInt("Select enemy type to view info");
        EnemyType enemyToView = EnemyType.values()[userEnemyTypeInput - 1];
        bff.print(enemyDefinitions.get(enemyToView).toString()); //reads each of the enemy type
        bff.printFancy(mainMenu.getMenuString());
    }

    public void quit()
    {
        bff.print("Bye see you next time my g");
        hasFinishedRunningProgram = true;
    }

    public void addCombatEncountertoDB(String name, CombatEncounter encounter)
    {
        combatEncounterDB.put(name, encounter);
    }

    public void writeCombatEncounterToCSV(String csvPath)
    {

    }

    public CombatEncounter getCombatEncounter(String name)
    {
        return combatEncounterDB.get(name);
    }
    public void removeCombatEncounter(String name)
    {
        combatEncounterDB.remove(name);
    }
}