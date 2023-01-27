
package Course_Management_System;

import java.awt.Font;

public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        top_section = new javax.swing.JPanel();
        Welcome_text = new javax.swing.JLabel();
        loginGoogle = new javax.swing.JButton();
        wlvIcon = new javax.swing.JLabel();
        loginEmail = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        or_emailLabel = new javax.swing.JLabel();
        emailPasswordContainer = new javax.swing.JPanel();
        emailAddress = new javax.swing.JPanel();
        emailTextFields = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        password = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        keepme_forgot = new javax.swing.JPanel();
        keepmeLabel = new javax.swing.JCheckBox();
        forgotLabel = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        signupPanel = new javax.swing.JPanel();
        dont_have_an_accountLabel = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1034, 560));
        setUndecorated(true);
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
        loginGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginGoogleActionPerformed(evt);
            }
        });

        wlvIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wlv_logo__1_-removebg-preview.png"))); // NOI18N
        wlvIcon.setMaximumSize(new java.awt.Dimension(500, 40));

        javax.swing.GroupLayout top_sectionLayout = new javax.swing.GroupLayout(top_section);
        top_section.setLayout(top_sectionLayout);
        top_sectionLayout.setHorizontalGroup(
            top_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_sectionLayout.createSequentialGroup()
                .addGroup(top_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(top_sectionLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(top_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Welcome_text)
                            .addComponent(loginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(top_sectionLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(wlvIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
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

        loginEmail.setBackground(new java.awt.Color(255, 255, 255));
        loginEmail.setPreferredSize(new java.awt.Dimension(400, 30));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(400, 30));

        or_emailLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        or_emailLabel.setText("OR LOGIN WITH EMAIL");
        jPanel11.add(or_emailLabel);

        loginEmail.add(jPanel11);

        jPanel1.add(loginEmail);

        emailPasswordContainer.setBackground(new java.awt.Color(255, 255, 255));
        emailPasswordContainer.setPreferredSize(new java.awt.Dimension(400, 150));

        emailAddress.setBackground(java.awt.Color.white);
        emailAddress.setPreferredSize(new java.awt.Dimension(245, 50));
        emailAddress.setLayout(new java.awt.BorderLayout(4, 4));

        emailTextFields.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        emailTextFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldsActionPerformed(evt);
            }
        });
        emailAddress.add(emailTextFields, java.awt.BorderLayout.CENTER);

        emailLabel.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        emailLabel.setText("Email Address");
        emailAddress.add(emailLabel, java.awt.BorderLayout.PAGE_START);

        emailPasswordContainer.add(emailAddress);

        password.setBackground(java.awt.Color.white);
        password.setPreferredSize(new java.awt.Dimension(245, 50));
        password.setLayout(new java.awt.BorderLayout(4, 4));

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        passwordLabel.setText("Password");
        password.add(passwordLabel, java.awt.BorderLayout.PAGE_START);

        passwordField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        password.add(passwordField, java.awt.BorderLayout.CENTER);

        emailPasswordContainer.add(password);

        keepme_forgot.setBackground(new java.awt.Color(255, 255, 255));
        keepme_forgot.setMinimumSize(new java.awt.Dimension(250, 21));
        keepme_forgot.setPreferredSize(new java.awt.Dimension(250, 25));
        keepme_forgot.setLayout(new java.awt.BorderLayout());

        keepmeLabel.setBackground(java.awt.Color.white);
        keepmeLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        keepmeLabel.setText("Keep me logged in");
        keepmeLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keepmeLabelActionPerformed(evt);
            }
        });
        keepme_forgot.add(keepmeLabel, java.awt.BorderLayout.WEST);

        forgotLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        forgotLabel.setForeground(new java.awt.Color(255, 51, 51));
        forgotLabel.setText("           Forgot password");
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
        keepme_forgot.add(forgotLabel, java.awt.BorderLayout.CENTER);

        emailPasswordContainer.add(keepme_forgot);

        jPanel1.add(emailPasswordContainer);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setPreferredSize(new java.awt.Dimension(400, 75));

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
                .addGap(5, 5, 5)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(login);

        signupPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupPanel.setMinimumSize(new java.awt.Dimension(400, 60));
        signupPanel.setPreferredSize(new java.awt.Dimension(400, 60));

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

        jLabel1.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("© 2022 ALL RIGHTS RESERVED");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(693, 560));
        jPanel2.setPreferredSize(new java.awt.Dimension(693, 560));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/University of Wolverhampton main.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMinimumSize(new java.awt.Dimension(690, 560));
        jLabel2.setPreferredSize(new java.awt.Dimension(690, 560));
        jPanel2.add(jLabel2, "card2");

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1034, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupLabelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_signupLabelFocusGained

    private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseClicked
new Signup().setVisible(true);
this.dispose();
    }//GEN-LAST:event_signupLabelMouseClicked

    private void signupLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signupLabelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_signupLabelFocusLost

    private void signupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseEntered
signupLabel.setFont(signupLabel.getFont().deriveFont(Font.BOLD));        // TODO add your handling code here:
    }//GEN-LAST:event_signupLabelMouseEntered

    private void signupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseExited
signupLabel.setFont(signupLabel.getFont().deriveFont(Font.PLAIN));        // TODO add your handling code here:
    }//GEN-LAST:event_signupLabelMouseExited

    private void forgotLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotLabelMouseClicked

    private void forgotLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseEntered
forgotLabel.setFont(forgotLabel.getFont().deriveFont(Font.BOLD));        // TODO add your handling code here:
    }//GEN-LAST:event_forgotLabelMouseEntered

    private void forgotLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotLabelMouseExited
forgotLabel.setFont(forgotLabel.getFont().deriveFont(Font.PLAIN));           // TODO add your handling code here:
    }//GEN-LAST:event_forgotLabelMouseExited

    private void loginGoogleActionPerformed(java.awt.event.ActionEvent evt) {}
      
    private void emailTextFieldsActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void keepmeLabelActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
     
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome_text;
    private javax.swing.JLabel dont_have_an_accountLabel;
    private javax.swing.JPanel emailAddress;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel emailPasswordContainer;
    private javax.swing.JTextField emailTextFields;
    private javax.swing.JLabel forgotLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox keepmeLabel;
    private javax.swing.JPanel keepme_forgot;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginEmail;
    private javax.swing.JButton loginGoogle;
    private javax.swing.JLabel or_emailLabel;
    private javax.swing.JPanel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JPanel top_section;
    private javax.swing.JLabel wlvIcon;
    // End of variables declaration//GEN-END:variables
}
