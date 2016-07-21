/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.model.Player;
import byui.cit260.seaTraders.model.World;

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
        + "\nW - View World Map"
        + "\nC – Cargo Manifest"
        + "\nJ – Journal"
        + "\nQ – Quest Log"
        + "\nR – Resources"
        + "\nD – Ship Details"
        + "\nM - Return to Main Menu"
        + "\n----------------------------------------"
        + "\n|  " 
        + Player.getCurrentLocation().getStage().getName()
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
      case "W":
        this.displayWorldMap();
        break;
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
        this.displayMainMenu();
        break;
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
        this.console.println("\n*** Invalid selection *** Try again.");
    }
    
    return false;
  }
  
  private void displayWorldMap() {
    this.console.println("              === SEA TRADERS WORLD MAP ===           ");
    this.console.println("   | 00 | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
    for (int r = 0; r < World.getRowCount(); r++) {
      this.console.println("---|----|----|----|----|----|----|----|----|----|----|");
      StringBuilder line = new StringBuilder(44);
      line.append(" ").append(r).append(" |");
      for (int c = 0; c < World.getColumnCount(); c++) {
        if (World.getLocation(r, c).isUnlocked()) {
          line.append(" ").append(World.getLocation(r, c).getSymbol()).append(" |");
        }
        else {
          line.append(" ?? |");
        }
      }
      this.console.println(line.toString());
    }
    this.console.println("---|----|----|----|----|----|----|----|----|----|----|");
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

  private void displayShipDetails() {
    // Display Ship Details
    ShipDetailsView shipDetails = new ShipDetailsView();
    shipDetails.display();
  }

  private void displayMainMenu() {
    // Display Main Menu
      MainMenuView mainMenu = new MainMenuView();
      mainMenu.display();
  }
  
  private void movePlayer() {
    displayWorldMap();
    MovementView travel = new MovementView();
    travel.display();
  }

  private void repairShip() {
    this.console.println("\n*** repairShip() function called ***");
  }

  private void fitShip() {
    this.console.println("\n*** fitShip() function called ***");
  }

  private void upgradeShip() {
    this.console.println("\n*** upgradeShip() function called ***");
  }
  
  private void shoreLeave() {
    this.console.println("\n*** shoreLeave() function called ***");
  }
  
  private void displayHelp() {
    this.console.println("\n*** displayHelp() function called ***");
  } 
}