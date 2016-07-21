/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model.location;

import byui.cit260.seaTraders.model.NonValue;
import byui.cit260.seaTraders.model.Ship;
import byui.cit260.seaTraders.model.VendorCatalog;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Christopher Griffin
 */



public enum StageCatalog implements Serializable {
  
  // CONVERT TO CLASS INHERITANCE?
  /******
  * PLOT
  **********************************************************/
  PLOT_ONE("Combat Tutorial", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.FIRST_BATTLE.spawnEncounter()),
  PLOT_TWO("Starter Town", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  PLOT_THREE("Pirate Ambush", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.PIRATE_AMBUSH.spawnEncounter()),
  PLOT_FOUR("Naval Academy", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  PLOT_FIVE("Blackscar Cove", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.BLACKSCAR_AMBUSH.spawnEncounter()),
  /********
  * COMBAT
  **********************************************************/
  COMBAT_HUNT("Hunt Encounter", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.HUNT_PIRATE.spawnEncounter()),
  COMBAT_NAVY("Naval Academy Test", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  COMBAT_PIRATE("Random Pirate Encounter", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.PIRATE_BATTLE.spawnEncounter()),
  COMBAT_RANDOM("Random Non-Pirate Encounter", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          new Encounter(/*RANDOM*/)),
  COMBAT_LOSS("DEFEAT!", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.SHIPWRECKED.spawnEncounter()),
  /******
  * TOWN
  **********************************************************/
  MERC_TOWN("Mercenary Bay", "DESCRIPTION", "TYPE", 
          VendorCatalog.AMMO_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(),  
          VendorCatalog.T1_MERC_VENDOR.getInventory(), 
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  MERC_SHORE("Mercenary Bay Town", "DESCRIPTION", "TYPE", 
          VendorCatalog.FOOD_VENDOR.getPrice(),
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  NAVY_TOWN("Navy Wharf", "DESCRIPTION", "TYPE", 
          VendorCatalog.AMMO_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(), 
          VendorCatalog.NAVY_FITTING_VENDOR.getInventory(),
          VendorCatalog.NAVY_SHIP_VENDOR.getShips(),
          EncounterCatalog.EMPTY.spawnEncounter()),
  NAVY_SHORE("Navy Wharf Town", "DESCRIPTION", "TYPE", 
          VendorCatalog.FOOD_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(),  
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  SHIP_TOWN("Shipyard", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(), 
          VendorCatalog.T2_FITTING_VENDOR.getInventory(), 
          VendorCatalog.T3_SHIP_VENDOR.getShips(),
          EncounterCatalog.EMPTY.spawnEncounter()),
  SHIP_SHORE("Shipyard Town", "DESCRIPTION", "TYPE", 
          VendorCatalog.FOOD_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  TRADE_TOWN("Trading Company", "DESCRIPTION", "TYPE", 
          0, VendorCatalog.RESOURCE_VENDOR.getPrices(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  TRADE_SHORE("Trading Company Town", "DESCRIPTION", "TYPE", 
          VendorCatalog.FOOD_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  /*******
  * QUEST
  **********************************************************/
  // SUPPLY QUESTS
  SUPPLY_AMMO("Ammunition Forging", "DESCRIPTION", "TYPE",
          VendorCatalog.AMMO_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  SUPPLY_COTTON("Cotton Harvesting", "DESCRIPTION", "TYPE",
          VendorCatalog.COTTON_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  SUPPLY_FOOD("Food Harvesting", "DESCRIPTION", "TYPE",
          VendorCatalog.FOOD_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  SUPPLY_IRON("Iron Smelting", "DESCRIPTION", "TYPE",
          VendorCatalog.IRON_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  SUPPLY_LUMBER("Lumber Harvesting", "DESCRIPTION", "TYPE",
          VendorCatalog.LUMBER_VENDOR.getPrice(), 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  // TRADE QUESTS
  TRADE_ONE("TRADE TOWN NAME", "DESCRIPTION", "TYPE", 
          0, VendorCatalog.RESOURCE_VENDOR.getPrices(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  TRADE_TWO("TRADE TOWN NAME", "DESCRIPTION", "TYPE", 
          0, VendorCatalog.RESOURCE_VENDOR.getPrices(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  TRADE_THREE("TRADE TOWN NAME", "DESCRIPTION", "TYPE", 
          0, VendorCatalog.RESOURCE_VENDOR.getPrices(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  TRADE_FOUR("TRADE TOWN NAME", "DESCRIPTION", "TYPE", 
          0, VendorCatalog.RESOURCE_VENDOR.getPrices(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  TRADE_FIVE("TRADE TOWN NAME", "DESCRIPTION", "TYPE", 
          0, VendorCatalog.RESOURCE_VENDOR.getPrices(), 
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter()),
  // OTHER QUESTS
  TREASURE_QUEST("Buried Treasure", "DESCRIPTION", "TYPE", 0, 
          NonValue.NO_RESOURCES.getResources(),
          NonValue.NO_INVENTORY.getInventory(),
          NonValue.NO_SHIPS.getShips(), 
          EncounterCatalog.EMPTY.spawnEncounter());
  
  // Variables
  private final String name;
  private final String description;
  private final String type;
  private final int resourcePrice;
  private final int[] resourcePrices;
  private ArrayList<Object> inventory = new ArrayList<>();
  private ArrayList<Ship> ships = new ArrayList<>();
  private Encounter encounter;
  
  // Constructor
  StageCatalog(String name, String description, String type, int price, 
          int[] prices, ArrayList<Object> inventory, ArrayList<Ship> ships,
          Encounter encounter) {
    this.name = name;
    this.description = description;
    this.type = type;
    this.resourcePrice = price;
    this.resourcePrices = prices;
    this.inventory = inventory;
    this.ships = ships;
    this.encounter = encounter;
  }
  
  // Getters
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public String getType() {
    return type;
  }
  public int getPrice() {
    return resourcePrice;
  }
  public int[] getPrices() {
    return resourcePrices;
  }
  public ArrayList<Object> getInventory() {
    return inventory;
  }
  public ArrayList<Ship> getShips() {
    return ships;
  }
  public Encounter getEncounter() {
    return encounter;
  }
  
  public Stage spawnStage() {
    Stage stage = new Stage(getName(), getDescription(), getType(), getPrice(), 
            getPrices(), getInventory(), getShips(), getEncounter());
    return stage;
  }
}