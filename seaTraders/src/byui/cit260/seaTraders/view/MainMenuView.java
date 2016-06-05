/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.GameControl;
import java.util.Scanner;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher Griffin
 */
public class MainMenuView {
  
  // Variables
  private String menu;

  // Default Constructor
  public MainMenuView() {
    this.menu = "\n"
              + "\n----------------------------------------"
              + "\n| Main Menu                            |"
              + "\n----------------------------------------"
              + "\nN - New Game"
              + "\nL - Load Game"
              + "\nS - Save Game"
              + "\nT - Game Settings"
              + "\nH - How To Play"
              + "\nQ - Quit Game"
              + "\n----------------------------------------";
  }

  public void displayMainMenuView() {
    boolean done = false; // Start unfinished
    do {
      // Prompt for menu option
      String menuOption = this.getMenuOption();
      if (menuOption.toUpperCase().equals("Q")) // User is quitting
        return; // Exit game
      
      // Else continue
      done = this.doAction(menuOption);
    } while (!done);
  }

  private String getMenuOption() {
    Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
    String value = ""; // Returned value
    boolean valid = false; // Begin invalid
    
    // Fetch user choice
    while (!valid) { // Require valid entry
      System.out.println("\n" + this.menu + "\nPlease choose a menu option: ");
      
      value = keyboard.nextLine(); // Get next typed line
      value = value.trim();        // Remove leading/trailing blanks
      
       if (value.length() < 1) {   // Empty value
         System.out.println("\nInvalid value: value can not be blank.");
         continue;
       }
       
       break; // End loop after valid entry
    }
    
    return value; // Return valid entry
  }

  private boolean doAction(String choice) {
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
        this.displaySettings();
        break;
      case "H":
        this.displayHelpMenu();
        break;
      case "Q":
        this.quitGame();
        break;
      default:
        System.out.println("\n*** Invalid selection *** Try again.");
        //break;
    }
    
    return false;
  }

  private void newGame() {
    // Create new game
    GameControl.createNewGame(SeaTraders.getPlayer());
    
    // Display game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayGameMenu();
  }

  private void loadGame() {
    System.out.println("\n*** loadGame() function called ***");
  }

  private void saveGame() {
    System.out.println("\n*** saveGame() function called ***");
  }

  private void displaySettings() {
    System.out.println("\n*** displaySettings() function called ***");
  }

  private void displayHelpMenu() {
    // Display help menu
    HelpMenuView helpMenu = new HelpMenuView();
    helpMenu.displayHelpMenu();
  }

  private void quitGame() {
    System.out.println("\n*** quitGame() function called ***");
  }
}