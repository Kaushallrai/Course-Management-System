package Course_Management_System;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Final {

  public static void main(String[] args) {

    try {
      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
        | UnsupportedLookAndFeelException e) {
    }
    java.awt.EventQueue.invokeLater(() -> {
      new Login().setVisible(true);
    });
  }
}
