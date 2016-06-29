/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import byui.cit260.seaTraders.model.location.Location;
import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class World implements Serializable {
  
  // Variables
  private int rowCount;
  private int columnCount;
  private String[] transition;
  private Location[] location;
  
  // Constructor
  public World(int rows, int columns) {
    setRowCount(rows);
    setColumnCount(columns);
  }

  // Getters
  public int getRowCount() {
    return rowCount;
  }
  public int getColumnCount() {
    return columnCount;
  }
  public String[] getTransition() {
    return transition;
  }
  public Location[] getLocation() {
    return location;
  }
  
  // Setters
  public void setRowCount(int rowCount) {
    this.rowCount = rowCount;
  }
  public void setColumnCount(int columnCount) {
    this.columnCount = columnCount;
  }
  public void setTransition(String[] transition) {
    this.transition = transition;
  }
  public void setLocation(Location[] location) {
    this.location = location;
  }
}
