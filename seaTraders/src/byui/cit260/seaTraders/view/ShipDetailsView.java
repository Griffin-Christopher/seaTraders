/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.InventoryControl;
import byui.cit260.seaTraders.model.Item;

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
        + "\nPress 'S' to sort and display a list of all ship fittings found in"
        + "\nthe Item Catalog.");
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
      default:
        System.out.println("\n*** Invalid selection *** Try again.");
    }
    
    return false;
  }

  private void displayCargoManifest() {
    System.out.println("\n*** displayCargoManifest() function called ***");
  }

  private void displayJournal() {
    System.out.println("\n*** displayJournal() function called ***");
  }

  private void displayQuestLog() {
    System.out.println("\n*** displayQuestLog() function called ***");
  }

  private void displayResources() {
    System.out.println("\n*** displayResources() function called ***");
  }
  
  private void displayShipFittings() {
    // Fetch displayed inventory
    InventoryControl sortTest = new InventoryControl();
    Item[] inventory = sortTest.sortInventory();

    // Display Inventory
    StringBuilder line;
    System.out.println("");
    for (Item item : inventory) {
      // 40 character line
      line = new StringBuilder("                                        ");
      line.insert(0, item.getName());
      line.insert(20, item.getType());
      line.insert(30, item.getValue());
      System.out.println(line.toString());
    }
  }
}
