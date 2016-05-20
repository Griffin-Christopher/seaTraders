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
public class Quest implements Serializable {
  
  // Variables
  private boolean active;
  private boolean completed;
  private boolean unlocked;
  private String description;
  private String reward;
  private String type;
  private String objective;
  
  // Constructor
  public Quest() {
  }

  // Getters
  public boolean isActive() {
    return active;
  }
  public boolean isCompleted() {
    return completed;
  }
  public boolean isUnlocked() {
    return unlocked;
  }
  public String getDescription() {
    return description;
  }
  public String getReward() {
    return reward;
  }
  public String getType() {
    return type;
  }
  public String getObjective() {
    return objective;
  }

  // Setters
  public void setActive(boolean active) {
    this.active = active;
  }
  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
  public void setUnlocked(boolean unlocked) {
    this.unlocked = unlocked;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setReward(String reward) {
    this.reward = reward;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setObjective(String objective) {
    this.objective = objective;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 37 * hash + (this.active ? 1 : 0);
    hash = 37 * hash + (this.completed ? 1 : 0);
    hash = 37 * hash + (this.unlocked ? 1 : 0);
    hash = 37 * hash + Objects.hashCode(this.description);
    hash = 37 * hash + Objects.hashCode(this.reward);
    hash = 37 * hash + Objects.hashCode(this.type);
    hash = 37 * hash + Objects.hashCode(this.objective);
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
    final Quest other = (Quest) obj;
    if (this.active != other.active) {
      return false;
    }
    if (this.completed != other.completed) {
      return false;
    }
    if (this.unlocked != other.unlocked) {
      return false;
    }
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.reward, other.reward)) {
      return false;
    }
    if (!Objects.equals(this.type, other.type)) {
      return false;
    }
    if (!Objects.equals(this.objective, other.objective)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Quest{" + "active=" + active + ", completed=" + completed + ", unlocked=" + unlocked + ", description=" + description + ", reward=" + reward + ", type=" + type + ", objective=" + objective + '}';
  }
}
