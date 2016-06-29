/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.CombatControl;
import byui.cit260.seaTraders.control.GameControl;
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
    GameControl.createNewGame();
    
    // Display Game Menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.display();
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

  private void combatTest() {
    // Simulate 1v1
    CombatControl combatTestOne = new CombatControl(SeaTraders.getNPCOne());
    combatTestOne.advanceCombat();
    
    // Simulate 1v2
    CombatControl combatTestTwo = new CombatControl(SeaTraders.getNPCOne(), 
            SeaTraders.getNPCTwo());
    combatTestTwo.advanceCombat();
  }

  private void damageTest() {
    // Pass Participants
    CombatControl damageTest = new CombatControl(SeaTraders.getNPCOne());
    
    // Simulate Attack
    double damage = damageTest.calcDamage(SeaTraders.getPlayer(), 
            SeaTraders.getNPCOne(), SeaTraders.getShip());
    System.out.println("\nPlayer deals " + damage + " damage to the Pirate Ship!");
  }
  
  private void movementTest() {
    // Display Help Menu
    MovementView movementTest = new MovementView();
    movementTest.display();
  }
}