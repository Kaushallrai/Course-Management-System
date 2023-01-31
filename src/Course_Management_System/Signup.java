package Course_Management_System;

import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new ExitConfirmationWindowListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUp_panel = new javax.swing.JPanel();
        welcome = new javax.swing.JPanel();
        welcome_label = new javax.swing.JLabel();
        create_label = new javax.swing.JLabel();
        lets_get_started_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        input_panel = new javax.swing.JPanel();
        firstName_label = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        firstName_textfield = new javax.swing.JTextField();
        lastName_textfield = new javax.swing.JTextField();
        dob_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        address_textfield = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        phoneNumber_label = new javax.swing.JLabel();
        email_textfield = new javax.swing.JTextField();
        phoneNumber_textfield = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        retype_password_label = new javax.swing.JLabel();
        password_passwordfield = new javax.swing.JPasswordField();
        retype_password_passwordfield = new javax.swing.JPasswordField();
        terms_and_services_checkbox = new javax.swing.JCheckBox();
        invalidFirstName = new javax.swing.JLabel();
        invalidDOB = new javax.swing.JLabel();
        invalidLastName = new javax.swing.JLabel();
        invalidAddress = new javax.swing.JLabel();
        invalidEmail = new javax.swing.JLabel();
        invalidPhoneNumber = new javax.swing.JLabel();
        invalidPassword = new javax.swing.JLabel();
        invalidRetypePassword = new javax.swing.JLabel();
        dob_textfield = new javax.swing.JTextField();
        create_panel = new javax.swing.JPanel();
        create_account = new javax.swing.JButton();
        signUp_google = new javax.swing.JButton();
        already_have = new javax.swing.JLabel();
        signIn = new javax.swing.JLabel();
        wlv2 = new javax.swing.JPanel();
        png2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WolvPortal ");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1034, 560));
        setMinimumSize(new java.awt.Dimension(1034, 560));
        setPreferredSize(new java.awt.Dimension(1034, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUp_panel.setBackground(new java.awt.Color(255, 255, 255));
        signUp_panel.setMinimumSize(new java.awt.Dimension(600, 560));
        signUp_panel.setPreferredSize(new java.awt.Dimension(600, 560));

        welcome.setBackground(new java.awt.Color(255, 255, 255));

        welcome_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        welcome_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png"))); // NOI18N
        welcome_label.setText("Welcome to Wolverhampton");

        create_label.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        create_label.setText("Create your account");

        lets_get_started_label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lets_get_started_label.setText("Let's get started with your University account");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lets_get_started_label, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(create_label, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(welcome_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lets_get_started_label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        input_panel.setBackground(new java.awt.Color(255, 255, 255));
        input_panel.setMinimumSize(new java.awt.Dimension(630, 340));
        input_panel.setPreferredSize(new java.awt.Dimension(630, 340));

        firstName_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstName_label.setText("First Name*");
        firstName_label.setMaximumSize(new java.awt.Dimension(62, 12));
        firstName_label.setMinimumSize(new java.awt.Dimension(62, 12));
        firstName_label.setPreferredSize(new java.awt.Dimension(62, 12));

        lastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastName.setText("Last Name*");

        firstName_textfield.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstName_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstName_textfieldActionPerformed(evt);
            }
        });

        lastName_textfield.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastName_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName_textfieldActionPerformed(evt);
            }
        });

        dob_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dob_label.setText("Date of Birth*");

        address_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        address_label.setText("Address*");

        address_textfield.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        password_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password_label.setText("Password*");

        phoneNumber_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        phoneNumber_label.setText("Phone Number*");

        email_textfield.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfieldActionPerformed(evt);
            }
        });

        phoneNumber_textfield.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        email_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_label.setText("Email address*");

        retype_password_label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        retype_password_label.setText("Re-type Password*");

        terms_and_services_checkbox.setBackground(new java.awt.Color(255, 255, 255));
        terms_and_services_checkbox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        terms_and_services_checkbox.setText("  I agree to the Terms of Services and Privacy Policy");
        terms_and_services_checkbox.setMinimumSize(new java.awt.Dimension(300, 22));
        terms_and_services_checkbox.setPreferredSize(new java.awt.Dimension(300, 22));
        terms_and_services_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terms_and_services_checkboxActionPerformed(evt);
            }
        });

        invalidFirstName.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidFirstName.setForeground(new java.awt.Color(255, 51, 51));
        invalidFirstName.setText(" ");

        invalidDOB.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidDOB.setForeground(new java.awt.Color(255, 51, 51));
        invalidDOB.setText(" ");

        invalidLastName.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidLastName.setForeground(new java.awt.Color(255, 51, 51));
        invalidLastName.setText(" ");

        invalidAddress.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidAddress.setForeground(new java.awt.Color(255, 51, 51));
        invalidAddress.setText(" ");

        invalidEmail.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidEmail.setForeground(new java.awt.Color(255, 51, 51));
        invalidEmail.setText(" ");

        invalidPhoneNumber.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidPhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        invalidPhoneNumber.setText(" ");

        invalidPassword.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidPassword.setForeground(new java.awt.Color(255, 51, 51));
        invalidPassword.setText(" ");

        invalidRetypePassword.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        invalidRetypePassword.setForeground(new java.awt.Color(255, 51, 51));
        invalidRetypePassword.setText(" ");

        dob_textfield.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dob_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_textfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout input_panelLayout = new javax.swing.GroupLayout(input_panel);
        input_panel.setLayout(input_panelLayout);
        input_panelLayout.setHorizontalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terms_and_services_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(invalidPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(password_passwordfield)
                                    .addComponent(firstName_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstName_textfield)
                                    .addComponent(dob_label)
                                    .addComponent(email_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(email_label)
                                    .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(invalidFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(invalidDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(invalidEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dob_textfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invalidPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invalidAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invalidLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumber_textfield)
                            .addComponent(phoneNumber_label)
                            .addComponent(address_label)
                            .addComponent(lastName_textfield)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_textfield)
                            .addComponent(retype_password_label, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(retype_password_passwordfield)
                            .addComponent(invalidRetypePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        input_panelLayout.setVerticalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstName_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidFirstName)
                    .addComponent(invalidLastName))
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidDOB)
                    .addComponent(invalidAddress))
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidEmail)
                    .addComponent(invalidPhoneNumber))
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retype_password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retype_password_passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_passwordfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invalidPassword)
                    .addComponent(invalidRetypePassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terms_and_services_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        create_panel.setBackground(new java.awt.Color(255, 255, 255));

        create_account.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        create_account.setText("Create account");
        create_account.setPreferredSize(new java.awt.Dimension(245, 30));
        create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_accountActionPerformed(evt);
            }
        });

        signUp_google.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signUp_google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_google_16px_1.png"))); // NOI18N
        signUp_google.setText("Sign up with Google");
        signUp_google.setPreferredSize(new java.awt.Dimension(245, 30));
        signUp_google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUp_googleMouseClicked(evt);
            }
        });

        already_have.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        already_have.setText("Already have an account?");

        signIn.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        signIn.setForeground(java.awt.SystemColor.textHighlight);
        signIn.setText("Sign in");
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout create_panelLayout = new javax.swing.GroupLayout(create_panel);
        create_panel.setLayout(create_panelLayout);
        create_panelLayout.setHorizontalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_panelLayout.createSequentialGroup()
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_panelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signUp_google, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(create_account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(create_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(already_have)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signIn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        create_panelLayout.setVerticalGroup(
            create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_panelLayout.createSequentialGroup()
                .addComponent(create_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUp_google, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(create_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signIn)
                    .addComponent(already_have))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUp_panelLayout = new javax.swing.GroupLayout(signUp_panel);
        signUp_panel.setLayout(signUp_panelLayout);
        signUp_panelLayout.setHorizontalGroup(
            signUp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
            .addComponent(create_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signUp_panelLayout.setVerticalGroup(
            signUp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUp_panelLayout.createSequentialGroup()
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(signUp_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        png2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wlv day main.jpg"))); // NOI18N

        javax.swing.GroupLayout wlv2Layout = new javax.swing.GroupLayout(wlv2);
        wlv2.setLayout(wlv2Layout);
        wlv2Layout.setHorizontalGroup(
            wlv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wlv2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(png2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1612, Short.MAX_VALUE))
        );
        wlv2Layout.setVerticalGroup(
            wlv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(png2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(wlv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 0, 2240, 560));

        setSize(new java.awt.Dimension(1048, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_email_textfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_email_textfieldActionPerformed

    private void firstName_textfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstName_textfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_firstName_textfieldActionPerformed

    private void dob_textfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dob_textfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_dob_textfieldActionPerformed

    private void terms_and_services_checkboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_terms_and_services_checkboxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_terms_and_services_checkboxActionPerformed

  private void create_accountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_create_accountActionPerformed        
    boolean isInputValid = true; 
    invalidFirstName.setText("");
    invalidLastName.setText("");
    invalidDOB.setText("");
    invalidAddress.setText("");
    invalidEmail.setText("");
    invalidPhoneNumber.setText("");
    invalidPassword.setText("");
    invalidRetypePassword.setText("");
    if (firstName_textfield.getText().trim().isEmpty()) {
        invalidFirstName.setText("First Name field is Empty");
        isInputValid = false;
    }
    if (lastName_textfield.getText().trim().isEmpty()) {
        invalidLastName.setText("Last Name field is Empty");
        isInputValid = false;
    }
    if (dob_textfield.getText().trim().isEmpty()) {
        invalidDOB.setText("Date of Birth field is Empty");
        isInputValid = false;
    }
    if (address_textfield.getText().trim().isEmpty()) {
        invalidAddress.setText("Address field is Empty");
        isInputValid = false;
    }
    if (email_textfield.getText().trim().isEmpty()) {
        invalidEmail.setText("Email field is Empty");
        isInputValid = false;
    }
    if (phoneNumber_textfield.getText().trim().isEmpty()) {
        invalidPhoneNumber.setText("Phone Number field is Empty");
        isInputValid = false;
    }
    if (password_passwordfield.getText().trim().isEmpty()) {
        invalidPassword.setText("Password field is Empty");
        isInputValid = false;
    }
    if (retype_password_passwordfield.getText().trim().isEmpty()) {
        invalidRetypePassword.setText("Retype Password field is Empty");
        isInputValid = false;
    }
    if (!password_passwordfield.getText().equals(retype_password_passwordfield.getText())) {
        invalidPassword.setText("Password does not match");
        invalidRetypePassword.setText("Password does not match");
        isInputValid = false;
    }
    if (!terms_and_services_checkbox.isSelected()) {
        JOptionPane.showMessageDialog(null, "Please accept the terms and services", "Error", JOptionPane.ERROR_MESSAGE);
        isInputValid = false;
    }
    if (isInputValid) {
        JOptionPane.showMessageDialog(null, "Your account has been successfully created!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }    
}
    

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signInMouseClicked
        new Login().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }// GEN-LAST:event_signInMouseClicked

    private void signInMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signInMouseEntered
        signIn.setFont(signIn.getFont().deriveFont(Font.BOLD)); // TODO add your handling code here:
    }// GEN-LAST:event_signInMouseEntered

    private void signInMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signInMouseExited
        signIn.setFont(signIn.getFont().deriveFont(Font.PLAIN)); // TODO add your handling code here:
    }// GEN-LAST:event_signInMouseExited

    private void signUp_googleMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signUp_googleMouseClicked
        new Google().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_signUp_googleMouseClicked

    private void lastName_textfieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastName_textfieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_lastName_textfieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_textfield;
    private javax.swing.JLabel already_have;
    private javax.swing.JButton create_account;
    private javax.swing.JLabel create_label;
    private javax.swing.JPanel create_panel;
    private javax.swing.JLabel dob_label;
    private javax.swing.JTextField dob_textfield;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JLabel firstName_label;
    private javax.swing.JTextField firstName_textfield;
    private javax.swing.JPanel input_panel;
    private javax.swing.JLabel invalidAddress;
    private javax.swing.JLabel invalidDOB;
    private javax.swing.JLabel invalidEmail;
    private javax.swing.JLabel invalidFirstName;
    private javax.swing.JLabel invalidLastName;
    private javax.swing.JLabel invalidPassword;
    private javax.swing.JLabel invalidPhoneNumber;
    private javax.swing.JLabel invalidRetypePassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastName_textfield;
    private javax.swing.JLabel lets_get_started_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_passwordfield;
    private javax.swing.JLabel phoneNumber_label;
    private javax.swing.JTextField phoneNumber_textfield;
    private javax.swing.JLabel png2;
    private javax.swing.JLabel retype_password_label;
    private javax.swing.JPasswordField retype_password_passwordfield;
    private javax.swing.JLabel signIn;
    private javax.swing.JButton signUp_google;
    private javax.swing.JPanel signUp_panel;
    private javax.swing.JCheckBox terms_and_services_checkbox;
    private javax.swing.JPanel welcome;
    private javax.swing.JLabel welcome_label;
    private javax.swing.JPanel wlv2;
    // End of variables declaration//GEN-END:variables
}
