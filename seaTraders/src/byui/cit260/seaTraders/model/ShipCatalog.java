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
public enum ShipCatalog implements Serializable {
  
  /******
  * PLOT
  **********************************************************/
  STARTER_SHIP("Trade Cog", "PLOT", "DESCRIPTION",
          1.00, 5.00, 20.0, 10, 1.00, 100.0, 20, 1000),
  TEMP_SHIP("Patchwork Vessel", "PLOT", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  
  /********
  * COMBAT
  **********************************************************/
  COMBAT_ONE("NAME", "COMBAT", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  COMBAT_TWO("NAME", "COMBAT", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  COMBAT_THREE("NAME", "COMBAT", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  
  /*******
  * TRADE
  **********************************************************/
  TRADE_ONE("NAME", "TRADE", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  TRADE_TWO("NAME", "TRADE", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  TRADE_THREE("NAME", "TRADE", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  
  /*********
  * HAULING
  **********************************************************/
  HAULER_ONE("NAME", "HAULER", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  HAULER_TWO("NAME", "HAULER", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  HAULER_THREE("NAME", "HAULER", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  
  /******
  * NAVY
  **********************************************************/
  NAVY_ONE("NAME", "NAVY", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  NAVY_TWO("NAME", "NAVY", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000),
  NAVY_THREE("NAME", "NAVY", "DESCRIPTION",
          0.00, 0.00, 0.00, 0, 1.00, 100.0, 0, 1000);
  
  // Variables
  private final String name;
  private final String type;
  private final String description;
  private final double agility;
  private final double armor;
  private final double attack;
  private final int cannons;
  private final double speed;
  private final double health;
  private final int cargohold;
  private final int value;
  
  // Constructor
  ShipCatalog(String name, String type, String description, double agility, 
          double armor, double attack, int cannons, double speed, 
          double health, int cargohold, int value) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.agility = agility;
    this.armor = armor;
    this.attack = attack;
    this.cannons = cannons;
    this.speed = speed;
    this.health = health;
    this.cargohold = cargohold;
    this.value = value;
  }
  
  // Getters
  public String getName() {
    return name;
  }
  public String getType() {
    return type;
  }
  public String getDescription() {
    return description;
  }
  public double getAgility() {
    return agility;
  }
  public double getArmor() {
    return armor;
  }
  public double getAttack() {
    return attack;
  }
  public int getCannons() {
    return cannons;
  }
  public double getSpeed() {
    return speed;
  }
  public double getHealth() {
    return health;
  }
  public int getCargohold() {
    return cargohold;
  }
  public int getValue() {
    return value;
  }
  
  public Ship spawnShip() {
    Ship ship = new Ship(getName(), getType(), getDescription(), getAgility(),
            getArmor(), getAttack(), getCannons(), getSpeed(), getHealth(), 
            getCargohold(), getValue());
    return ship;
  }
}
