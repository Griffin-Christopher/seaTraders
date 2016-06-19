/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public abstract class View implements ViewInterface {
  
  // Variables
  protected String displayMessage;
  
  // Constructors
  public View() {
  }
  public View(String message) {
    this.displayMessage = message;
  }
  
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
    Scanner keyboard = new Scanner(System.in); // Get infile for keyboard
    String value = null;                       // Returned value
    boolean valid = false;                     // Begin invalid
    
    // Fetch user choice
    while (!valid) { // Require valid entry
      System.out.println(this.displayMessage);
      
      value = keyboard.nextLine(); // Get next typed line
      value = value.trim();        // Remove leading/trailing blanks
      
      if (value.length() < 1) {    // Empty value
        System.out.println("\nInvalid value: value can not be blank.");
        continue;
      }
       
      break; // End loop after valid entry
    }
    
    return value; // Return valid entry
  }
}
