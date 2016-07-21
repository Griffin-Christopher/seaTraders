/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model.location;

import java.io.Serializable;

/**
 *
 * @author Christopher Griffin
 */
public class Location implements Serializable {
  
  // Objects
  private Stage stage;
  
  // Variables
  private int row;
  private int column;
  private String symbol;
  private String type;
  
  private boolean visited;
  private boolean unlocked;
   
  // Constructors
  public Location(int row, int column) {
    this.row = row;
    this.column = column;
    this.symbol = "  ";
    this.unlocked = true;
  }
  public Location(Stage stage, int row, int column, String symbol, String type, 
          boolean visited, boolean unlocked) {
    this.stage = stage;
    this.row = row;
    this.column = column;
    this.symbol = symbol;
    this.type = type;
    this.visited = visited;
    this.unlocked = unlocked;
  }
  
  // Getters
  public Stage getStage() {
    return stage;
  }
  public int getRow() {
    return row;
  }
  public int getColumn() {
    return column;
  }
  public String getSymbol() {
    return symbol;
  }
  public String getType() {
    return type;
  }
  public boolean isVisited() {
    return visited;
  }
  public boolean isUnlocked() {
    return unlocked;
  }
  
  // Setters
  public void setStage(Stage stage) {
    this.stage = stage;
  }
  public void setRow(int row) {
    this.row = row;
  }
  public void setColumn(int column) {
    this.column = column;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setVisited() {
    this.visited = true;
  }
  public void setUnlocked() {
    this.unlocked = true;
  }
}