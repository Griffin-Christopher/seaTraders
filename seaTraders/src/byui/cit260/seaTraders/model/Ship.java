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
public class Ship implements Serializable {
  
  // Variables
  private String name;
  private String type;
  private String description;
  private double agility;
  private double armor;
  private double attack;
  private int cannons;
  private double speed;
  private double health;
  private int cargohold;
  private double value;
  
  private Item[] fittings;
  
  // Constructor
  public Ship() {
  }
  
  public Ship(String name, String type, String description, double agility,
          double armor, double attack, int cannons, double speed, double health, 
          int cargohold, double value) {
    setName(name);
    setType(type);
    setDescription(description);
    setAgility(agility);
    setArmor(armor);
    setAttack(attack);
    setCannons(cannons);
    setSpeed(speed);
    setHealth(health);
    setCargohold(cargohold);
    setValue(value);
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
  public double getValue() {
    return value;
  }
  public Item[] getFittings() {
    return fittings;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setAgility(double agility) {
    this.agility = agility;
  }
  public void setArmor(double armor) {
    this.armor = armor;
  }
  public void setAttack(double attack) {
    this.attack = attack;
  }
  public void setCannons(int cannons) {
    this.cannons = cannons;
  }
  public void setSpeed(double speed) {
    this.speed = speed;
  }
  public void setHealth(double health) {
    this.health = health;
  }
  public void setCargohold(int cargohold) {
    this.cargohold = cargohold;
  }
  public void setValue(double value) {
    this.value = value;
  }
  public void setFittings(Item[] fittings) {
    this.fittings = fittings;
  } 
}
