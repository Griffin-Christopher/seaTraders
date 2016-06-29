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
public class Stage implements Serializable {
  
  // Variables
  private String name;
  private String description;
  private String type;
  private double[] inventory;
  private Encounter[] encounter;
  
  // Constructor
  public Stage() {
    for (int i = 0; i < encounter.length; i++) {
      encounter[i] = new Encounter();
      encounter[i].setEncounter();
    }
  }

  // Getters
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public String getType() {
    return type;
  }
  public double[] getInventory() {
    return inventory;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setInventory(double[] inventory) {
    this.inventory = inventory;
  }

  void setStage() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
