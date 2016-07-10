/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatraders;

import byui.cit260.seaTraders.model.Game;
import byui.cit260.seaTraders.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Christopher Griffin
 */
public class SeaTraders { 
  
  // Objects
  private static Game currentGame = null;
  
  private static PrintWriter outFile = null;
  private static BufferedReader inFile = null;
  
  private static PrintWriter logFile = null;
  
  // Variables
  
  // Getters
  public static Game getCurrentGame() {
    return currentGame;
  }
  public static PrintWriter getOutFile() {
    return outFile;
  }
  public static BufferedReader getInFile() {
    return inFile;
  }
  public static PrintWriter getLogFile() {
    return logFile;
  }
  

  // Setters
  public static void setCurrentGame(Game currentGame) {
    SeaTraders.currentGame = currentGame;
  }
  public static void setOutFile(PrintWriter outFile) {
    SeaTraders.outFile = outFile;
  }
  public static void setInFile(BufferedReader inFile) {
    SeaTraders.inFile = inFile;
  } 
  public static void setLogFile(PrintWriter logFile) {
    SeaTraders.logFile = logFile;
  }
  
  // PROGRAM START
  public static void main(String[] args) {
    // Begin Exception Handling
    boolean testing = true;
    while (testing == true){
      try {
        // Generate streams for input/output
        SeaTraders.inFile = new BufferedReader(new InputStreamReader(System.in));
        SeaTraders.outFile = new PrintWriter(System.out, true);
        
        // Open log file
        String filePath = "P:\\BYU Courses\\cCurrent"
                + "\\CIT 260 - Object Oriented Programming I\\log.txt";
        SeaTraders.logFile = new PrintWriter(filePath);

        // Initialize game
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
      } catch (Throwable e) {
          // Generate error report
          System.out.println("EXCEPTION: " + e.toString() 
                  + "\nCause: " + e.getCause() 
                  + "\nMessage: " + e.getMessage());
          e.printStackTrace();
      }
      
      finally {
        try {
          // Close input/output streams
          if (SeaTraders.inFile != null) {
            SeaTraders.inFile.close();
          }
          if (SeaTraders.outFile != null) {
            SeaTraders.outFile.close();
          }
          if (SeaTraders.logFile != null) {
            SeaTraders.logFile.close();
          }
        } catch (IOException e) {
            System.out.println("Error closing files!");
            return;
        }
      }
    }
  } 
}