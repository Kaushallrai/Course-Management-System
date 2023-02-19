package secondary;

import dataBase.MyConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import primary.Dashboard;


public class Login_ extends javax.swing.JFrame {

    public Login_() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new ExitConfirmationWindowListener());

    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        top_section = new javax.swing.JPanel();
        Welcome_text = new javax.swing.JLabel();
        loginGoogle = new javax.swing.JButton();
        wlvIcon = new javax.swing.JLabel();
        orLogin = new javax.swing.JPanel();
        or_emailLabel = new javax.swing.JLabel();
        emailPasswordContainer = new javax.swing.JPanel();
        keepmeLabel = new javax.swing.JCheckBox();
        forgotLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        invalidEmail_label = new javax.swing.JLabel();
        invalidPassword_label = new javax.swing.JLabel();
        emailAddress_label = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        login = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        signupPanel = new javax.swing.JPanel();
        dont_have_an_accountLabel = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        all_rights_reserved_label = new javax.swing.JLabel();
        wlv1 = new javax.swing.JPanel();
        png1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WolvPortal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1034, 560));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 560));

        top_section.setBackground(new java.awt.Color(255, 255, 255));
        top_section.setPreferredSize(new java.awt.Dimension(400, 180));

        Welcome_text.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Welcome_text.setText("Welcome ");

        loginGoogle.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        loginGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_google_16px_1.png"))); // NOI18N
        loginGoogle.setText("Log in with Google");
        loginGoogle.setPreferredSize(new java.awt.Dimension(245, 30));
        loginGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginGoogleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginGoogleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginGoogleMouseExited(evt);
            }
        });
        loginGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginGoogleActionPerformed(evt);
            }
        });

        wlvIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/new wlv logo.png"))); // NOI18N
        wlvIcon.setMaximumSize(new java.awt.Dimension(500, 40));

        javax.swing.GroupLayout top_sectionLayout = new javax.swing.GroupLayout(top_section);
        top_section.setLayout(top_sectionLayout);
        top_sectionLayout.setHorizontalGroup(
            top_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_sectionLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(top_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Welcome_text)
                    .addComponent(loginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wlvIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        top_sectionLayout.setVerticalGroup(
            top_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_sectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wlvIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome_text)
                .addGap(18, 18, 18)
                .addComponent(loginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(top_section);

        orLogin.setBackground(new java.awt.Color(255, 255, 255));
        orLogin.setPreferredSize(new java.awt.Dimension(400, 30));

        or_emailLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        or_emailLabel.setText("OR LOGIN WITH EMAIL");
        orLogin.add(or_emailLabel);

        jPanel1.add(orLogin);

        emailPasswordContainer.setBackground(new java.awt.Color(255, 255, 255));
        emailPasswordContainer.setMinimumSize(new java.awt.Dimension(400, 170));
        emailPasswordContainer.setPreferredSize(new java.awt.Dimension(400, 170));

        keepmeLabel.setBackground(java.awt.Color.white);
        keepmeLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        keepmeLabel.setText("Keep me logged in");
        keepmeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keepmeLabelActionPerformed(evt);
            }
        });

        forgotLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        forgotLabel.setForeground(new java.awt.Color(255, 51, 51));
        forgotLabel.setText("       Forgot password");
        forgotLabel.setMaximumSize(new java.awt.Dimension(90, 13));
        forgotLabel.setMinimumSize(new java.awt.Dimension(90, 13));
        forgotLabel.setPreferredSize(new java.awt.Dimension(90, 15));
        forgotLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotLabelMouseExited(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        passwordLabel.setText("Password");

        invalidEmail_label.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidEmail_label.setForeground(new java.awt.Color(255, 51, 51));

        invalidPassword_label.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidPassword_label.setForeground(new java.awt.Color(255, 51, 51));

        emailAddress_label.setBackground(new java.awt.Color(255, 255, 255));
        emailAddress_label.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        emailAddress_label.setText("Email Address");

        emailTextField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout emailPasswordContainerLayout = new javax.swing.GroupLayout(emailPasswordContainer);
        emailPasswordContainer.setLayout(emailPasswordContainerLayout);
        emailPasswordContainerLayout.setHorizontalGroup(
            emailPasswordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPasswordContainerLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(keepmeLabel)
                .addGap(18, 18, 18)
                .addComponent(forgotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(emailPasswordContainerLayout.createSequentialGroup()
                .addGroup(emailPasswordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(emailPasswordContainerLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(emailPasswordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalidEmail_label, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invalidPassword_label, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAddress_label, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(emailPasswordContainerLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(emailPasswordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPasswordContainerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPasswordContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emailPasswordContainerLayout.setVerticalGroup(
            emailPasswordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPasswordContainerLayout.createSequentialGroup()
                .addComponent(emailAddress_label)
                .addGap(9, 9, 9)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(invalidEmail_label, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(invalidPassword_label, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(emailPasswordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keepmeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forgotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(emailPasswordContainer);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setMinimumSize(new java.awt.Dimension(400, 60));
        login.setPreferredSize(new java.awt.Dimension(400, 60));

        loginButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        loginButton.setText("Log in ");
        loginButton.setPreferredSize(new java.awt.Dimension(245, 30));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(login);

        signupPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupPanel.setMinimumSize(new java.awt.Dimension(400, 55));
        signupPanel.setPreferredSize(new java.awt.Dimension(400, 55));

        dont_have_an_accountLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        dont_have_an_accountLabel.setText("Don't have an account?");
        signupPanel.add(dont_have_an_accountLabel);

        signupLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(255, 51, 51));
        signupLabel.setText("Sign up");
        signupLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                signupLabelFocusLost(evt);
            }
        });
        signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupLabelMouseExited(evt);
            }
        });
        signupPanel.add(signupLabel);

        jPanel1.add(signupPanel);

        all_rights_reserved_label.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        all_rights_reserved_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        all_rights_reserved_label.setText("© 2022 ALL RIGHTS RESERVED");
        all_rights_reserved_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(all_rights_reserved_label);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        wlv1.setBackground(new java.awt.Color(255, 255, 255));
        wlv1.setMinimumSize(new java.awt.Dimension(693, 560));
        wlv1.setPreferredSize(new java.awt.Dimension(693, 560));
        wlv1.setLayout(new java.awt.CardLayout());

        png1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/University of Wolverhampton main.jpg"))); // NOI18N
        png1.setMinimumSize(new java.awt.Dimension(690, 560));
        png1.setPreferredSize(new java.awt.Dimension(690, 560));
        wlv1.add(png1, "card2");

        getContentPane().add(wlv1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1048, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupLabelFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_signupLabelFocusGained
        // TODO add your handling code here:
    }// GEN-LAST:event_signupLabelFocusGained

    private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signupLabelMouseClicked
        new Signup_().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_signupLabelMouseClicked

    private void signupLabelFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_signupLabelFocusLost
        // TODO add your handling code here:
    }// GEN-LAST:event_signupLabelFocusLost

    private void signupLabelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signupLabelMouseEntered
        signupLabel.setFont(signupLabel.getFont().deriveFont(Font.BOLD)); // TODO add your handling code here:
    }// GEN-LAST:event_signupLabelMouseEntered

    private void signupLabelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signupLabelMouseExited
        signupLabel.setFont(signupLabel.getFont().deriveFont(Font.PLAIN)); // TODO add your handling code here:
    }// GEN-LAST:event_signupLabelMouseExited

    private void forgotLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_forgotLabelMouseClicked
        new ForgotPassword().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_forgotLabelMouseClicked

    private void forgotLabelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_forgotLabelMouseEntered
        forgotLabel.setFont(forgotLabel.getFont().deriveFont(Font.BOLD)); // TODO add your handling code here:
    }// GEN-LAST:event_forgotLabelMouseEntered

    private void forgotLabelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_forgotLabelMouseExited
        forgotLabel.setFont(forgotLabel.getFont().deriveFont(Font.PLAIN)); // TODO add your handling code here:
    }// GEN-LAST:event_forgotLabelMouseExited

    private void loginGoogleMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginGoogleMouseClicked
        new Google().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_loginGoogleMouseClicked

    private void loginGoogleMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginGoogleMouseEntered

    }// GEN-LAST:event_loginGoogleMouseEntered

    private void loginGoogleMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginGoogleMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_loginGoogleMouseExited

    private void loginGoogleActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void keepmeLabelActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        PreparedStatement ps;
        ResultSet rs;
         String eString = emailTextField.getText();
          String pwString = String.valueOf(passwordField.getPassword());
          
          String query="SELECT * FROM `users` WHERE `u_email`=? AND `u_pass`=?";
          
        try {
            ps =MyConnection.getConnection().prepareStatement(query);
            ps.setString(1,eString);
            ps.setString(2,pwString);
            
            rs=ps.executeQuery();
            
            if(rs.next()){
            JOptionPane.showMessageDialog(null, "Successfully logged in!", "Success", JOptionPane.INFORMATION_MESSAGE);
        new Dashboard().setVisible(true);
        this.dispose();}
            else{
                  JOptionPane.showMessageDialog(null, "Invalid Email or Password", "InValid", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
        
                
        if (emailTextField.getText().trim().isEmpty() && passwordField.getText().trim().isEmpty()) {
            invalidEmail_label.setText("Email address field is Empty");
            invalidPassword_label.setText("Password field is Empty");
        } else if (emailTextField.getText().trim().isEmpty()) {
            invalidEmail_label.setText("Email address field is Empty");
        } else if (passwordField.getText().trim().isEmpty()) {
            invalidPassword_label.setText("Password field is Empty");
        }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome_text;
    private javax.swing.JLabel all_rights_reserved_label;
    private javax.swing.JLabel dont_have_an_accountLabel;
    private javax.swing.JLabel emailAddress_label;
    private javax.swing.JPanel emailPasswordContainer;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel forgotLabel;
    private javax.swing.JLabel invalidEmail_label;
    private javax.swing.JLabel invalidPassword_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox keepmeLabel;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginGoogle;
    private javax.swing.JPanel orLogin;
    private javax.swing.JLabel or_emailLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel png1;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JPanel top_section;
    private javax.swing.JPanel wlv1;
    private javax.swing.JLabel wlvIcon;
    // End of variables declaration//GEN-END:variables
}
