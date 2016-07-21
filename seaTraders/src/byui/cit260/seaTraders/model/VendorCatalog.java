/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Christopher
 */
public enum VendorCatalog implements Serializable {

  /***********
  * RESOURCES
  **********************************************************/
  AMMO_VENDOR(2),
  COTTON_VENDOR(5),
  FOOD_VENDOR(1),
  IRON_VENDOR(15),
  LUMBER_VENDOR(10),
  RESOURCE_VENDOR(3, 7, 2, 20, 13),
  /**********
  * FITTINGS
  **********************************************************/
  T1_FITTING_VENDOR(ItemCatalog.SAILS_SMALL.spawnItem(), 
          ItemCatalog.HULL_LIGHT.spawnItem(), 
          ItemCatalog.CANNONS_SMALL.spawnItem()),
  T2_FITTING_VENDOR(ItemCatalog.SAILS_SMALL.spawnItem(), 
          ItemCatalog.HULL_LIGHT.spawnItem(), 
          ItemCatalog.CANNONS_SMALL.spawnItem(),
          ItemCatalog.SAILS_MEDIUM.spawnItem(), 
          ItemCatalog.HULL_MEDIUM.spawnItem(), 
          ItemCatalog.CANNONS_MEDIUM.spawnItem()),
  T3_FITTING_VENDOR(ItemCatalog.SAILS_SMALL.spawnItem(), 
          ItemCatalog.HULL_LIGHT.spawnItem(), 
          ItemCatalog.CANNONS_SMALL.spawnItem(),
          ItemCatalog.SAILS_MEDIUM.spawnItem(), 
          ItemCatalog.HULL_MEDIUM.spawnItem(), 
          ItemCatalog.CANNONS_MEDIUM.spawnItem(),
          ItemCatalog.SAILS_LARGE.spawnItem(), 
          ItemCatalog.HULL_HEAVY.spawnItem(), 
          ItemCatalog.CANNONS_LARGE.spawnItem()),
  /*************
  * MERCENARIES
  **********************************************************/
  T1_MERC_VENDOR(MercenaryCatalog.ATK_ONE.spawnMercenary(), 
          MercenaryCatalog.DEF_ONE.spawnMercenary(), 
          MercenaryCatalog.TAC_ONE.spawnMercenary(), 
          MercenaryCatalog.NAV_ONE.spawnMercenary(), 
          MercenaryCatalog.TRADE_ONE.spawnMercenary()),
  T2_MERC_VENDOR(MercenaryCatalog.ATK_ONE.spawnMercenary(), 
          MercenaryCatalog.DEF_ONE.spawnMercenary(), 
          MercenaryCatalog.TAC_ONE.spawnMercenary(), 
          MercenaryCatalog.NAV_ONE.spawnMercenary(), 
          MercenaryCatalog.TRADE_ONE.spawnMercenary(),
          MercenaryCatalog.ATK_TWO.spawnMercenary(), 
          MercenaryCatalog.DEF_TWO.spawnMercenary(), 
          MercenaryCatalog.TAC_TWO.spawnMercenary(), 
          MercenaryCatalog.NAV_TWO.spawnMercenary(), 
          MercenaryCatalog.TRADE_TWO.spawnMercenary()),
  T3_MERC_VENDOR(MercenaryCatalog.ATK_ONE.spawnMercenary(), 
          MercenaryCatalog.DEF_ONE.spawnMercenary(), 
          MercenaryCatalog.TAC_ONE.spawnMercenary(), 
          MercenaryCatalog.NAV_ONE.spawnMercenary(), 
          MercenaryCatalog.TRADE_ONE.spawnMercenary(),
          MercenaryCatalog.ATK_TWO.spawnMercenary(), 
          MercenaryCatalog.DEF_TWO.spawnMercenary(), 
          MercenaryCatalog.TAC_TWO.spawnMercenary(), 
          MercenaryCatalog.NAV_TWO.spawnMercenary(), 
          MercenaryCatalog.TRADE_TWO.spawnMercenary(),
          MercenaryCatalog.ATK_THREE.spawnMercenary(), 
          MercenaryCatalog.DEF_THREE.spawnMercenary(), 
          MercenaryCatalog.TAC_THREE.spawnMercenary(), 
          MercenaryCatalog.NAV_THREE.spawnMercenary(), 
          MercenaryCatalog.TRADE_THREE.spawnMercenary()),
  /*******
  * SHIPS
  **********************************************************/
  T1_SHIP_VENDOR(ShipCatalog.COMBAT_ONE.spawnShip(), 
          ShipCatalog.TRADE_ONE.spawnShip(), 
          ShipCatalog.HAULER_ONE.spawnShip()),
  T2_SHIP_VENDOR(ShipCatalog.COMBAT_ONE.spawnShip(), 
          ShipCatalog.TRADE_ONE.spawnShip(), 
          ShipCatalog.HAULER_ONE.spawnShip(),
          ShipCatalog.COMBAT_TWO.spawnShip(), 
          ShipCatalog.TRADE_TWO.spawnShip(), 
          ShipCatalog.HAULER_TWO.spawnShip()),
  T3_SHIP_VENDOR(ShipCatalog.COMBAT_ONE.spawnShip(), 
          ShipCatalog.TRADE_ONE.spawnShip(), 
          ShipCatalog.HAULER_ONE.spawnShip(),
          ShipCatalog.COMBAT_TWO.spawnShip(), 
          ShipCatalog.TRADE_TWO.spawnShip(), 
          ShipCatalog.HAULER_TWO.spawnShip(),
          ShipCatalog.COMBAT_THREE.spawnShip(), 
          ShipCatalog.TRADE_THREE.spawnShip(), 
          ShipCatalog.HAULER_THREE.spawnShip()),
  /*************
  * NAVY ARMORY
  **********************************************************/
  NAVY_FITTING_VENDOR(ItemCatalog.SAILS_NAVY.spawnItem(), 
          ItemCatalog.HULL_NAVY.spawnItem(), 
          ItemCatalog.CANNONS_NAVY.spawnItem()),
  NAVY_SHIP_VENDOR(ShipCatalog.COMBAT_NAVY.spawnShip(), 
          ShipCatalog.TRADE_NAVY.spawnShip(), 
          ShipCatalog.HAULER_NAVY.spawnShip());
  /********
  * RANDOM
  **********************************************************/
  // Merchant
  // Navy
  // Smuggler
  
