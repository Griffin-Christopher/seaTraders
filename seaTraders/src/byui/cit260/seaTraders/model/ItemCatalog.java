/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;

/**
 *
 * @author Christopher
 */
public enum ItemCatalog implements Serializable {
  
  /*******
  * SAILS
  **********************************************************/
  SAILS_SMALL("Small Sails", "SAILS", "DESCRIPTION",
          0.00, 0.00, 0.00, 1.00, 100.0, 1000),
  SAILS_MEDIUM("Medium Sails", "SAILS", "DESCRIPTION",
          0.00, 0.00, 0.00, 2.00, 200.0, 2000),
  SAILS_LARGE("Large Sails", "SAILS", "DESCRIPTION",
          0.00, 0.00, 0.00, 3.00, 300.0, 5000),
  
  /*******
  * HULLS
  **********************************************************/
  HULL_LIGHT("Light Hull", "HULL", "DESCRIPTION",
           0.00, 5.00,  0.00,  1.00, 100.0, 1000),
  HULL_MEDIUM("Medium Hull", "HULL", "DESCRIPTION",
          -0.25, 10.00, 0.00,  0.50, 250.0, 2000),
  HULL_HEAVY("Heavy Hull", "HULL", "DESCRIPTION",
          -0.50, 15.00, 0.00,  0.00, 500.0, 4000),
  HULL_FORTIFIED("Fortified Hull", "HULL", "DESCRIPTION",
          -0.75, 20.00, 0.00, -0.50, 750.0, 7000),
  
  /*********
  * CANNONS
  **********************************************************/
  CANNONS_SMALL("Small Cannons", "CANNONS", "DESCRIPTION",
          0.50, 0.00, 10.0, 0.00, 0.00, 1000),
  CANNONS_MEDIUM("Medium Cannons", "CANNONS", "DESCRIPTION",
          0.25, 0.00, 10.0, 0.00, 0.00, 2000),
  CANNONS_LARGE("Large Cannons", "CANNONS", "DESCRIPTION",
          0.00, 0.00, 10.0, 0.00, 0.00, 5000),
  
  /*******
  * TMAPS
  **********************************************************/
  TMAP_ONE("First Map Piece", "TMAP", "DESCRIPTION",
          0.00, 0.00, 0.00, 0.00, 0.00, 0),
  TMAP_TWO("Second Map Piece", "TMAP", "DESCRIPTION",
          0.00, 0.00, 0.00, 0.00, 0.00, 0),
  TMAP_THREE("Third Map Piece", "TMAP", "DESCRIPTION",
          0.00, 0.00, 0.00, 0.00, 0.00, 0),
  TMAP_FOUR("Fourth Map Piece", "TMAP", "DESCRIPTION",
          0.00, 0.00, 0.00, 0.00, 0.00, 0);
  
  // Variables
  private final String name;
  private final String type;
  private final String description;
  private final double agility;
  private final double armor;
  private final double attack;
  private final double speed;
  private final double health;
  private final int value;
  
  // Constructor
  ItemCatalog(String name, String type, String description, double agility, 
          double armor, double attack, double speed, double health, int value) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.agility = agility;
    this.armor = armor;
    this.attack = attack;
    this.speed = speed;
    this.health = health;
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
  public double getSpeed() {
    return speed;
  }
  public double getHealth() {
    return health;
  }
  public int getValue() {
    return value;
  }
  
  public Item spawnItem() {
    Item item = new Item(getName(), getType(), getDescription(), getAgility(),
            getArmor(), getAttack(), getSpeed(), getHealth(), getValue());
    return item;
  }
}