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
  
  // Objects
  private static Item[] fittings;
  private static Item[] cargo;
  
  // Variables
  private static String name;
  private static String type;
  private static String description;
  private static double agility;
  private static double armor;
  private static double attack;
  private static int cannons;
  private static double speed;
  private static double health;
  private static int cargohold;
  private static double value;
  
  
  
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
  public static Item[] getFittings() {
    return fittings;
  }
  public static Item getFitting(int index) {
    return fittings[index];
  }
  public static Item[] getCargo() {
    return cargo;
  }
  public static Item getCargoItem(int index) {
    return cargo[index];
  }
  public static String getName() {
    return name;
  }
  public static String getType() {
    return type;
  }
  public static String getDescription() {
    return description;
  }
  public static double getAgility() {
    return agility;
  }
  public static double getArmor() {
    return armor;
  }
  public static double getAttack() {
    return attack;
  }
  public static int getCannons() {
    return cannons;
  }
  public static double getSpeed() {
    return speed;
  }
  public static double getHealth() {
    return health;
  }
  public static int getCargohold() {
    return cargohold;
  }
  public static double getValue() {
    return value;
  }

  // Setters
  public static void setFittings(Item[] fittings) {
    Ship.fittings = fittings;
  } 
  public static void setFitting(int index, Item fitting) {
    Ship.fittings[index] = fitting;
  }
  public static void setCargo(Item[] cargo) {
    Ship.cargo = cargo;
  }
  public static void setCargoItem(int index, Item item) {
    Ship.cargo[index] = item;
  }
  public static void setName(String name) {
    Ship.name = name;
  }
  public static void setType(String type) {
    Ship.type = type;
  }
  public static void setDescription(String description) {
    Ship.description = description;
  }
  public static void setAgility(double agility) {
    Ship.agility = agility;
  }
  public static void setArmor(double armor) {
    Ship.armor = armor;
  }
  public static void setAttack(double attack) {
    Ship.attack = attack;
  }
  public static void setCannons(int cannons) {
    Ship.cannons = cannons;
  }
  public static void setSpeed(double speed) {
    Ship.speed = speed;
  }
  public static void setHealth(double health) {
    Ship.health = health;
  }
  public static void setCargohold(int cargohold) {
    Ship.cargohold = cargohold;
  }
  public static void setValue(double value) {
    Ship.value = value;
  }
}