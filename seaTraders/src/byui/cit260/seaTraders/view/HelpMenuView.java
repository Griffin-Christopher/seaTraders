/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import java.io.IOException;

/**
 *
 * @author Christopher Griffin
 */
public class HelpMenuView extends View {
  
  // Default Constructor
  public HelpMenuView() {
    super("\n========================================"
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
        + "\n========================================"
        + "\nPress 'R' to return to the main menu");
  }
  
  @Override
  public void display() {
    boolean done = false; // Start unfinished
    do {
      // Prompt for menu option
      String value = this.getInput();
      if (value.toUpperCase().equals("R")) // User is quitting
        return; // Return to Main Menu
      
      // Else continue
      done = this.doAction(value);
    } while (!done);
  }
  
  @Override
  public String getInput() {
    String value = "";                         // Returned value
    boolean valid = false;                     // Begin invalid
    
    try {
      // Fetch user choice
      while (!valid) { // Require valid entry
        this.console.println(this.displayMessage);

        value = this.keyboard.readLine(); // Get next typed line
        value = value.trim();        // Remove leading/trailing blanks

        if (value.length() < 1) {    // Empty value
          ErrorView.display(this.getClass().getName(),
                  "Input cannot be blank.");
          valid = true;
        }

        break; // End loop after valid entry
      }
    } catch (IOException e) {
          ErrorView.display(this.getClass().getName(),
                  "Unable to read input.");
    }
    
    return value; // Return valid entry
  }
  
  @Override
  public boolean doAction(String value) {
    // EMPTY FOR NOW
    return false;
  }
}