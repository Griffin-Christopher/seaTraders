/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.CombatControl;
import byui.cit260.seaTraders.control.GameControl;
import byui.cit260.seaTraders.exceptions.WorldControlException;
import byui.cit260.seaTraders.model.Game;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Christopher Griffin
 */
public class MainMenuView extends View {
  // Default Constructor
  public MainMenuView() {
    super("\n----------------------------------------"
        + "\n| Main Menu                            |"
        + "\n----------------------------------------"
        + "\nN - New Game"
        + "\nF - Faulty Game (Test Exceptions)"
        + "\nL - Load Game"
        + "\nS - Save Game"
        + "\nT - Game Settings"
        + "\nH - How To Play"
        + "\nQ - Quit Game"
        /*
        + "\nC - Combat Test"
        + "\nD - Damage Test"
        + "\nM - Movement Test"    
         */
        + "\n----------------------------------------");
  }

  @Override
  public boolean doAction(String choice) {
    // Convert to upper case
    choice = choice.toUpperCase();
    
    // Check menu option
    switch (choice) {
      case "N":
        this.newGame();
        break;
      case "F":
        this.faultyGame();
        break;
      case "L":
        this.loadGame();
        break;
      case "S":
        this.saveGame();
        break;
      case "T":
        this.displayGameSettings();
        break;
      case "H":
        this.displayHelpMenu();
        break;
      case "Q":
        this.quitGame();
        break;
      /*
      case "C":
        this.combatTest();
        break;
      case "D":
        this.damageTest();
        break;
      case "M":
        this.movementTest();
        break;
      */
      default:
        System.out.println("\n*** Invalid selection *** Try again.");
    }
    
    return false;
  }

  private void newGame() {
    // Create New Game
    try {
      GameControl.createNewGame(Game.getCurrentPlayer());
      
      // Display Game Menu
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
    } catch (WorldControlException me) {
      System.out.println(me.getMessage());
    }
  }
  
  private void faultyGame() {
    // Create Faulty Game
    try {
      GameControl.createNewGame(-1);
      
      // Display Game Menu
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
    } catch (WorldControlException me) {
      System.out.println(me.getMessage());
    }
    
    // Test parseInt()
    String parseInt = "This test will fail!";
    try {
      parseInt(parseInt);
    } catch (NumberFormatException nf) {
        System.out.println("*** ERROR: Unable to parse INTEGER from string. ***");
    }
    
    
    // Test parseDouble()
    String parseDouble = "This test will fail!";
    try {
      parseDouble(parseDouble);
    } catch (NumberFormatException nf) {
        System.out.println("*** ERROR: Unable to parse DOUBLE from string. ***");
    }
  }

  private void loadGame() {
    System.out.println("\n*** loadGame() function called ***");
  }

  private void saveGame() {
    System.out.println("\n*** saveGame() function called ***");
  }

  private void displayGameSettings() {
    // Display Game Settings
    GameSettingsView gameSettings = new GameSettingsView();
    gameSettings.display();
  }

  private void displayHelpMenu() {
    // Display Help Menu
    HelpMenuView helpMenu = new HelpMenuView();
    helpMenu.display();
            
  }

  private void quitGame() {
    System.out.println("\n*** quitGame() function called ***");
  }

  /*
  private void combatTest() {
    // Simulate 1v1
    CombatControl combatTestOne = new CombatControl(Game.getNPCOne());
    combatTestOne.advanceCombat();
    
    // Simulate 1v2
    CombatControl combatTestTwo = new CombatControl(Game.getNPCOne(), 
            Game.getNPCTwo());
    combatTestTwo.advanceCombat();
  }

  private void damageTest() {
    // Pass Participants
    CombatControl damageTest = new CombatControl(Game.getNPCOne());
    
    // Simulate Attack
    double damage = damageTest.calcDamage(Game.getNPCOne());
    System.out.println("\nPlayer deals " + damage + " damage to the Pirate Ship!");
  }
  
  private void movementTest() {
    // Display Help Menu
    MovementView movementTest = new MovementView();
    movementTest.display();
  }
  */
}