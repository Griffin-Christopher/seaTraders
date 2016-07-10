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
public class Location implements Serializable {
  
  // Objects
  private Stage stage;
  
  // Variables
  private int row;
  private int column;
  private boolean visited;
  private boolean unlocked;
  
  
  // Constructor
  public Location() {
    this.visited = false;
    this.unlocked = false;
  }

  // Getters
  public Stage getStage() {
    return stage;
  }
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
  public void setStage(Stage stage) {
    this.stage = stage;
  }
  public void setRow(int row) {
    this.row = row;
  }
  public void setColumn(int column) {
    this.column = column;
  }
  public void setVisited() {
    this.visited = true;
  }
  public void setUnlocked() {
    this.unlocked = true;
  }
}