/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.InventoryControl;
import byui.cit260.seaTraders.model.Item;
import static byui.cit260.seaTraders.model.Ship.getName;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christopher
 */
public class ShipDetailsView extends View {
  
  // Default Constructor
  public ShipDetailsView() {
    super("\n----------------------------------------"
        + "\n| STATUS                               |"
        + "\n----------------------------------------"
        + "\nC – Cargo Manifest"
        + "\nJ – Journal"
        + "\nQ – Quest Log"
        + "\nR – Resources"
        + "\nM - Return to Main Menu"
        + "\n----------------------------------------"
        + "\n| ITEM CATALOG                         |"
        + "\n----------------------------------------"
        + "\nPress 'S' to sort and display all ship fittings in the Item Catalog."
        + "\nPress 'P' to save a list of them to a file named \"fittings.txt\".");
  }

  @Override
  public void display() {
    boolean done = false; // Start unfinished
    do {
      // Prompt for menu option
      String value = this.getInput();
      if (value.toUpperCase().equals("M")) // User is quitting
        return; // Return to Main Menu
      
      // Else continue
      done = this.doAction(value);
    } while (!done);
  }

  @Override
  public boolean doAction(String choice) {
    // Convert to upper case
    choice = choice.toUpperCase();
    
    // Check menu option
    switch (choice) {
      case "C":
        this.displayCargoManifest();
        break;
      case "J":
        this.displayJournal();
        break;
      case "Q":
        this.displayQuestLog();
        break;
      case "R":
        this.displayResources();
        break;
      case "M":
        return true;
      case "S":
        this.displayShipFittings();
        break;
      case "P":
        try {
        // Save fittings list to specified file
          this.writeShipFittings(this.getFilePath());
        } catch (IOException ex) {
          ErrorView.display(this.getClass().getName(),
                  "Unable to save output.");
        }
        break;
      default:
        ErrorView.display(this.getClass().getName(),
                "Invalid selection; please try again.");
    }
    
    return false;
  }

  private void displayCargoManifest() {
    this.console.println("\n*** displayCargoManifest() function called ***");
  }

  private void displayJournal() {
    this.console.println("\n*** displayJournal() function called ***");
  }

  private void displayQuestLog() {
    this.console.println("\n*** displayQuestLog() function called ***");
  }

  private void displayResources() {
    this.console.println("\n*** displayResources() function called ***");
  }
  
  private void displayShipFittings() {
    // Fetch displayed inventory
    InventoryControl sortTest = new InventoryControl();
    Item[] inventory = sortTest.sortInventory();

    // Display Inventory
    StringBuilder line;
    this.console.println("");
    for (Item item : inventory) {
      // 40 character line
      line = new StringBuilder("                                        ");
      line.insert(0, item.getName());
      line.insert(20, item.getType());
      line.insert(30, item.getValue());
      this.console.println(line.toString());
    }
  }

  private String getFilePath() {
    String filePath = null;
    boolean valid = false;
    
    try {
      // Get user's file path
      while (!valid) { // Require valid entry
        this.console.println("\nEnter a file path for saving the fittings list.");

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

    return filePath;
  }
  
  private void writeShipFittings(String filePath) throws IOException {
    // Initialize file details
    FileWriter outFile = null;
    
    try {
      // Create a new file
      outFile = new FileWriter(filePath);
      
      // Fetch inventory
      InventoryControl writeTest = new InventoryControl();
      Item[] inventory = writeTest.sortInventory();

      // Write inventory to file
      outFile.write("FITTING             TYPE      VALUE \n" 
              + "====================================\n");
      StringBuilder line;
      for (Item item : inventory) {
        // 40 character line
        line = new StringBuilder("                                        ");
        line.insert(0, item.getName());
        line.insert(20, item.getType());
        line.insert(30, item.getValue());
        outFile.write(line.toString() + "\n");
      }
      
      // Confirm write success
      this.console.println("\n*** List save was successful! ***");
      
      outFile.flush();
    } catch (IOException e) {
        ErrorView.display(this.getClass().getName(),
                  "Unable to save output.");
    } finally {
      if (outFile != null) {
        outFile.close();
      }
    }
  }
}