  // Variables
  private int resourcePrice;
  private int[] resourcePrices;
  private ArrayList<Object> inventory = new ArrayList<>();
  private ArrayList<Ship> ships = new ArrayList<>();
  
  // Resource Constructors
  VendorCatalog(int price) {
    this.resourcePrice = price;
  }
  VendorCatalog(int ammo, int cotton, int food, int iron, int lumber) {
    this.resourcePrices = new int[]{ammo, cotton, food, iron, lumber};
  }
  
  // Item Constructors
  VendorCatalog(Item sails, Item hull, Item cannons) {
    this.inventory.addAll(Arrays.asList(sails, hull, cannons));
  }
  VendorCatalog(Item sSails, Item sHull, Item sCannons, 
          Item mSails, Item mHull, Item mCannons) {
    this.inventory.addAll(Arrays.asList(
            sSails, sHull, sCannons, 
            mSails, mHull, mCannons));
  }
  VendorCatalog(Item sSails, Item sHull, Item sCannons, 
          Item mSails, Item mHull, Item mCannons,
          Item lSails, Item lHull, Item lCannons) {
    this.inventory.addAll(Arrays.asList(
            sSails, sHull, sCannons, 
            mSails, mHull, mCannons,
            lSails, lHull, lCannons));
  }
  
  // Mercenary Constructors
  VendorCatalog(Mercenary atk, Mercenary def, Mercenary tac, Mercenary nav, 
          Mercenary trade) {
    this.inventory.addAll(Arrays.asList(atk, def, tac, nav, trade));
  }
  VendorCatalog(Mercenary atkOne, Mercenary defOne, Mercenary tacOne, 
          Mercenary navOne, Mercenary tradeOne, 
          Mercenary atkTwo, Mercenary defTwo, Mercenary tacTwo, 
          Mercenary navTwo, Mercenary tradeTwo) {
    this.inventory.addAll(Arrays.asList(
            atkOne, defOne, tacOne, navOne, tradeOne, 
            atkTwo, defTwo, tacTwo, navTwo, tradeTwo));
  }
  VendorCatalog(Mercenary atkOne, Mercenary defOne, Mercenary tacOne, 
          Mercenary navOne, Mercenary tradeOne, 
          Mercenary atkTwo, Mercenary defTwo, Mercenary tacTwo, 
          Mercenary navTwo, Mercenary tradeTwo, 
          Mercenary atkThree, Mercenary defThree, Mercenary tacThree, 
          Mercenary navThree, Mercenary tradeThree) {
    this.inventory.addAll(Arrays.asList(
            atkOne, defOne, tacOne, navOne, tradeOne, 
            atkTwo, defTwo, tacTwo, navTwo, tradeTwo, 
            atkThree, defThree, tacThree, navThree, tradeThree));
  }
  
  // Ship Constructors
  VendorCatalog(Ship combat, Ship trade, Ship hauler) {
    this.ships.addAll(Arrays.asList(combat, trade, hauler));
  }
  VendorCatalog(Ship combatOne, Ship tradeOne, Ship haulerOne,
          Ship combatTwo, Ship tradeTwo, Ship haulerTwo) {
    this.ships.addAll(Arrays.asList(combatOne, tradeOne, haulerOne,
            combatTwo, tradeTwo, haulerTwo));
  }
  VendorCatalog(Ship combatOne, Ship tradeOne, Ship haulerOne,
          Ship combatTwo, Ship tradeTwo, Ship haulerTwo,
          Ship combatThree, Ship tradeThree, Ship haulerThree) {
    this.ships.addAll(Arrays.asList(combatOne, tradeOne, haulerOne,
            combatTwo, tradeTwo, haulerTwo,
            combatThree, tradeThree, haulerThree));
  }
  
  // Getters
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
}