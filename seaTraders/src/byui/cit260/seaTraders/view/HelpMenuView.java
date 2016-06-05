/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import java.util.Scanner;

/**
 *
 * @author Christopher Griffin
 */
public class HelpMenuView {
  
  // Variables
  private String help;
  private String backMessage;

  // Default Constructor
  public HelpMenuView() {
    this.help = "\n========================================"
              + "\n This menu will eventually describe how "
              + "\n to tackle the initial game mechanics   "
              + "\n leading up to the first game tutorial. "
              + "\n From that point on, those tutorials    "
              + "\n will steadily fill in the blanks.      "
              + "\n                                        "
              + "\n This menu will also contain hotkey     "
              + "\n reminders for thinks like pressing 'O' "
              + "\n to return to the Main Menu from within "
              + "\n an active game.                        "
              + "\n========================================";
    this.backMessage = "\nPress 'R' to return to the main menu";
  }

  void displayHelpMenu() {
    // Display Game Tutorial
    System.out.println("\n" + this.help);
    
    // Check for Menu Exit
    this.leaveMenu();
  }
  
  private void leaveMenu() {
    Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
    String value = "";                         // Returned value
    boolean valid = false;                     // Begin invalid
    
    // Fetch user choice
    while (!valid) { // Require valid entry
      System.out.println("\n" + this.backMessage);
      
      value = keyboard.nextLine(); // Get next typed line
      value = value.trim();        // Remove leading/trailing blanks
      
      if (value.toUpperCase().equals("R")) {   // Empty value
        System.out.println("\nInvalid value: value can not be blank.");
        valid = true;
      }
      else {
        // Valid Input Reminder
        System.out.println("\nInvalid value: value can not be blank.");
      } 
    }
  } 
}