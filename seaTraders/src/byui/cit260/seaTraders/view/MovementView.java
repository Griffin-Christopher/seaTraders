/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

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
        + "\n1 – Mercenary Bay"
        + "\n2 – Navy Wharf"
        + "\n3 – Shipyard"
        + "\n4 – Trading Company"
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
      case "1":
        this.displayMercenaryBay();
        break;
      case "2":
        this.displayNavyWharf();
        break;
      case "3":
        this.displayShipyard();
        break;
      case "4":
        this.displayTradingCompany();
        break;
      default:
        System.out.println("\n*** Invalid location *** Try again.");
    }
    
    return false;
  }
  
  private void displayMercenaryBay() {
    System.out.println("\n*** displayMercenaryBay() function called ***");
  }

  private void displayNavyWharf() {
    System.out.println("\n*** displayNavyWharf() function called ***");
  }

  private void displayShipyard() {
    System.out.println("\n*** displayShipyard() function called ***");
  }

  private void displayTradingCompany() {
    System.out.println("\n*** displayTradingCompany() function called ***");
  }
}