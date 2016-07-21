/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class Quest implements Serializable {
  
  // Detail Variables
  private String type;
  private String description;
  private int[] resourceReward;
  private Item[] itemReward;
  
  // Tracking Variables
  private Point origin;
  private Point destination;
  private boolean[] objectives;
  private boolean isActive;
  private boolean isCompleted;
  private boolean isUnlocked;
  
  // Constructors
  public Quest(String type, String description) {
    this.type = type;
    this.description = description;
    // OTHER QUEST INITIALIZATION DETAILS
  }
  public Quest(String type, String description, Point origin, Point destination) {
    this.type = type;
    this.description = description;
    this.origin = origin;
    this.destination = destination;
    // OTHER QUEST INITIALIZATION DETAILS
  }

  // Getters
  public String getType() {
    return type;
  }
  public String getDescription() {
    return description;
  }
  public int[] getResourceReward() {
    return resourceReward;
  }
  public Item[] getItemReward() {
    return itemReward;
  }
  public Point getOrigin() {
    return origin;
  }
  public Point getDestination() {
    return destination;
  }
  public boolean[] getObjectives() {
    return objectives;
  }
  
  // Quest Flags
  public boolean isActive() {
    return isActive;
  }
  public boolean isCompleted() {
    return isCompleted;
  }
  public boolean isUnlocked() {
    return isUnlocked;
  }
 
  // Setters
  public void setType(String type) {
    this.type = type;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setResourceReward(int[] resourceReward) {
    this.resourceReward = resourceReward;
  }
  public void setItemReward(Item[] itemReward) {
    this.itemReward = itemReward;
  }
  public void setOrigin(Point origin) {
    this.origin = origin;
  }
  public void setDestination(Point destination) {
    this.destination = destination;
  }
  public void setObjectives(boolean[] objectives) {
    this.objectives = objectives;
  }
  
  // Toggles
  public void activateQuest() {
    this.isActive = true;
  }
  public void completeQuest() {
    this.isCompleted = true;
  }
  public void unlockQuest() {
    this.isUnlocked = true;
  }
}