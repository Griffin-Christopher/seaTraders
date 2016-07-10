/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.CombatControl;
import byui.cit260.seaTraders.control.GameControl;
import byui.cit260.seaTraders.exceptions.CombatControlException;
import byui.cit260.seaTraders.exceptions.WorldControlException;
import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.model.NPCCatalog;
import byui.cit260.seaTraders.model.ShipCatalog;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import seatraders.SeaTraders;

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
        + "\nC - Combat Test"
        + "\nD - Damage Test"
        + "\nM - Movement Test"    
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
      case "C":
        this.combatTest();
        break;
      case "D":
        this.damageTest();
        break;
      case "M":
        this.movementTest();
        break;
      default:
        ErrorView.display(this.getClass().getName(),
                "Invalid selection; please try again.");
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
        this.console.println(me.getMessage());
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
        this.console.println(me.getMessage());
    }
    
    // Test parseInt()
    String parseInt = "This test will fail!";
    try {
      parseInt(parseInt);
    } catch (NumberFormatException nf) {
        ErrorView.display(this.getClass().getName(),
                "Unable to parse INTEGER from string.");
    }
    
    
    // Test parseDouble()
    String parseDouble = "This test will fail!";
    try {
      parseDouble(parseDouble);
    } catch (NumberFormatException nf) {
        ErrorView.display(this.getClass().getName(),
                "Unable to parse DOUBLE from string.");
    }
  }

  private void loadGame() {
    String filePath = null;
    boolean valid = false;
    
    try {
      // Get user's save file
      while (!valid) { // Require valid entry
        this.console.println("\nEnter the file path for a saved game.");

        filePath = this.keyboard.readLine(); // Get next typed line
        filePath = filePath.trim();        // Remove leading/trailing blanks

        if (filePath.length() < 1) {    // Empty value
          ErrorView.display(this.getClass().getName(),
                  "Input can not be blank.");
          continue;
        }

        break; // End loop after valid entry
      }
    } catch (IOException e) {
          ErrorView.display(this.getClass().getName(),
                  "Unable to read input.");
    }

    try {
      // Load game details from specified file
      GameControl.loadGame(filePath);
      
      // Display Game Menu
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
    } catch (Exception e) {
        ErrorView.display("MainMenuView", e.getMessage());
    }
  }

  private void saveGame() {
    String filePath = null;
    boolean valid = false;
    
    try {
      // Get user's file path
      while (!valid) { // Require valid entry
        this.console.println("\nEnter a file path for saving the game.");

        filePath = this.keyboard.readLine(); // Get next typed line
        filePath = filePath.trim();        // Remove leading/trailing blanks

        if (filePath.length() < 1) {    // Empty value
          ErrorView.display(this.getClass().getName(),
                  "Input can not be blank.");
          continue;
        }

        break; // End loop after valid entry
      }
    } catch (IOException e) {
          ErrorView.display(this.getClass().getName(),
                  "Unable to save output.");
    }

    try {
      // Save game details to specified file
      GameControl.saveGame(SeaTraders.getCurrentGame(), filePath);
    } catch (Exception e) {
        ErrorView.display("MainMenuView", e.getMessage());
    }
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
    this.console.println("\n*** quitGame() function called ***");
  }

  private void combatTest() {
    // Simulate 1v1
    try {
      CombatControl combatTestOne = 
              new CombatControl(NPCCatalog.PIRATE_BASIC.spawnNPC());
      combatTestOne.advanceCombat();
    } catch (CombatControlException me) {
        this.console.println(me.getMessage());
    }
    
    // Simulate 1v2
    try {
      CombatControl combatTestTwo = 
              new CombatControl(NPCCatalog.PIRATE_BASIC.spawnNPC(), 
                                NPCCatalog.PIRATE_INTERMEDIATE.spawnNPC());
      combatTestTwo.advanceCombat();
    } catch (CombatControlException me) {
        this.console.println(me.getMessage());
    }
  }

  private void damageTest() {
    // Pass Participants
    try {
      Game.setCurrentShip(ShipCatalog.STARTER_SHIP.spawnShip());
      CombatControl damageTest = 
              new CombatControl(NPCCatalog.PIRATE_BASIC.spawnNPC());

      // Simulate Attack
      double damage = damageTest.calcDamage(damageTest.getNPCOne());
      this.console.println("\nPlayer deals " + damage + " damage to the Pirate Ship!");
    } catch (CombatControlException me) {
        this.console.println(me.getMessage());
    }
  }
  
  private void movementTest() {
    // Display Help Menu
    MovementView movementTest = new MovementView();
    movementTest.display();
  }
}