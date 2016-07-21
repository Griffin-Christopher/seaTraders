/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model.location;

import byui.cit260.seaTraders.model.Ship;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Christopher Griffin
 */
public class Stage implements Serializable {
  
  // Variables
  private String name;
  private String description;
  private String type;
  private int resourcePrice;
  private int[] resourcePrices;
  private ArrayList<Object> inventory;
  private ArrayList<Ship> ships;
  private Encounter encounter;
  
  // Constructors
  public Stage() {
  }
  public Stage(String name, String description, String type, int price, 
          int[] prices, ArrayList<Object> inventory, ArrayList<Ship> ships,
          Encounter encounter) {
    this.name = name;
    this.description = description;
    this.type = type;
    this.resourcePrice = price;
    this.resourcePrices = prices;
    this.inventory = inventory;
    this.ships = ships;
    this.encounter = encounter;
  }

  // Getters
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public String getType() {
    return type;
  }
  public int getPrice() {
    return resourcePrice;
  }
  public int[] getPrices() {
    return resourcePrices;
  }
  public ArrayList<Object> getInventory() {
    return inventory;
  }
  public Object getItem(int index) {
    return inventory.get(index);
  }
  public ArrayList<Ship> getShips() {
    return ships;
  }
  public Ship getShip(int index) {
    return ships.get(index);
  }
  public Encounter getEncounter() {
    return encounter;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setPrice(int price) {
    this.resourcePrice = price;
  }
  public void setPrices(int[] prices) {
    this.resourcePrices = prices;
  }
  public void setInventory(ArrayList<Object> inventory) {
    this.inventory = inventory;
  }
  public void setItem(int index, Object item) {
    this.inventory.set(index, item);
  }
  public void setShips(ArrayList<Ship> ships) {
    this.ships = ships;
  }
  public void setShip(int index, Ship ship) {
    this.ships.set(index, ship);
  }
  public void setEncounter(Encounter encounter) {
    this.encounter = encounter;
  }
}