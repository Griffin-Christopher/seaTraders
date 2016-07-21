/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.Player;

/**
 *
 * @author Christopher Griffin
 */
public class LocationControl {
  
  public static void displayCurrentLocation() {
    System.out.println("\n*** displayCurrentLocation() function called ***");
    
    if (!"VOID".equals(Player.getCurrentLocation().getStage().getEncounter().getType())) {
      EncounterControl.setupEncounter(Player.getCurrentLocation());
      
    }
    StageControl.setupStage(Player.getCurrentLocation());   
  }
}