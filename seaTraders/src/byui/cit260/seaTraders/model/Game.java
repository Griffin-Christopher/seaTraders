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
public class Game implements Serializable {
  
  // Variables
  private int stage;
  private int flags[];
  private double playerScore[];
  
  // Constructor
  public Game() {
  }
  
  // Getters
  public int getStage() {
    return stage;
  }
  public int[] getFlags() {
    return flags;
  }
  public double[] getPlayerScore() {
    return playerScore;
  }
  
  // Setters
  public void setStage(int stage) {
    this.stage = stage;
  }
  public void setFlags(int[] flags) {
    this.flags = flags;
  }
  public void setPlayerScore(double[] playerScore) {
    this.playerScore = playerScore;
  }
  
  // MISCELLANEOUS
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 17 * hash + this.stage;
    hash = 17 * hash + Arrays.hashCode(this.flags);
    hash = 17 * hash + Arrays.hashCode(this.playerScore);
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
    final Game other = (Game) obj;
    if (this.stage != other.stage) {
      return false;
    }
    if (!Arrays.equals(this.flags, other.flags)) {
      return false;
    }
    if (!Arrays.equals(this.playerScore, other.playerScore)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Game{" + "stage=" + stage + ", flags=" + flags + ", playerScore=" + playerScore + '}';
  }
  
}