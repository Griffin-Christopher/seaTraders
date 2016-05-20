/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class Location implements Serializable {
  
  // Variables
  private int row;
  private int column;
  private boolean visited;
  private boolean unlocked;
  
  // Constructor
  public Location() {
  }

  // Getters
  public int getRow() {
    return row;
  }
  public int getColumn() {
    return column;
  }
  public boolean isVisited() {
    return visited;
  }
  public boolean isUnlocked() {
    return unlocked;
  }
  
  // Setters
  public void setRow(int row) {
    this.row = row;
  }
  public void setColumn(int column) {
    this.column = column;
  }
  public void setVisited(boolean visited) {
    this.visited = visited;
  }
  public void setUnlocked(boolean unlocked) {
    this.unlocked = unlocked;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + this.row;
    hash = 83 * hash + this.column;
    hash = 83 * hash + (this.visited ? 1 : 0);
    hash = 83 * hash + (this.unlocked ? 1 : 0);
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
    final Location other = (Location) obj;
    if (this.row != other.row) {
      return false;
    }
    if (this.column != other.column) {
      return false;
    }
    if (this.visited != other.visited) {
      return false;
    }
    if (this.unlocked != other.unlocked) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", unlocked=" + unlocked + '}';
  }
}
