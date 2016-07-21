/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model.location;

import byui.cit260.seaTraders.model.NPC;
import byui.cit260.seaTraders.model.NPCCatalog;
import java.io.Serializable;

/**
 *
 * @author Christopher
 */
public enum EncounterCatalog implements Serializable {
  
  // PULL DESCRIPTIONS FROM TRANSITION DIALOGUE ENUM
  /*************
  * PLACEHOLDER
  **********************************************************/
  EMPTY("EMPTY", "VOID", new NPC(/*EMPTY*/), new NPC(/*EMPTY*/)),
  /******
  * PLOT
  **********************************************************/
  FIRST_BATTLE("DESCRIPTION", "TYPE",
          NPCCatalog.PIRATE_BASIC.spawnNPC(), new NPC(/*EMPTY*/)),
  PIRATE_AMBUSH("DESCRIPTION", "TYPE",
          NPCCatalog.PIRATE_BOSS.spawnNPC(), new NPC(/*EMPTY*/)),
  BLACKSCAR_AMBUSH("DESCRIPTION", "TYPE",
          NPCCatalog.PIRATE_LORD.spawnNPC(), 
          NPCCatalog.PIRATE_LORD.spawnNPC()),  
  /********
  * COMBAT
  **********************************************************/
  HUNT_PIRATE("DESCRIPTION", "TYPE",
          NPCCatalog.PIRATE_ADVANCED.spawnNPC(), new NPC(/*EMPTY*/)),
  PIRATE_BATTLE("DESCRIPTION", "TYPE", 
          NPCCatalog.PIRATE_INTERMEDIATE.spawnNPC(), 
          NPCCatalog.PIRATE_INTERMEDIATE.spawnNPC()),
  SHIPWRECKED("EMPTY", "VOID", new NPC(/*EMPTY*/), new NPC(/*EMPTY*/));
  
  // Variables
  private String description;
  private String type;
  private NPC[] npcs;
  
  // Constructor
  EncounterCatalog() {
  }
  EncounterCatalog(String description, String type, NPC npcOne, NPC npcTwo) {
    this.description = description;
    this.type = type; 
    this.npcs = new NPC[]{npcOne, npcTwo};
  }

  // Getters
  public NPC[] getNPCS() {
    return npcs;
  }
  public String getDescription() {
    return description;
  }
  public String getType() {
    return type;
  }
  
  public Encounter spawnEncounter() {
    Encounter encounter = new Encounter(getNPCS(), getDescription(), getType());
    return encounter;
  }
}
