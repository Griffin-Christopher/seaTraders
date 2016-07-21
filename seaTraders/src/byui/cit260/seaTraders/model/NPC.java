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

public class NPC implements Serializable { 
  
  // Variables
  private boolean isEmpty = true;
  private double agility;
  private double armor;
  private double attack;
  private double speed;
  private double health;
  
  // Constructors
  public NPC() {  
  }  
  public NPC(double agility, double armor, double attack, double speed, double health) {
    this.isEmpty = false;
    this.agility = agility;
    this.armor = armor;
    this.attack = attack;
    this.speed = speed;
    this.health = health;
  }
  
  // Getters
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
  
  // Setters
  public void setAgility(double agility) {
    this.agility = agility;
  }
  public void setArmor(double armor) {
    this.armor = armor;
  }
  public void setAttack(double attack) {
    this.attack = attack;
  }
  public void setSpeed(double speed) {
    this.speed = speed;
  }
  public void setHealth(double health) {
    this.health = health;
  }
}