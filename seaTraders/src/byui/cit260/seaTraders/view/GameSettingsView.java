/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.model.Game;
import java.util.Scanner;

/**
 *
 * @author Christopher Griffin
 */
public class GameSettingsView extends View {
  
  // Variables
  private String difficultyText;
  private String rateText;
  
  // Default Constructor
  public GameSettingsView() {
    this.difficultyText = 
            "\nDIFFICULTY" 
          + "\nS – Story Mode" 
          + "\nE – Easy" 
          + "\nN – Normal" 
          + "\nH – Hard";
    this.rateText = 
            "\nPIRATE ENCOUNTER RATE" 
          + "\n 50% – Half as likely" 
          + "\n100% – Normal rate" 
          + "\n200% – Twice as likely" 
          + "\n400% – Four times as likely";
  }
  
  @Override
  public void display() {
    boolean done = false; // Start unfinished
    do {
      // Prompt for input
      String input = this.getInput();
      
      // Change Settings
      if (input.toUpperCase().equals("Y"))
        done = changeSettings();
              
      // Return to Main Menu
      else if (input.toUpperCase().equals("N"))
        return;
      
      // Invalid Input
      else
        System.out.println("\nInvalid input: that is not an option.");
    } while (!done);
  }

  @Override
  public String getInput() {
    Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
    String value = null;                       // Returned value
    boolean valid = false;                     // Begin invalid
    
    // Fetch user choice
    while (!valid) { // Require valid entry
      String currentDifficulty = Game.getGameDifficulty();
      String currentRate = Game.getPirateRate();
      
      // Dynamically display current game settings
      System.out.println("\n----------------------------------------"
            + "\n| Game Settings                        |"
            + "\n----------------------------------------"
            + "\nDIFFICULTY"
            + "\n " + currentDifficulty
            + "\n"
            + "\nPIRATE ENCOUNTER RATE"
            + "\n " + currentRate
            + "\n----------------------------------------"
            + "\nWould you like to change these settings? (Y/N)");
      
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

  private boolean changeSettings() {
    Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
    String value = null;                       // Returned value
    boolean valid = false;                     // Begin invalid
   
    // Fetch New Difficulty
    while (!valid) { // Require valid entry
      System.out.println(this.difficultyText + "\nPlease choose a difficulty: ");
      
      value = keyboard.nextLine(); // Get next typed line
      value = value.trim();        // Remove leading/trailing blanks
      
      if (value.length() < 1) {   // Empty value
        System.out.println("\nInvalid value: value can not be blank.");
        continue;
      }
      
      // Convert Input
      String setting = null;
      switch (value.toUpperCase()) {
        case "S":
          setting = "Story Mode";
          break;
        case "E":
          setting = "Easy";
          break;
        case "N":
          setting = "Normal";
          break;
        case "H":
          setting = "Hard";
          break;
        default:
          System.out.println("\n*** Invalid selection *** Try again.");
          continue;
      }   
      
      // Store New Difficulty
      if (setting != null) {
        Game.setGameDifficulty(setting);
        break; // End loop after valid entry
      }
    }
    
    // Fetch New Encounter Rate
    while (!valid) { // Require valid entry
      System.out.println(this.rateText + "\nPlease choose an encounter rate: ");
      
      value = keyboard.nextLine(); // Get next typed line
      value = value.trim();        // Remove leading/trailing blanks
      
      if (value.length() < 1) {   // Empty value
        System.out.println("\nInvalid value: value can not be blank.");
        continue;
      }
      
      // Convert Input
      String setting = null;
      switch (value.toUpperCase()) {
        case "50%":
          setting = "Half as likely";
          break;
        case "100%":
          setting = "Normal Rate";
          break;
        case "200%":
          setting = "Twice as likely";
          break;
        case "400%":
          setting = "Four times as likely";
          break;
        default:
          System.out.println("\n*** Invalid selection *** Try again.");
      }   
      
      // Store New Encounter Rate
      if (setting != null) {
        Game.setPirateRate(setting);
        break; // End loop after valid entry
      }
    }
    
    return false;  // Loop endlessly until player returns to Main Menu
  }

  @Override
  public boolean doAction(String value) {
    // EMPTY FOR NOW
    return false;
  }
}