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
public class GameMenuView extends View {  
  // Default Constructor
  public GameMenuView() {
    super("\n----------------------------------------"
        + "\n| STATUS                               |"
        + "\n----------------------------------------"
        + "\nC – Cargo Manifest"
        + "\nJ – Journal"
        + "\nQ – Quest Log"
        + "\nR – Resources"
        + "\nD – Ship Details"
        + "\nM - Return to Main Menu"
        + "\n----------------------------------------"
        + "\n| SHIPYARD                             |"
        + "\n----------------------------------------"
        + "\nT – Travel"
        + "\nP – Repair Ship"
        + "\nB – Buy/Sell Ship Fittings"
        + "\nU – Upgrade Ship"
        + "\nS – Shore Leave"
        + "\n? - Help"
        + "\n----------------------------------------"
        + "\nWhat would you like to do?");
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
      case "D":
        this.displayShipDetails();
        break;
      case "M":
        return true;
      case "T":
        this.movePlayer();
        break;
      case "P":
        this.repairShip();
        break;
      case "B":
        this.fitShip();
        break;
      case "U":
        this.upgradeShip();
        break;
      case "S":
        this.shoreLeave();
        break;
      case "?":
        this.displayHelp();
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

  private void displayShipDetails() {
    System.out.println("\n*** displayShipDetails() function called ***");
  }

  private void movePlayer() {
    System.out.println("\n*** movePlayer() function called ***");
  }

  private void repairShip() {
    System.out.println("\n*** repairShip() function called ***");
  }

  private void fitShip() {
    System.out.println("\n*** fitShip() function called ***");
  }

  private void upgradeShip() {
    System.out.println("\n*** upgradeShip() function called ***");
  }
  
  private void shoreLeave() {
    System.out.println("\n*** shoreLeave() function called ***");
  }
  
  private void displayHelp() {
    System.out.println("\n*** displayHelp() function called ***");
  } 
}