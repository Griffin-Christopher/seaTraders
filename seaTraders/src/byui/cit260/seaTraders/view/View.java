/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher Griffin
 */
public abstract class View implements ViewInterface {
  
  // Variables
  protected String displayMessage;
  
  protected final BufferedReader keyboard = SeaTraders.getInFile();
  protected final PrintWriter console = SeaTraders.getOutFile();
  
  // Constructors
  public View() {
  }
  public View(String message) {
    this.displayMessage = message;
  }
  
  // Overrides
  @Override
  public void display() {
    boolean done = false; // Start unfinished
    do {
      // Prompt for menu option
      String value = this.getInput();
      if (value.toUpperCase().equals("Q")) // User is quitting
        return; // Exit game
      
      // Else continue
      done = this.doAction(value);
    } while (!done);
  }
  
  @Override
  public String getInput() {
    String value = null;                       // Returned value
    boolean valid = false;                     // Begin invalid
    
    try {
      // Fetch user choice
      while (!valid) { // Require valid entry
        this.console.println(this.displayMessage);

        value = this.keyboard.readLine(); // Get next typed line
        value = value.trim();        // Remove leading/trailing blanks

        if (value.length() < 1) {    // Empty value
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
    
    return value; // Return valid entry
  }
}