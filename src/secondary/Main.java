package secondary;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {

  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
        | UnsupportedLookAndFeelException e) {
    }
    java.awt.EventQueue.invokeLater(() -> {
      new Login_().setVisible(true);
    });
  }
}
