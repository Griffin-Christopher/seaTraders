/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import byui.cit260.seaTraders.model.location.Location;
import byui.cit260.seaTraders.model.location.LocationCatalog;
import byui.cit260.seaTraders.view.ErrorView;
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
      ErrorView.display(this.getClass().getName(),
              "The number of rows and columns must be greater than zero.");
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
    for (int r = 0; r < 10; r++) {
      for (int c = 0; c < 10; c++) {
        worldMap[r][c] = new Location(r, c);
      }
    }
    
    /** ASSIGN LOCATIONS ** 
    ***********************
    * PLOT
    **********************************************************/
    worldMap[0][0] = LocationCatalog.COMBAT_TUTORIAL.spawnLocation();
    worldMap[0][1] = LocationCatalog.STARTER_TOWN.spawnLocation();
    worldMap[0][2] = LocationCatalog.PIRATE_AMBUSH.spawnLocation();
    worldMap[0][3] = LocationCatalog.NAVAL_ACADEMY.spawnLocation();
    worldMap[0][4] = LocationCatalog.BLACKSCAR_COVE.spawnLocation();
    /********
    * COMBAT
    **********************************************************/
    worldMap[1][0] = LocationCatalog.HUNT_ENCOUNTER.spawnLocation();
    worldMap[1][1] = LocationCatalog.NAVY_TEST.spawnLocation();
    worldMap[1][2] = LocationCatalog.PIRATE_ENCOUNTER.spawnLocation();
    worldMap[1][3] = LocationCatalog.RANDOM_ENCOUNTER.spawnLocation();
    worldMap[1][4] = LocationCatalog.SHIPWRECKED.spawnLocation();
    /******
    * TOWN
    **********************************************************/
    worldMap[2][0] = LocationCatalog.MERCENARY_BAY.spawnLocation();
    worldMap[2][1] = LocationCatalog.MB_SHORELEAVE.spawnLocation();
    worldMap[2][2] = LocationCatalog.NAVY_WHARF.spawnLocation();
    worldMap[2][3] = LocationCatalog.NW_SHORELEAVE.spawnLocation();
    worldMap[2][4] = LocationCatalog.SHIPYARD.spawnLocation();
    worldMap[2][5] = LocationCatalog.SY_SHORELEAVE.spawnLocation();
    worldMap[2][6] = LocationCatalog.TRADING_COMPANY.spawnLocation();
    worldMap[2][7] = LocationCatalog.TC_SHORELEAVE.spawnLocation();
    /*******
    * QUEST
    **********************************************************/
    worldMap[3][0] = LocationCatalog.AMMO_TOWN.spawnLocation();
    worldMap[3][1] = LocationCatalog.COTTON_TOWN.spawnLocation();
    worldMap[3][2] = LocationCatalog.FOOD_TOWN.spawnLocation();
    worldMap[3][3] = LocationCatalog.IRON_TOWN.spawnLocation();
    worldMap[3][4] = LocationCatalog.LUMBER_TOWN.spawnLocation();
    worldMap[3][5] = LocationCatalog.TTOWN_ONE.spawnLocation();
    worldMap[3][6] = LocationCatalog.TTOWN_TWO.spawnLocation();
    worldMap[3][7] = LocationCatalog.TTOWN_THREE.spawnLocation();
    worldMap[3][8] = LocationCatalog.TTOWN_FOUR.spawnLocation();
    worldMap[3][9] = LocationCatalog.TTOWN_FIVE.spawnLocation();
    // OTHER
    worldMap[4][0] = LocationCatalog.BURIED_TREASURE.spawnLocation(); 
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