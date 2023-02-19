/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package primary;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import secondary.ExitConfirmationWindowListener;
import secondary.Login_;

/**
 *
 * @author kaush
 */
public class Dashboard extends javax.swing.JFrame {

    Student student = new Student();
    Teacher teacher = new Teacher();
    Course course = new Course();

    Color DefaultColor, ClickedColor;

    private DefaultTableModel model;
    private DefaultTableModel model2;
    private DefaultTableModel model3;
    private int rowIndex;

    public Dashboard() {
        initComponents();
        curDateTime();
        init();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new ExitConfirmationWindowListener());

        DefaultColor = new Color(255, 255, 255);
        ClickedColor = new Color(238, 238, 238);

        menuName.setText("Courses");

    }

    public void curDateTime() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(dateFormatter);
        dateTime.setText("Date : " + formattedDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sidebar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sidebar_courses = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sidebar_student = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sidebar_teacher = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Header = new javax.swing.JPanel();
        dateTime = new javax.swing.JLabel();
        menuName = new javax.swing.JLabel();
        Cards = new javax.swing.JPanel();
        studentCard = new javax.swing.JPanel();
        panel1Student = new javax.swing.JPanel();
        sid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        semail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        saddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bAddNew = new javax.swing.JButton();
        sdate = new com.toedter.calendar.JDateChooser();
        sgender = new javax.swing.JComboBox<>();
        scourse = new javax.swing.JComboBox<>();
        bUpdate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bPrint = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        sphone = new javax.swing.JTextField();
        panel2Student = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        sSearch = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        teacherCard = new javax.swing.JPanel();
        panel1Student1 = new javax.swing.JPanel();
        tid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tmodule = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        taddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        bAddNewt = new javax.swing.JButton();
        tdate = new com.toedter.calendar.JDateChooser();
        tgender = new javax.swing.JComboBox<>();
        tcourse = new javax.swing.JComboBox<>();
        bUpdatet = new javax.swing.JButton();
        bDeletet = new javax.swing.JButton();
        bPrintt = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        tphone = new javax.swing.JTextField();
        panel2Student1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        tSearch = new javax.swing.JTextField();
        bSearcht = new javax.swing.JButton();
        bRefresht = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        courseCard = new javax.swing.JPanel();
        panel1Student2 = new javax.swing.JPanel();
        cid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        bAddNewc = new javax.swing.JButton();
        bUpdatec = new javax.swing.JButton();
        bDeletec = new javax.swing.JButton();
        bPrintc = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        mname = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        panel2Student2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cTable = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        cSearch = new javax.swing.JTextField();
        bSearchc = new javax.swing.JButton();
        bRefreshc = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WolvPortal");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1100, 600));

        Sidebar.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png"))); // NOI18N
        jLabel1.setText("WolvPortal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(163, 49));

        sidebar_courses.setBackground(new java.awt.Color(255, 255, 255));
        sidebar_courses.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sidebar_courses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sidebar_courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Books_32px_2.png"))); // NOI18N
        sidebar_courses.setText("Courses");
        sidebar_courses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebar_coursesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar_courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar_courses, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(163, 49));

        sidebar_student.setBackground(new java.awt.Color(255, 255, 255));
        sidebar_student.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sidebar_student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sidebar_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_canvas_student_32px.png"))); // NOI18N
        sidebar_student.setText("Student");
        sidebar_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebar_studentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar_student, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar_student, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(163, 49));

        sidebar_teacher.setBackground(new java.awt.Color(255, 255, 255));
        sidebar_teacher.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sidebar_teacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sidebar_teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_female_teacher_32px.png"))); // NOI18N
        sidebar_teacher.setText("Teacher");
        sidebar_teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebar_teacherMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar_teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar_teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(163, 49));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Logout_32px.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Header.setBackground(new java.awt.Color(255, 255, 255));

        dateTime.setBackground(new java.awt.Color(255, 255, 255));
        dateTime.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        dateTime.setText("Date : 2023/02/15");

        menuName.setBackground(new java.awt.Color(255, 255, 255));
        menuName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        menuName.setText("Courses");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(543, 543, 543)
                .addComponent(dateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Cards.setBackground(new java.awt.Color(255, 255, 255));
        Cards.setLayout(new java.awt.CardLayout());

        studentCard.setBackground(new java.awt.Color(255, 255, 255));

        panel1Student.setBackground(new java.awt.Color(255, 255, 255));
        panel1Student.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Student ID :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Student Name :");

        sname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Date of Birth :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Email Address :");

        semail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        semail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Father Name :");

        fname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Address :");

        saddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        saddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Course :");

        bAddNew.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bAddNew.setText("Add New");
        bAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddNewActionPerformed(evt);
            }
        });

        sgender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        scourse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        scourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIT", "BIBM", "IBMA", " " }));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bPrint.setText("Print");
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Enrollment Information");

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Phone Number :");

        sphone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sphoneActionPerformed(evt);
            }
        });
        sphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sphoneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel1StudentLayout = new javax.swing.GroupLayout(panel1Student);
        panel1Student.setLayout(panel1StudentLayout);
        panel1StudentLayout.setHorizontalGroup(
            panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1StudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(saddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1StudentLayout.createSequentialGroup()
                        .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sname, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(sdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1StudentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAddNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(scourse, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addComponent(jSeparator4)
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(sphone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1StudentLayout.setVerticalGroup(
            panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1StudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sphone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1StudentLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(scourse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddNew)
                    .addComponent(bUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDelete)
                    .addComponent(bPrint))
                .addContainerGap())
        );

        panel2Student.setBackground(new java.awt.Color(255, 255, 255));
        panel2Student.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        sTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S-ID", "Student Name", "DOB", "Gender", "Email ", "Phone ", "Father Name", "Address", "Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sTable);
        if (sTable.getColumnModel().getColumnCount() > 0) {
            sTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            sTable.getColumnModel().getColumn(0).setHeaderValue("T-ID");
            sTable.getColumnModel().getColumn(1).setHeaderValue("Teacher Name");
            sTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            sTable.getColumnModel().getColumn(2).setHeaderValue("DOB");
            sTable.getColumnModel().getColumn(3).setHeaderValue("Gender");
            sTable.getColumnModel().getColumn(7).setHeaderValue("Address");
            sTable.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel10.setText("Search Student");

        sSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        bSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        bRefresh.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel2StudentLayout = new javax.swing.GroupLayout(panel2Student);
        panel2Student.setLayout(panel2StudentLayout);
        panel2StudentLayout.setHorizontalGroup(
            panel2StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(panel2StudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(panel2StudentLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(sSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRefresh)))
                .addContainerGap())
        );
        panel2StudentLayout.setVerticalGroup(
            panel2StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2StudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch)
                    .addComponent(bRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout studentCardLayout = new javax.swing.GroupLayout(studentCard);
        studentCard.setLayout(studentCardLayout);
        studentCardLayout.setHorizontalGroup(
            studentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1Student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        studentCardLayout.setVerticalGroup(
            studentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Cards.add(studentCard, "card2");

        teacherCard.setBackground(new java.awt.Color(255, 255, 255));

        panel1Student1.setBackground(new java.awt.Color(255, 255, 255));
        panel1Student1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Teacher ID :");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Teacher Name :");

        tname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Date of Birth :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Gender :");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Email Address :");

        temail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Module Name :");

        tmodule.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tmodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmoduleActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Address :");

        taddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        taddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taddressActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Course :");

        bAddNewt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bAddNewt.setText("Add New");
        bAddNewt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddNewtActionPerformed(evt);
            }
        });

        tgender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        tcourse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIT", "BIBM", "IBMA", " " }));

        bUpdatet.setText("Update");
        bUpdatet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdatetActionPerformed(evt);
            }
        });

        bDeletet.setText("Delete");
        bDeletet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletetActionPerformed(evt);
            }
        });

        bPrintt.setText("Print");
        bPrintt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrinttActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel21.setText("Teacher Information");

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("Phone Number :");

        tphone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tphoneActionPerformed(evt);
            }
        });
        tphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tphoneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel1Student1Layout = new javax.swing.GroupLayout(panel1Student1);
        panel1Student1.setLayout(panel1Student1Layout);
        panel1Student1Layout.setHorizontalGroup(
            panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Student1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(tmodule, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(taddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student1Layout.createSequentialGroup()
                        .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tname, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(tdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAddNewt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bUpdatet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(tcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addComponent(jSeparator5)
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addComponent(bDeletet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPrintt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Student1Layout.setVerticalGroup(
            panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Student1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tgender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmodule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Student1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddNewt)
                    .addComponent(bUpdatet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeletet)
                    .addComponent(bPrintt))
                .addContainerGap())
        );

        panel2Student1.setBackground(new java.awt.Color(255, 255, 255));
        panel2Student1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T-ID", "Teacher Name", "DOB", "Gender", "Email ", "Phone ", "Module Name", "Address", "Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tTable);
        if (tTable.getColumnModel().getColumnCount() > 0) {
            tTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            tTable.getColumnModel().getColumn(0).setHeaderValue("T-ID");
            tTable.getColumnModel().getColumn(1).setHeaderValue("Teacher Name");
            tTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            tTable.getColumnModel().getColumn(2).setHeaderValue("DOB");
            tTable.getColumnModel().getColumn(3).setHeaderValue("Gender");
            tTable.getColumnModel().getColumn(7).setHeaderValue("Address");
            tTable.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel23.setText("Search Teacher");

        tSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        bSearcht.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bSearcht.setText("Search");
        bSearcht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchtActionPerformed(evt);
            }
        });

        bRefresht.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bRefresht.setText("Refresh");
        bRefresht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshtActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel2Student1Layout = new javax.swing.GroupLayout(panel2Student1);
        panel2Student1.setLayout(panel2Student1Layout);
        panel2Student1Layout.setHorizontalGroup(
            panel2Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(panel2Student1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(panel2Student1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(bSearcht, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRefresht)))
                .addContainerGap())
        );
        panel2Student1Layout.setVerticalGroup(
            panel2Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Student1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Student1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearcht)
                    .addComponent(bRefresht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout teacherCardLayout = new javax.swing.GroupLayout(teacherCard);
        teacherCard.setLayout(teacherCardLayout);
        teacherCardLayout.setHorizontalGroup(
            teacherCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1Student1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2Student1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        teacherCardLayout.setVerticalGroup(
            teacherCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teacherCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2Student1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1Student1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Cards.add(teacherCard, "card2");

        courseCard.setBackground(new java.awt.Color(255, 255, 255));

        panel1Student2.setBackground(new java.awt.Color(255, 255, 255));
        panel1Student2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("Course ID :");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("Course Name :");

        cname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("Module ID :");

        mid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });

        bAddNewc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bAddNewc.setText("Add New");
        bAddNewc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddNewcActionPerformed(evt);
            }
        });

        bUpdatec.setText("Update");
        bUpdatec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdatecActionPerformed(evt);
            }
        });

        bDeletec.setText("Delete");
        bDeletec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletecActionPerformed(evt);
            }
        });

        bPrintc.setText("Print");
        bPrintc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintcActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel32.setText("Course Information");

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));

        mname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setText("Module Name :");

        javax.swing.GroupLayout panel1Student2Layout = new javax.swing.GroupLayout(panel1Student2);
        panel1Student2.setLayout(panel1Student2Layout);
        panel1Student2Layout.setHorizontalGroup(
            panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Student2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student2Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Student2Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student2Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7)
                    .addGroup(panel1Student2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Student2Layout.createSequentialGroup()
                        .addComponent(bDeletec, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPrintc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Student2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAddNewc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bUpdatec, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Student2Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Student2Layout.setVerticalGroup(
            panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Student2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddNewc)
                    .addComponent(bUpdatec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeletec)
                    .addComponent(bPrintc))
                .addContainerGap())
        );

        panel2Student2.setBackground(new java.awt.Color(255, 255, 255));
        panel2Student2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        cTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Module ID", "Module Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cTable);
        if (cTable.getColumnModel().getColumnCount() > 0) {
            cTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel34.setText("Search Course");

        cSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        bSearchc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bSearchc.setText("Search");
        bSearchc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchcActionPerformed(evt);
            }
        });

        bRefreshc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bRefreshc.setText("Refresh");
        bRefreshc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshcActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel2Student2Layout = new javax.swing.GroupLayout(panel2Student2);
        panel2Student2.setLayout(panel2Student2Layout);
        panel2Student2Layout.setHorizontalGroup(
            panel2Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(panel2Student2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(panel2Student2Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(cSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(bSearchc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRefreshc)))
                .addContainerGap())
        );
        panel2Student2Layout.setVerticalGroup(
            panel2Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Student2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Student2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearchc)
                    .addComponent(bRefreshc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout courseCardLayout = new javax.swing.GroupLayout(courseCard);
        courseCard.setLayout(courseCardLayout);
        courseCardLayout.setHorizontalGroup(
            courseCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1Student2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2Student2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        courseCardLayout.setVerticalGroup(
            courseCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2Student2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1Student2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Cards.add(courseCard, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void init() {
        tableViewCourse();
        tableViewStudent();
        tableViewTeacher();
        

        sid.setText(String.valueOf(student.getMax()));
        tid.setText(String.valueOf(teacher.getMax()));
        cid.setText(String.valueOf(course.getMax()));
    }

    private void tableViewStudent() {
        student.getStudentValue(sTable, "");
        model = (DefaultTableModel) sTable.getModel();
        sTable.setRowHeight(30);
        sTable.setShowGrid(true);
        sTable.setGridColor(black);
        sTable.setBackground(white);
    }

    private void tableViewTeacher() {
        student.getStudentValue(tTable, "");
        model2 = (DefaultTableModel) tTable.getModel();
        tTable.setRowHeight(30);
        tTable.setShowGrid(true);
        tTable.setGridColor(black);
        tTable.setBackground(white);
    }

    private void tableViewCourse() {
        course.getCourseValue(cTable, "");
        model3 = (DefaultTableModel) cTable.getModel();
        cTable.setRowHeight(30);
        cTable.setShowGrid(true);
        cTable.setGridColor(black);
        cTable.setBackground(white);
    }

    public boolean isEmptyStudent() {

        if (sname.getText().isEmpty()) {
            // JOptionPane.showMessageDialog(this, "Student name is missing");
            return false;
        }
        if (sdate.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(this, "No Student from the future are allowed");
            return false;
        }
        if (fname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Father name is missing");
            return false;
        }
        if (semail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is missing");
            return false;
        }

        if (semail.getText().matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\\\.[a-zA-Z0-9-.]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address");
            return false;
        }
        if (sphone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone  is missing");
            return false;
        }
        if (sphone.getText().length() >= 15) {
            JOptionPane.showMessageDialog(this, "Phone number is too long");
            return false;
        }
        if (saddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address is missing");
            return false;
        }
        if (scourse.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a course");
            return false;
        }

        return true;
    }

    public boolean isEmptyTeacher() {

        if (tname.getText().isEmpty()) {
            // JOptionPane.showMessageDialog(this, "Student name is missing");
            return false;
        }
        if (tdate.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(this, "No User from the future are allowed");
            return false;
        }
        if (tmodule.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Father name is missing");
            return false;
        }
        if (temail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is missing");
            return false;
        }

        if (temail.getText().matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\\\.[a-zA-Z0-9-.]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address");
            return false;
        }
        if (tphone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone  is missing");
            return false;
        }
        if (tphone.getText().length() >= 15) {
            JOptionPane.showMessageDialog(this, "Phone number is too long");
            return false;
        }
        if (taddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address is missing");
            return false;
        }
        if (tcourse.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a course");
            return false;
        }

        return true;
    }

    public boolean isEmptyCourse() {

        if (cname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Course name is missing");
            return false;
        }
        if (mid.getText().length() >= 15) {
            JOptionPane.showMessageDialog(this, "Module id is too long");
            return false;
        }
        if (mname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Module Name is missing");
        }

        return true;
    }

    public void clearInputs() {
        sid.setText(null);
        sname.setText(null);
        sdate.setDate(null);
        semail.setText(null);
        scourse.setSelectedIndex(-1);
        sgender.setSelectedIndex(-1);
        fname.setText(null);
        sphone.setText(null);
        saddress.setText(null);
    }

    public void clearInputt() {
        tid.setText(null);
        tname.setText(null);
        tdate.setDate(null);
        temail.setText(null);
        tcourse.setSelectedIndex(-1);
        tgender.setSelectedIndex(-1);
        tmodule.setText(null);
        tphone.setText(null);
        taddress.setText(null);
    }

    public void clearInputc() {
        cid.setText(null);
        cname.setText(null);
        mid.setText(null);
        mname.setText(null);
    }

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void semailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semailActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void saddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddressActionPerformed

    private void bAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddNewActionPerformed

        if (isEmptyStudent()) {
            if (!student.isEmailExist(sphone.getText())) {
                if (!student.isPhoneExist(sphone.getText())) {
                    int id = student.getMax() + 1;
                    String name = sname.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(sdate.getDate());
                    String gender = sgender.getSelectedItem().toString();
                    String email = semail.getText();
                    String phone = sphone.getText();
                    String father = fname.getText();
                    String address = saddress.getText();
                    String course = (String) scourse.getSelectedItem();
                    student.insert(id, name, date, gender, email, phone, father, address, course);
                    sTable.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name", "Date of Birth",
                        "Gender", "Email", "Phone Number", "Father Name", "Address", "Course"}));
                    clearInputs();
                } else {
                    JOptionPane.showMessageDialog(this, "This phone number already exists");
                }

            } else {
                JOptionPane.showMessageDialog(this, "This email already exists");
            }
        }

    }//GEN-LAST:event_bAddNewActionPerformed

    private void sphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sphoneActionPerformed

    private void sidebar_coursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebar_coursesMouseClicked

        sidebar_courses.setBackground(ClickedColor);
        sidebar_student.setBackground(DefaultColor);
        sidebar_teacher.setBackground(DefaultColor);
        Cards.removeAll();
        Cards.add(courseCard);
        Cards.repaint();
        Cards.revalidate();
        menuName.setText("Courses");
    }//GEN-LAST:event_sidebar_coursesMouseClicked

    private void sidebar_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebar_studentMouseClicked

        sidebar_courses.setBackground(DefaultColor);
        sidebar_student.setBackground(ClickedColor);
        sidebar_teacher.setBackground(DefaultColor);
        Cards.removeAll();
        Cards.add(studentCard);
        Cards.repaint();
        Cards.revalidate();
        menuName.setText("Student");
    }//GEN-LAST:event_sidebar_studentMouseClicked

    private void sidebar_teacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebar_teacherMouseClicked

        sidebar_courses.setBackground(DefaultColor);
        sidebar_student.setBackground(DefaultColor);
        sidebar_teacher.setBackground(ClickedColor);
        Cards.removeAll();
        Cards.add(teacherCard);
        Cards.repaint();
        Cards.revalidate();
        menuName.setText("Teacher");
    }//GEN-LAST:event_sidebar_teacherMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            new Login_().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void sphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sphoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_sphoneKeyTyped

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        if (sSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student id");

        } else {
            sTable.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name", "Date of Birth",
                "Gender", "Email", "Phone Number", "Father Name", "Address", "Course"}));
            student.getStudentValue(sTable, sSearch.getText());

        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        if (isEmptyStudent()) {
            int id = Integer.parseInt(sname.getText());
            String name = sname.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(sdate.getDate());
            String gender = sgender.getSelectedItem().toString();
            String email = semail.getText();
            String phone = sphone.getText();
            String father = fname.getText();
            String address = saddress.getText();
            String course = (String) scourse.getSelectedItem();
            student.update(id, name, date, gender, email, phone, father, address, course);

            sTable.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name", "Date of Birth",
                "Gender", "Email", "Phone Number", "Father Name", "Address", "Course"}));
            clearInputs();
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void sTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sTableMouseClicked
        model = (DefaultTableModel) sTable.getModel();
        rowIndex = sTable.getSelectedRow();
        sid.setText(model.getValueAt(rowIndex, 0).toString());

        sname.setText(model.getValueAt(rowIndex, 1).toString());

        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 2).toString());
            sdate.setDate(date);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        semail.setText(model.getValueAt(rowIndex, 4).toString());
        sphone.setText(model.getValueAt(rowIndex, 5).toString());

        saddress.setText(model.getValueAt(rowIndex, 7).toString());
        fname.setText(model.getValueAt(rowIndex, 6).toString());

        String gender = model.getValueAt(rowIndex, 3).toString();
        if (gender.equals("Male")) {
            sgender.setSelectedIndex(0);
        } else if (gender.equals("Female")) {
            sgender.setSelectedIndex(1);
        } else if (gender.equals("Other")) {
            sgender.setSelectedIndex(2);
        }

        String course = model.getValueAt(rowIndex, 8).toString();
        if (course.equals("BIT")) {
            scourse.setSelectedIndex(0);
        } else if (course.equals("BIBM")) {
            scourse.setSelectedIndex(1);
        } else if (course.equals("IMBA")) {
            scourse.setSelectedIndex(2);
        }
    }//GEN-LAST:event_sTableMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        int id = Integer.parseInt(sid.getText());
        if (student.isIdExist(id)) {
            student.delete(id);
            sTable.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name", "Date of Birth",
                "Gender", "Email", "Phone Number", "Father Name", "Address", "Course"}));
            student.getStudentValue(sTable, "");
        } else {
            JOptionPane.showMessageDialog(this, "Student id doesn't exists");
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        sTable.setModel(new DefaultTableModel(null, new Object[]{"Student ID", "Student Name", "Date of Birth",
            "Gender", "Email", "Phone Number", "Father Name", "Address", "Course"}));
        student.getStudentValue(sTable, "");
        sSearch.setText(null);

    }//GEN-LAST:event_bRefreshActionPerformed

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed

        MessageFormat header = new MessageFormat("Students Information");

        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            sTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_bPrintActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void tmoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmoduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmoduleActionPerformed

    private void taddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taddressActionPerformed

    private void bAddNewtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddNewtActionPerformed
        if (isEmptyTeacher()) {
            if (!teacher.isEmailExist(tphone.getText())) {
                if (!teacher.isPhoneExist(tphone.getText())) {
                    int id = teacher.getMax() + 1;
                    String name = tname.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(tdate.getDate());
                    String gender = tgender.getSelectedItem().toString();
                    String email = temail.getText();
                    String phone = tphone.getText();
                    String module = tmodule.getText();
                    String address = taddress.getText();
                    String course = (String) tcourse.getSelectedItem();
                    teacher.insert(id, name, date, gender, email, phone, module, address, course);
                    tTable.setModel(new DefaultTableModel(null, new Object[]{"Teacher ID", "Teacher Name", "Date of Birth",
                        "Gender", "Email", "Phone Number", "Module Name", "Address", "Course"}));
                    clearInputt();
                } else {
                    JOptionPane.showMessageDialog(this, "This phone number already exists");
                }

            } else {
                JOptionPane.showMessageDialog(this, "This email already exists");
            }

        }
    }//GEN-LAST:event_bAddNewtActionPerformed

    private void bUpdatetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdatetActionPerformed
        if (isEmptyTeacher()) {
            int id = Integer.parseInt(tname.getText());
            String name = tname.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(tdate.getDate());
            String gender = tgender.getSelectedItem().toString();
            String email = temail.getText();
            String phone = tphone.getText();
            String father = tmodule.getText();
            String address = taddress.getText();
            String course = (String) tcourse.getSelectedItem();
            teacher.update(id, name, date, gender, email, phone, father, address, course);

            tTable.setModel(new DefaultTableModel(null, new Object[]{"Teacher ID", "Teacher Name", "Date of Birth",
                "Gender", "Email", "Phone Number", "Module Name", "Address", "Course"}));
            clearInputt();
        }
    }//GEN-LAST:event_bUpdatetActionPerformed

    private void bDeletetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletetActionPerformed
        int id = Integer.parseInt(tid.getText());
        if (teacher.isIdExist(id)) {
            teacher.delete(id);
            tTable.setModel(new DefaultTableModel(null, new Object[]{"Teacher ID", "Teacher Name", "Date of Birth",
                "Gender", "Email", "Phone Number", "Module Name", "Address", "Course"}));
            teacher.getTeacherValue(tTable, "");
        } else {
            JOptionPane.showMessageDialog(this, "Teacher id doesn't exists");
        }
    }//GEN-LAST:event_bDeletetActionPerformed

    private void bPrinttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrinttActionPerformed
        MessageFormat header = new MessageFormat("Teacher Information");

        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            tTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bPrinttActionPerformed

    private void tphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneActionPerformed

    private void tphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tphoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_tphoneKeyTyped

    private void tTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTableMouseClicked
        model2 = (DefaultTableModel) tTable.getModel();
        rowIndex = tTable.getSelectedRow();
        tid.setText(model2.getValueAt(rowIndex, 0).toString());

        tname.setText(model2.getValueAt(rowIndex, 1).toString());

        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(model2.getValueAt(rowIndex, 2).toString());
            tdate.setDate(date);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        temail.setText(model2.getValueAt(rowIndex, 4).toString());
        tphone.setText(model2.getValueAt(rowIndex, 5).toString());

        taddress.setText(model2.getValueAt(rowIndex, 7).toString());
        tmodule.setText(model2.getValueAt(rowIndex, 6).toString());

        String gender = model2.getValueAt(rowIndex, 3).toString();
        if (gender.equals("Male")) {
            tgender.setSelectedIndex(0);
        } else if (gender.equals("Female")) {
            tgender.setSelectedIndex(1);
        } else if (gender.equals("Other")) {
            tgender.setSelectedIndex(2);
        }

        String course = model2.getValueAt(rowIndex, 8).toString();
        if (course.equals("BIT")) {
            tcourse.setSelectedIndex(0);
        } else if (course.equals("BIBM")) {
            tcourse.setSelectedIndex(1);
        } else if (course.equals("IMBA")) {
            tcourse.setSelectedIndex(2);
        }
    }//GEN-LAST:event_tTableMouseClicked

    private void bSearchtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchtActionPerformed
        if (tSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a teacher id");

        } else {
            tTable.setModel(new DefaultTableModel(null, new Object[]{"Teacher ID", "Teacher Name", "Date of Birth",
                "Gender", "Email", "Phone Number", "Father Name", "Address", "Course"}));
            teacher.getTeacherValue(tTable, tSearch.getText());

        }
    }//GEN-LAST:event_bSearchtActionPerformed

    private void bRefreshtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshtActionPerformed
        tTable.setModel(new DefaultTableModel(null, new Object[]{"Teacher ID", "Teacher Name", "Date of Birth",
            "Gender", "Email", "Phone Number", "Module Name", "Address", "Course"}));
        teacher.getTeacherValue(tTable, "");
        tSearch.setText(null);
    }//GEN-LAST:event_bRefreshtActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void bAddNewcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddNewcActionPerformed
        if (isEmptyCourse()) {
            int course_id = course.getMax() + 1;
            String course_name = cname.getText();
            String module_id = mid.getText();
            String module_name = mname.getText();
            course.insert(course_id, course_name, module_id, module_name);
            cTable.setModel(new DefaultTableModel(null, new Object[]{"Course ID", "Course Name", "Module ID", "Module Name"}));
//            clearInputc();
        }
    }//GEN-LAST:event_bAddNewcActionPerformed

    private void bUpdatecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdatecActionPerformed
        if (isEmptyCourse()) {
            int course_id = course.getMax() + 1;
            String course_name = cname.getText();
            String module_id = mid.getText();
            String module_name = mname.getText();
            course.update(course_id, course_name, module_id, module_name);
            cTable.setModel(new DefaultTableModel(null, new Object[]{"Course ID", "Course Name", "Module ID", "Module Name"}));
            clearInputc();
        }
    }//GEN-LAST:event_bUpdatecActionPerformed

    private void bDeletecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletecActionPerformed
        int id = Integer.parseInt(cid.getText());
        if (course.isIdExist(id)) {
            course.delete(id);
            cTable.setModel(new DefaultTableModel(null, new Object[]{"Course ID", "Course Name", "Module ID", "Module Name"}));
           course.getCourseValue(cTable, "");
        } else {
            JOptionPane.showMessageDialog(this, "Course id doesn't exists");
        }
    }//GEN-LAST:event_bDeletecActionPerformed

    private void bPrintcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintcActionPerformed
       MessageFormat header = new MessageFormat("Courses Information");

        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            cTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bPrintcActionPerformed

    private void cTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cTableMouseClicked
        model3 = (DefaultTableModel) cTable.getModel();
        rowIndex = cTable.getSelectedRow();
        cid.setText(model3.getValueAt(rowIndex, 0).toString());
        cname.setText(model3.getValueAt(rowIndex, 1).toString());
        mid.setText(model3.getValueAt(rowIndex, 2).toString());
        mname.setText(model3.getValueAt(rowIndex, 3).toString());

 
    }//GEN-LAST:event_cTableMouseClicked

    private void bSearchcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchcActionPerformed
        if (cSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a course id");

        } else {
            cTable.setModel(new DefaultTableModel(null, new Object[]{"Course ID", "Course Name", "Module ID", "Module Name"}));
            course.getCourseValue(cTable, cSearch.getText());

        }
    }//GEN-LAST:event_bSearchcActionPerformed

    private void bRefreshcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshcActionPerformed
          cTable.setModel(new DefaultTableModel(null, new Object[]{"Course ID", "Course Name", "Module ID", "Module Name"}));
        course.getCourseValue(cTable, "");
        cSearch.setText(null);
    }//GEN-LAST:event_bRefreshcActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cards;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton bAddNew;
    private javax.swing.JButton bAddNewc;
    private javax.swing.JButton bAddNewt;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bDeletec;
    private javax.swing.JButton bDeletet;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bPrintc;
    private javax.swing.JButton bPrintt;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bRefreshc;
    private javax.swing.JButton bRefresht;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bSearchc;
    private javax.swing.JButton bSearcht;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton bUpdatec;
    private javax.swing.JButton bUpdatet;
    private javax.swing.JTextField cSearch;
    private javax.swing.JTable cTable;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JPanel courseCard;
    private javax.swing.JLabel dateTime;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menuName;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mname;
    private javax.swing.JPanel panel1Student;
    private javax.swing.JPanel panel1Student1;
    private javax.swing.JPanel panel1Student2;
    private javax.swing.JPanel panel2Student;
    private javax.swing.JPanel panel2Student1;
    private javax.swing.JPanel panel2Student2;
    private javax.swing.JTextField sSearch;
    private javax.swing.JTable sTable;
    private javax.swing.JTextField saddress;
    private javax.swing.JComboBox<String> scourse;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTextField semail;
    private javax.swing.JComboBox<String> sgender;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel sidebar_courses;
    private javax.swing.JLabel sidebar_student;
    private javax.swing.JLabel sidebar_teacher;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sphone;
    private javax.swing.JPanel studentCard;
    private javax.swing.JTextField tSearch;
    private javax.swing.JTable tTable;
    private javax.swing.JTextField taddress;
    private javax.swing.JComboBox<String> tcourse;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JPanel teacherCard;
    private javax.swing.JTextField temail;
    private javax.swing.JComboBox<String> tgender;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tmodule;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tphone;
    // End of variables declaration//GEN-END:variables
}
