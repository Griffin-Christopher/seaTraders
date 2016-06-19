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
public class NPC implements Serializable {
  
  // Variables
  private String description;
  private int[] stats;
  private double agility = 0;
  private int armor;
  private String type;
  private double[] loot;
  
  // Constructors
  public NPC(double agility) {
    this.agility = agility;
  }
  public NPC(double agility, int armor) {
    this.agility = agility;
    this.armor = armor;
  }
  public NPC(int armor) {
    this.armor = armor;
  }

  // Getters
  public String getDescription() {
    return description;
  }
  public int[] getStats() {
    return stats;
  }
  public double getAgility() {
    return agility;
  }
  public int getArmor() {
    return armor;
  }
  public String getType() {
    return type;
  }
  public double[] getLoot() {
    return loot;
  }
  
  // Setters
  public void setDescription(String description) {
    this.description = description;
  }
  public void setStats(int[] stats) {
    this.stats = stats;
  }
  
  public int setArmor() {
    return armor;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setLoot(double[] loot) {
    this.loot = loot;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 3;
    hash = 67 * hash + Objects.hashCode(this.description);
    hash = 67 * hash + Arrays.hashCode(this.stats);
    hash = 67 * hash + Objects.hashCode(this.type);
    hash = 67 * hash + Arrays.hashCode(this.loot);
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
    final NPC other = (NPC) obj;
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.type, other.type)) {
      return false;
    }
    if (!Arrays.equals(this.stats, other.stats)) {
      return false;
    }
    if (!Arrays.equals(this.loot, other.loot)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "NPC{" + "description=" + description + ", stats=" + stats + ", type=" + type + ", loot=" + loot + '}';
  }
}
