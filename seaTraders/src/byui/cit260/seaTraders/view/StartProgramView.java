/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.GameControl;
import byui.cit260.seaTraders.model.Player;

/**
 *
 * @author Christopher Griffin
 */
public class StartProgramView extends View{
  // Default Constructor
  public StartProgramView() {
    super("\nPlease enter your name: ");
    
    // Display welcome banner
    displayBanner();
  }

  private void displayBanner() {
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
  
  @Override
  public boolean doAction(String playersName) {
    // Check for 2+ characters
    if (playersName.length() < 2) {
      System.out.println("\nInvalid players name: "
        + "The name must be greater than one character in length");
      return false;
    }
    
    // Create a new player with user's name
    GameControl.createPlayer(playersName);
    
    if (Player.getName() == null) { // Empty value
      System.out.println("\nError creating the player.");
      return false;
    }
    
    // Display next view
    this.displayNextView();
    
    return true; // Success!
  }

  private void displayNextView() {
    // Display welcome message
    System.out.println(
            "\n=================================================="
          + "\n Welcome to the game, " + Player.getName() + "."
          + "\n We hope you have a lot of fun!"
          + "\n=================================================="
          );
    
    // Create MainMenuView
    MainMenuView mainMenuView = new MainMenuView();
    
    // Display the Main Menu
    mainMenuView.display();
  }
}