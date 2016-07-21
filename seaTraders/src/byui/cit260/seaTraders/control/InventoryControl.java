/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.Item;
import byui.cit260.seaTraders.model.ItemCatalog;

/**
 *
 * @author Christopher Griffin
 */
public class InventoryControl {
  
  public Item[] sortInventory() {
    // Populate Test Inventory
    Item[] inventory = new Item[14];
    inventory[0] = ItemCatalog.SAILS_SMALL.spawnItem();
    inventory[1] = ItemCatalog.HULL_LIGHT.spawnItem();
    inventory[2] = ItemCatalog.CANNONS_SMALL.spawnItem();
    inventory[3] = ItemCatalog.TMAP_ONE.spawnItem();
    inventory[4] = ItemCatalog.SAILS_MEDIUM.spawnItem();
    inventory[5] = ItemCatalog.HULL_MEDIUM.spawnItem();
    inventory[6] = ItemCatalog.CANNONS_MEDIUM.spawnItem();
    inventory[7] = ItemCatalog.TMAP_TWO.spawnItem();
    inventory[8] = ItemCatalog.SAILS_LARGE.spawnItem();
    inventory[9] = ItemCatalog.HULL_HEAVY.spawnItem();
    inventory[10] = ItemCatalog.CANNONS_LARGE.spawnItem();
    inventory[11] = ItemCatalog.TMAP_THREE.spawnItem();
    inventory[12] = ItemCatalog.HULL_NAVY.spawnItem();
    inventory[13] = ItemCatalog.TMAP_FOUR.spawnItem();

    // Group Cannons
    for (int i = 0; i < 3; i++) {
      if ("CANNONS".equals(inventory[i].getType())) {
        continue;
      }
      for (int j = i + 1; j < inventory.length; j++) {
        if ("CANNONS".equals(inventory[j].getType())) {
          Item placeholder = inventory[i];
          inventory[i] = inventory[j];
          inventory[j] = placeholder;
        }
      }
    }
  
    // Group Sails
    for (int i = 3; i < 6; i++) {
      if ("SAILS".equals(inventory[i].getType())) {
        continue;
      }
      for (int j = i + 1; j < inventory.length; j++) {
        if ("SAILS".equals(inventory[j].getType())) {
          Item placeholder = inventory[i];
          inventory[i] = inventory[j];
          inventory[j] = placeholder;
        }
      }
    }
    
    // Group Hulls
    for (int i = 6; i < 10; i++) {
      if ("HULL".equals(inventory[i].getType())) {
        continue;
      }
      for (int j = i + 1; j < inventory.length; j++) {
        if ("HULL".equals(inventory[j].getType())) {
          Item placeholder = inventory[i];
          inventory[i] = inventory[j];
          inventory[j] = placeholder;
        }
      }
    }
    
    // Group Treasure Maps
    for (int i = 10; i < inventory.length; i++) {
      if ("TMAP".equals(inventory[i].getType())) {
        continue;
      }
      for (int j = i + 1; j < inventory.length; j++) {
        if ("TMAP".equals(inventory[j].getType())) {
          Item placeholder = inventory[i];
          inventory[i] = inventory[j];
          inventory[j] = placeholder;
        }
      }
    } 
  return inventory;
  }
}