/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

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
  
  // Constructor
  public Stage() {
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
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 79 * hash + Objects.hashCode(this.name);
    hash = 79 * hash + Objects.hashCode(this.description);
    hash = 79 * hash + Objects.hashCode(this.type);
    hash = 79 * hash + Arrays.hashCode(this.inventory);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Stage other = (Stage) obj;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.type, other.type)) {
      return false;
    }
    if (!Arrays.equals(this.inventory, other.inventory)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Stage{" + "name=" + name + ", description=" + description + ", type=" + type + ", inventory=" + inventory + '}';
  }
}
