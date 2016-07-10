/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public enum QuestCatalog implements Serializable {
  
  /******
  * PLOT
  **********************************************************/
  TUTORIAL_INTRO("PLOT", "DESCRIPTION"),
  TUTORIAL_COMBAT("PLOT", "DESCRIPTION"),
  PLOT_INVESTIGATE("PLOT", "DESCRIPTION"),
  PLOT_NAVY("PLOT", "DESCRIPTION"),  
  /*******
  * TRADE
  **********************************************************/
  TRADE_TOWN1("TRADE", "Trade One: DESCRIPTION."),
  TRADE_TOWN2("TRADE", "Trade Two: DESCRIPTION."),
  TRADE_TOWN3("TRADE", "Trade Three: DESCRIPTION."),
  TRADE_TOWN4("TRADE", "Trade Four: DESCRIPTION."),
  TRADE_TOWN5("TRADE", "Trade Five: DESCRIPTION."),  
  /*********
  * HAULING
  **********************************************************/
  HAUL_TOWN1("HAULING", "Haul One: DESCRIPTION."),
  HAUL_TOWN2("HAULING", "Haul Two: DESCRIPTION."),
  HAUL_TOWN3("HAULING", "Haul Three: DESCRIPTION."),
  HAUL_TOWN4("HAULING", "Haul Four: DESCRIPTION."),
  HAUL_TOWN5("HAULING", "Haul Five: DESCRIPTION."), 
  /********
  * ESCORT
  **********************************************************/
  ESCORT_PRISONER("ESCORT", "Escort Prisoner: DESCRIPTION."),
  ESCORT_TREASURE("ESCORT", "Escort Treasure: DESCRIPTION."),
  ESCORT_VIP("ESCORT", "Escorte VIP: DESCRIPTION."), 
  /********
  * RESCUE
  **********************************************************/
  RESCUE_PRINCESS("RESCUE", "Rescue Princess: DESCRIPTION"),
  RESCUE_MERCHANT("RESCUE", "Resuce Merchant: DESCRIPTION."),
  RESCUE_HOSTAGE("RESCUE", "Rescue Navy Hostage: DESCRIPTION."), 
  /******
  * HUNT
  **********************************************************/
  HUNT_DESERTER("HUNT", "Hunt Navy Deserter: DESCRIPTION."),
  HUNT_SMUGGLER("HUNT", "Hunt Smuggler: DESCRIPTION."),
  HUNT_PIRATE("HUNT", "Hunt Pirate: DESCRIPTION.");
  
  // Variables
  private final String type;
  private final String description;
  
  // Constructor
  QuestCatalog(String type, String description) {
    this.type = type;
    this.description = description;
  }

  // Getters
  public String getDescription() {
    return description;
  }
}