/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.util.ArrayList;

/**
 *
 * @author Christopher
 */
public enum NonValue {
  
  // Static Complex Empties
  NO_RESOURCES(),
  NO_INVENTORY(),
  NO_SHIPS();
  
  // Variables
  private int[] noResources;
  private ArrayList<Object> noInventory;
  private ArrayList<Ship> noShips;

  NonValue() {
    // Initialize Dummy Values
    int[] noResources = {0};
    noInventory = new ArrayList<Object>();
    noShips = new ArrayList<Ship>();
  }
  
  // Getters
  public int[] getResources() {
    return noResources;
  }
  public ArrayList<Object> getInventory() {
    return noInventory;
  }
  public ArrayList<Ship> getShips() {
    return noShips;
  }
}
