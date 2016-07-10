/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.control;

import byui.cit260.seaTraders.model.Item;
import byui.cit260.seaTraders.model.ItemCatalog;
import byui.cit260.seaTraders.model.Ship;

/**
 *
 * @author Christopher Griffin
 */
class ShipControl {
  
  public enum Fitting {
    SAILS, HULL, CANNONS;
  }

  public static Item[] createPlayerFittings() {
    Item[] fittings = new Item[3];
    fittings[Fitting.SAILS.ordinal()] = ItemCatalog.SAILS_SMALL.spawnItem();
    fittings[Fitting.HULL.ordinal()] = ItemCatalog.HULL_LIGHT.spawnItem();
    fittings[Fitting.CANNONS.ordinal()] = ItemCatalog.CANNONS_SMALL.spawnItem();
    return fittings;
  }

  public static Item[] createPlayerCargo() {
    return new Item[Ship.getCargohold()];
  }
}