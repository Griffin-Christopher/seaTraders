/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.location.Location;

/**
 *
 * @author Christopher Griffin
 */
public class StageControl {
  
  public static void setupStage(Location location) {
    System.out.println("\n*** setupStage() function called ***");
    System.out.println(location.getStage().getDescription());
  } 
}