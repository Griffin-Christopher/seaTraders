/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.location.Location;
import java.io.PrintWriter;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher Griffin
 */
public class EncounterControl {
  
  private final PrintWriter console = SeaTraders.getOutFile();
  
  public static void setupEncounter(Location location) {
    System.out.println("\n*** setupEncounter() function called ***");
    System.out.println(location.getStage().getEncounter().getDescription());
  } 
}