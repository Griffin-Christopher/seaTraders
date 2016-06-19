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
public class Ship implements Serializable {
  
  // Variables
  private String description;
  private int[] stats;
  private int cannons;
  private String type;
  private double[] equipment;
  
  // Constructors
  public Ship() {
    cannons = 4;
  }
  public Ship(int cannons) {
    this.cannons = cannons;
  }

  // Getters
  public String getDescription() {
    return description;
  }
  public int[] getStats() {
    return stats;
  }
  public int getCannons() {
    return cannons;
  }
  public String getType() {
    return type;
  }
  public double[] getEquipment() {
    return equipment;
  }

  // Setters
  public void setDescription(String description) {
    this.description = description;
  }
  public void setStats(int[] stats) {
    this.stats = stats;
  }
  public int setCannons() {
    return cannons;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setEquipment(double[] equipment) {
    this.equipment = equipment;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 31 * hash + Objects.hashCode(this.description);
    hash = 31 * hash + Arrays.hashCode(this.stats);
    hash = 31 * hash + Objects.hashCode(this.type);
    hash = 31 * hash + Arrays.hashCode(this.equipment);
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
    final Ship other = (Ship) obj;
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.type, other.type)) {
      return false;
    }
    if (!Arrays.equals(this.stats, other.stats)) {
      return false;
    }
    if (!Arrays.equals(this.equipment, other.equipment)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Ship{" + "description=" + description + ", stats=" + stats + ", type=" + type + ", equipment=" + equipment + '}';
  }
}
