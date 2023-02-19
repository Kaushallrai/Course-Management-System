package primary;

import dataBase.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Teacher {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(id) from teacher");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;
    }

    public void insert(int id, String name,
            String date, String gender, String email, String phone, String module, String address, String course) {
        String sql = "insert into teacher values(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, date);
            ps.setString(4, gender);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, module);
            ps.setString(8, address);
            ps.setString(9, course);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New Teacher added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isPhoneExist(String phone) {

        try {
            ps = con.prepareStatement("select * from teacher where phone=?");
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
     public boolean isEmailExist(String email) {

        try {
            ps = con.prepareStatement("select * from teacher where email=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
      public boolean isIdExist(int id) {

        try {
            ps = con.prepareStatement("select * from teacher where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }


    

    public void getTeacherValue(JTable table, String searchValue) {
        try {
            String sql = "select *from teacher where concat(name,email,phone) like? order by id desc";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model2 = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[11];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                model2.addRow(row);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void update(int id, String name, String date, String gender, String email, String phone, String module, String address, String course) {
    String sql = "update teacher set name=?,date_of_birth=?,gender=?,email=?,phone=?,module_name=?,address=?,course=? where id=?";
    
    try{
        ps  = con.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,date);
        ps.setString(3,gender);
        ps.setString(4,email);
        ps.setString(5,phone);
        ps.setString(6,module);
        ps.setString(7,address);
        ps.setString(8,course);
        ps.setInt(9,id);
    
        if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "Teacher Data updated successfully");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void delete(int id){
   
    int yesNo= JOptionPane.showConfirmDialog(null, "Course and records will also be deleted","Teacher Delete",JOptionPane.OK_CANCEL_OPTION,0);
    if(yesNo==JOptionPane.OK_OPTION){
        try {
            ps=con.prepareStatement("delete from teacher where id=?");
       
    ps.setInt(1, id);
    if(ps.executeUpdate()>0){
         JOptionPane.showMessageDialog(null, "Teacher deleted successfully");
    } } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
}



