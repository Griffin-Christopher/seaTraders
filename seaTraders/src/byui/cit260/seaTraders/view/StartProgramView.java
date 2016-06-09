/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.GameControl;
import byui.cit260.seaTraders.model.Player;
import java.util.Scanner;

/**
 *
 * @author Christopher Griffin
 */
public class StartProgramView {
  
  private String promptMessage;
  
  // Default Constructor
  public StartProgramView() {
    this.promptMessage = "\nPlease enter your name: ";
    // Display welcome banner
    this.displayBanner();
  }

  public void displayBanner() {
    System.out.println(
        "\n**************************************************************"
      + "\n* SEA TRADERS                                                *"
      + "\n* ===========                                                *"
      + "\n* This naval adventure features trading, ship combat, and    *"
      + "\n* a deadly pirate plot! As the only known survivor of the    *"
      + "\n* Blackscar pirate raid that destroyed your childhood town,  *"
      + "\n* you carry the haunting memories of that experience.        *"
      + "\n*                                                            *"
      + "\n* Now the hardened captain of a trade cog, you'll begin      *"
      + "\n* your tale hauling luxury goods between coastal towns in    *"
      + "\n* in the region.                                             *"
      + "\n**************************************************************");
  }

  public void displayStartProgramView() {
    boolean done = false; // Start unfinished
    do {
      // Prompt for user name
      String playersName = this.getPlayersName();
      if (playersName.toUpperCase().equals("Q")) // User is quitting
        return; // Exit game
      
      // Else continue
      done = this.doAction(playersName);
    } while (!done);
  }

  private String getPlayersName() {
    Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
    String value = "";                         // Returned value
    boolean valid = false;                     // Begin invalid
    
    // Fetch user name
    while (!valid) { // Require valid entry
      System.out.println(this.promptMessage);
      
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
  
  private boolean doAction(String playersName) {
    // Check for 2+ characters
    if (playersName.length() < 2) {
      System.out.println("\nInvalid players name: "
        + "The name must be greater than one character in length");
      return false;
    }
    
    // Create a new player with user's name
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null) { // Empty value
      System.out.println("\nError creating the player.");
      return false;
    }
    
    // Display next view
    this.displayNextView(player);
    
    return true; // Success!
  }

  private void displayNextView(Player player) {
    // Display welcome message
    System.out.println(
            "\n=================================================="
          + "\n Welcome to the game, " + player.getName() + "."
          + "\n We hope you have a lot of fun!"
          + "\n=================================================="
          );
    
    // Create MainMenuView
    MainMenuView mainMenuView = new MainMenuView();
    
    // Display the Main Menu
    mainMenuView.displayMainMenuView();
  }
}