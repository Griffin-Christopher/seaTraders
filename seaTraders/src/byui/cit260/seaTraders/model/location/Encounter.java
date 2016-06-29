/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model.location;

import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class Encounter implements Serializable {
  
  // Variables
  private String description;
  private String type;
  
  // Constructor
  public Encounter() {
  }

  // Getters
  public String getDescription() {
    return description;
  }
  public String getType() {
    return type;
  }
  
  // Setters
  public void setDescription(String description) {
    this.description = description;
  }
  public void setType(String type) {
    this.type = type;
  }

  void setEncounter() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}