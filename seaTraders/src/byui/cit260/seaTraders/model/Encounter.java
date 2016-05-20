/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;
import java.util.Objects;

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
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + Objects.hashCode(this.description);
    hash = 67 * hash + Objects.hashCode(this.type);
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
    final Encounter other = (Encounter) obj;
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.type, other.type)) {
      return false;
    }
    return true;  
  }
  
  @Override
  public String toString() {
    return "Encounter{" + "description=" + description + ", type=" + type + '}';
  }
}