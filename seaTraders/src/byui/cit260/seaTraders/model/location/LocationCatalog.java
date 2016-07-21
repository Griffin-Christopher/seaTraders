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
public enum LocationCatalog implements Serializable {
  
  /******
  * PLOT
  **********************************************************/
  COMBAT_TUTORIAL(StageCatalog.PLOT_ONE.spawnStage(), 0, 0, "P1", 
          "PLOT", false, true),
  STARTER_TOWN(StageCatalog.PLOT_TWO.spawnStage(),    0, 1, "P2", 
          "PLOT", false, true),
  PIRATE_AMBUSH(StageCatalog.PLOT_TWO.spawnStage(),   0, 2, "P3", 
          "PLOT", false, false),
  NAVAL_ACADEMY(StageCatalog.PLOT_THREE.spawnStage(), 0, 3, "P4", 
          "PLOT", false, true),
  BLACKSCAR_COVE(StageCatalog.PLOT_FIVE.spawnStage(), 0, 4, "P5", 
          "PLOT", false, false),
  /********
  * COMBAT
  **********************************************************/
  HUNT_ENCOUNTER(StageCatalog.COMBAT_HUNT.spawnStage(),     1, 0, "HE", 
          "COMBAT", false, true),
  NAVY_TEST(StageCatalog.COMBAT_NAVY.spawnStage(),          1, 1, "NT", 
          "COMBAT", false, false),  
  PIRATE_ENCOUNTER(StageCatalog.COMBAT_PIRATE.spawnStage(), 1, 2, "PE", 
          "COMBAT", false, true),
  RANDOM_ENCOUNTER(StageCatalog.COMBAT_RANDOM.spawnStage(), 1, 3, "RE", 
          "COMBAT", false, true),
  SHIPWRECKED(StageCatalog.COMBAT_LOSS.spawnStage(),        1, 4, "SW", 
          "COMBAT", false, false), 
  /******
  * TOWN
  **********************************************************/
  MERCENARY_BAY(StageCatalog.MERC_TOWN.spawnStage(),    2, 0, "MB", 
          "TOWN", false, true),   
  MB_SHORELEAVE(StageCatalog.MERC_SHORE.spawnStage(),   2, 1, "MS", 
          "TOWN", false, false),
  NAVY_WHARF(StageCatalog.NAVY_TOWN.spawnStage(),       2, 2, "NW", 
          "TOWN", false, true),
  NW_SHORELEAVE(StageCatalog.NAVY_SHORE.spawnStage(),   2, 3, "NS", 
          "TOWN", false, false),
  SHIPYARD(StageCatalog.SHIP_TOWN.spawnStage(),         2, 4, "SY", 
          "TOWN", false, true),
  SY_SHORELEAVE(StageCatalog.SHIP_SHORE.spawnStage(),   2, 5, "SS", 
          "TOWN", false, false),
  TRADING_COMPANY(StageCatalog.TRADE_TOWN.spawnStage(), 2, 6, "TC", 
          "TOWN", false, true),
  TC_SHORELEAVE(StageCatalog.TRADE_SHORE.spawnStage(),  2, 7, "TS", 
          "TOWN", false, false), 
  /*******
  * QUEST
  **********************************************************/
  // SUPPLY QUEST TOWNS
  AMMO_TOWN(StageCatalog.SUPPLY_AMMO.spawnStage(),     3, 0, "S3", 
          "QUEST", false, true),
  COTTON_TOWN(StageCatalog.SUPPLY_COTTON.spawnStage(), 3, 1, "S4", 
          "QUEST", false, true),
  FOOD_TOWN(StageCatalog.SUPPLY_FOOD.spawnStage(),     3, 2, "S1", 
          "QUEST", false, true),
  IRON_TOWN(StageCatalog.SUPPLY_IRON.spawnStage(),     3, 3, "S5", 
          "QUEST", false, true),
  LUMBER_TOWN(StageCatalog.SUPPLY_LUMBER.spawnStage(), 3, 4, "S2", 
          "QUEST", false, true),
  // TRADE QUEST TOWNS
  TTOWN_ONE(StageCatalog.TRADE_ONE.spawnStage(),       3, 5, "T1", 
          "QUEST", false, true),
  TTOWN_TWO(StageCatalog.TRADE_TWO.spawnStage(),       3, 6, "T2", 
          "QUEST", false, true),
  TTOWN_THREE(StageCatalog.TRADE_THREE.spawnStage(),   3, 7, "T3", 
          "QUEST", false, true),
  TTOWN_FOUR(StageCatalog.TRADE_FOUR.spawnStage(),     3, 8, "T4", 
          "QUEST", false, true),
  TTOWN_FIVE(StageCatalog.TRADE_FIVE.spawnStage(),     3, 9, "T5", 
          "QUEST", false, true), 
  // OTHER QUESTS
  BURIED_TREASURE(StageCatalog.TREASURE_QUEST.spawnStage(), 4, 0, "HQ", 
          "QUEST", false, false);
  
  // Objects
  private Stage stage;
  
  // Variables
  private int row;
  private int column;
  private String symbol;
  private String type;
  
  private boolean visited;
  private boolean unlocked;
  
  // Constructor
  LocationCatalog(Stage stage, int row, int column, String symbol, String type, 
          boolean visited, boolean unlocked) {
    this.stage = stage;
    this.row = row;
    this.column = column;
    this.symbol = symbol;
    this.type = type;
    this.visited = visited;
    this.unlocked = unlocked;
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
  public String getSymbol() {
    return symbol;
  }
  public String getType() {
    return type;
  }
  public boolean isVisited() {
    return visited;
  }
  public boolean isUnlocked() {
    return unlocked;
  } 
  
  public Location spawnLocation() {
    Location location = new Location(getStage(), getRow(), getColumn(), 
            getSymbol(), getType(), isVisited(), isUnlocked());
    return location;
  }
}
