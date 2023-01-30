/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course_Management_System;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExitConfirmationWindowListener extends WindowAdapter {
  @Override
  public void windowClosing(WindowEvent e) {
    int result = JOptionPane.showConfirmDialog((JFrame) e.getSource(), "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
    if (result == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }
}