/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Christopher Griffin
 */
public class World implements Serializable {
  
  // Variables
  private int rowCount;
  private int columnCount;
  private String[] transitions;
  
  // Constructor
  public World() {
  }

  // Getters
  public int getRowCount() {
    return rowCount;
  }
  public int getColumnCount() {
    return columnCount;
  }
  public String[] getTransitions() {
    return transitions;
  }
  
  // Setters
  public void setRowCount(int rowCount) {
    this.rowCount = rowCount;
  }
  public void setColumnCount(int columnCount) {
    this.columnCount = columnCount;
  }
  public void setTransitions(String[] transitions) {
    this.transitions = transitions;
  }
  
  // OVERRIDES
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 37 * hash + this.rowCount;
    hash = 37 * hash + this.columnCount;
    hash = 37 * hash + Arrays.deepHashCode(this.transitions);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final World other = (World) obj;
    if (this.rowCount != other.rowCount) {
      return false;
    }
    if (this.columnCount != other.columnCount) {
      return false;
    }
    if (!Arrays.deepEquals(this.transitions, other.transitions)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "World{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", transitions=" + transitions + '}';
  }
}
