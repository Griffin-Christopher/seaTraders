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
public class Item implements Serializable {
  
  // Variables
  private String name;
  private String description;
  private int[] stats;
  private String type;
  
  // Constructor
  public Item() {
  }

  // Getters
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public int[] getStats() {
    return stats;
  }
  public String getType() {
    return type;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setStats(int[] stats) {
    this.stats = stats;
  }
  public void setType(String type) {
    this.type = type;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 3;
    hash = 89 * hash + Objects.hashCode(this.name);
    hash = 89 * hash + Objects.hashCode(this.description);
    hash = 89 * hash + Arrays.hashCode(this.stats);
    hash = 89 * hash + Objects.hashCode(this.type);
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
    final Item other = (Item) obj;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.type, other.type)) {
      return false;
    }
    if (!Arrays.equals(this.stats, other.stats)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Item{" + "name=" + name + ", description=" + description + ", stats=" + stats + ", type=" + type + '}';
  }
}
