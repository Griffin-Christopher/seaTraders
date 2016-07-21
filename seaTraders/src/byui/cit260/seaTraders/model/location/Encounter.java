/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model.location;

import byui.cit260.seaTraders.model.NPC;
import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class Encounter implements Serializable {
  
  // Objects
  private NPC[] npcs;
  
  // Variables
  private String description;
  private String type;
  
  // Constructors
  public Encounter(/*RANDOM*/) {
    // GENERATE RANDOM NPC ENCOUNTER 
    //randomEncounter();
  }
  public Encounter(NPC[] npcs, String description, String type) {
    this.npcs = npcs;
    this.description = description;
    this.type = type; 
  }

  // Getters
  public NPC[] getNPCS() {
    return npcs;
  }
  public NPC getNPC(int index) {
    return npcs[index];
  }
  public String getDescription() {
    return description;
  }
  public String getType() {
    return type;
  }
  
  // Setters
  public void setNPCS(NPC[] npcs) {
    this.npcs = npcs;
  }
  public void setNPC(int index, NPC npc) {
    this.npcs[index] = npc;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setType(String type) {
    this.type = type;
  }

  // private void randomEncounter() {
  // Pull random Encounter from NPC-based set in EncounterCatalog
  // spawnEncounter() and pull details into self
}