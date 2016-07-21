/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import byui.cit260.seaTraders.control.WorldControl;
import byui.cit260.seaTraders.model.World;

/**
 *
 * @author Christopher
 */
public class MovementView extends View {
  
  // Default Constructor
  public MovementView() {
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
        + "\n| TRAVEL                               |"
        + "\n----------------------------------------"
        + "\n00 – Combat Tutorial"
        + "\n01 - PLOT 2"
        + "\n03 - PLOT 4"
        + "\n10 – Hunt Encounter"
        + "\n12 – Pirate Encounter"           
        + "\n13 – Random Encounter"            
        + "\n20 – Mercenary Bay"  
        + "\n22 – Navy Wharf"
        + "\n24 – Shipyard"
        + "\n26 – Trading Company"
        + "\n30 - Supply Town 1"
        + "\n31 - Supply Town 2"            
        + "\n32 - Supply Town 3"            
        + "\n33 - Supply Town 4"           
        + "\n34 - Supply Town 5"            
        + "\n35 - Trade Town 1"
        + "\n36 - Trade Town 2"            
        + "\n37 - Trade Town 3"            
        + "\n38 - Trade Town 4"           
        + "\n39 - Trade Town 5"           
        + "\n----------------------------------------"
        + "\nWhere would you like to sail?");
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
      // CONDENSE INTO DYNAMIC CHECK AND FUNCTION CALL
      
      case "02": case "04": case "11": case "14": 
      case "21": case "23": case "25": case "27":
      case "40": 
        this.console.println("\nThis location is locked! Please choose another location.");
        break;
      case "00":
        WorldControl.movePlayer(World.getLocation(0, 0));
        break;
      case "01":
        WorldControl.movePlayer(World.getLocation(0, 1));
        break;
      case "03":
        WorldControl.movePlayer(World.getLocation(0, 3));
        break;
      case "10":
        WorldControl.movePlayer(World.getLocation(1, 0));
        break;
      case "12":
        WorldControl.movePlayer(World.getLocation(1, 2));
        break;
      case "13":
        WorldControl.movePlayer(World.getLocation(1, 3));
        break;
      case "20":
        WorldControl.movePlayer(World.getLocation(2, 0));
        break;
      case "22":
        WorldControl.movePlayer(World.getLocation(2, 2));
        break;
      case "24":
        WorldControl.movePlayer(World.getLocation(2, 2));
        break;
      case "30":
        WorldControl.movePlayer(World.getLocation(3, 0));
        break;
      case "31":
        WorldControl.movePlayer(World.getLocation(3, 1));
        break;
      case "32":
        WorldControl.movePlayer(World.getLocation(3, 2));
        break;
      case "33":
        WorldControl.movePlayer(World.getLocation(3, 3));
        break;
      case "34":
        WorldControl.movePlayer(World.getLocation(3, 4));
        break;
      case "35":
        WorldControl.movePlayer(World.getLocation(3, 5));
        break;
      case "36":
        WorldControl.movePlayer(World.getLocation(3, 6));
        break;
      case "37":
        WorldControl.movePlayer(World.getLocation(3, 7));
        break;
      case "38":
        WorldControl.movePlayer(World.getLocation(3, 8));
        break;
      case "39":
        WorldControl.movePlayer(World.getLocation(3, 9));
        break;        
      default:
        ErrorView.display(this.getClass().getName(),
                "Invalid location; please try again.");
    }

    return false;
  }
  
  private void displayMercenaryBay() {
    this.console.println("\n*** displayMercenaryBay() function called ***");
  }

  private void displayNavyWharf() {
    this.console.println("\n*** displayNavyWharf() function called ***");
  }

  private void displayShipyard() {
    this.console.println("\n*** displayShipyard() function called ***");
  }

  private void displayTradingCompany() {
    this.console.println("\n*** displayTradingCompany() function called ***");
  }
}