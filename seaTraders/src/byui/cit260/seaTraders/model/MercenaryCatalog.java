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
public enum MercenaryCatalog implements Serializable {  
  
  /********
  * ATTACK
  **********************************************************/
  ATK_ONE("NAME", "ATK", "DESCRIPTION",
          0.00, 0.00, 0.00, 1.00, 100.0, 1000),
  ATK_TWO("NAME", "ATK", "DESCRIPTION",
          0.00, 0.00, 0.00, 2.00, 200.0, 2000),
  ATK_THREE("NAME", "ATK", "DESCRIPTION",
          0.00, 0.00, 0.00, 3.00, 300.0, 5000),  
  /*********
  * DEFENSE
  **********************************************************/
  DEF_ONE("NAME", "DEF", "DESCRIPTION",
          0.00, 0.00, 0.00, 1.00, 100.0, 1000),
  DEF_TWO("NAME", "DEF", "DESCRIPTION",
          0.00, 0.00, 0.00, 2.00, 200.0, 2000),
  DEF_THREE("NAME", "DEF", "DESCRIPTION",
          0.00, 0.00, 0.00, 3.00, 300.0, 5000),  
  /*********
  * TACTICS
  **********************************************************/
  TAC_ONE("NAME", "TAC", "DESCRIPTION",
          0.00, 0.00, 0.00, 1.00, 100.0, 1000),
  TAC_TWO("NAME", "TAC", "DESCRIPTION",
          0.00, 0.00, 0.00, 2.00, 200.0, 2000),
  TAC_THREE("NAME", "TAC", "DESCRIPTION",
          0.00, 0.00, 0.00, 3.00, 300.0, 5000),  
  /************
  * NAVIGATION
  **********************************************************/
  NAV_ONE("NAME", "NAV", "DESCRIPTION",
          0.00, 0.00, 0.00, 1.00, 100.0, 1000),
  NAV_TWO("NAME", "NAV", "DESCRIPTION",
          0.00, 0.00, 0.00, 2.00, 200.0, 2000),
  NAV_THREE("NAME", "NAV", "DESCRIPTION",
          0.00, 0.00, 0.00, 3.00, 300.0, 5000),
  /*******
  * TRADE
  **********************************************************/
  TRADE_ONE("NAME", "TRADE", "DESCRIPTION",
          0.00, 0.00, 0.00, 1.00, 100.0, 1000),
  TRADE_TWO("NAME", "TRADE", "DESCRIPTION",
          0.00, 0.00, 0.00, 2.00, 200.0, 2000),
  TRADE_THREE("NAME", "TRADE", "DESCRIPTION",
          0.00, 0.00, 0.00, 3.00, 300.0, 5000); 
  
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
  MercenaryCatalog(String name, String type, String description, double agility, 
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
  
  public Mercenary spawnMercenary() {
    Mercenary mercenary = new Mercenary(getName(), getType(), getDescription(), 
            getAgility(), getArmor(), getAttack(), getSpeed(), getHealth(), 
            getValue());
    return mercenary;
  }
}