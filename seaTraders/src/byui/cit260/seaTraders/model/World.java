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
  
  // Objects
  private static String[] transitions = {""};
  private static Location[][] worldMap;
  
  // Variables
  private static int rowCount;
  private static int columnCount;
  
  // Constructors
  public World() {
  }
  
  public World(int rows, int columns) {
    // Validate world boundaries
    if (rows < 1 || columns < 1) {
      System.out.println("The number of rows and columns must be > zero");
      return;
    }
    
    // Create game world grid
    setRowCount(rows);
    setColumnCount(columns);
    World.worldMap = new Location[getRowCount()][getColumnCount()];
    
    /*
    **** COME BACK AND MANUALLY ASSIGN LOCATIONS TO WORLD GRID
    */
    
    // Create world locations
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < columns; c++) {
        Location location = new Location();
        location.setRow(r);
        location.setColumn(c);
        worldMap[r][c] = location;
      }
    }
  }

  // Getters
  public static String getTransition(int index) {
    return transitions[index];
  }
  public static Location[][] getWorldMap() {
    return worldMap;
  }
  public static Location getLocation(int row, int column) {
    return worldMap[row][column];
  }
  public static int getRowCount() {
    return rowCount;
  }
  public static int getColumnCount() {
    return columnCount;
  }
  
  // Setters
  public static void setWorldMap(Location[][] worldMap) {
    World.worldMap = worldMap;
  }
  public static void setLocation(int row, int column, Location location) {
    World.worldMap[row][column] = location;
  }
  public static void setRowCount(int rowCount) {
    World.rowCount = rowCount;
  }
  public static void setColumnCount(int columnCount) {
    World.columnCount = columnCount;
  }
}
