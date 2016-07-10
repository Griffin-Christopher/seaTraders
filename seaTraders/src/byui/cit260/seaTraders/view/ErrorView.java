/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.seaTraders.view;

import java.io.PrintWriter;
import seatraders.SeaTraders;

/**
 *
 * @author Christopher
 */
public class ErrorView {
  
  private static final PrintWriter errorFile = SeaTraders.getOutFile();
  private static final PrintWriter logFile = SeaTraders.getLogFile();
  
  public static void display(String className, String errorMessage) {
    errorFile.println("-----------------------------------------------------------"
              + "\n- ERROR: " + errorMessage
              + "\n-----------------------------------------------------------");
    
    // Error log
    logFile.println(className + " - " + errorMessage);
  }
}