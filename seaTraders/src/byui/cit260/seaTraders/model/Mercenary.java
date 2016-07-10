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
public class Mercenary implements Serializable {
  
  // Variables
  private String name;
  private String type;
  private String description;
  private double agility;
  private double armor;
  private double attack;
  private double speed;
  private double health;
  private double value;
  
  // Constructor
  public Mercenary(String name, String type, String description, double agility,
          double armor, double attack, double speed, double health, double value) {
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
  public double getValue() {
    return value;
  }
}