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

public class Course {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(id) from course");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;
    }

    public void insert(int cid, String cname, String mid, String mname
    ) {
        String sql = "insert into course values(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cid);
            ps.setString(2, cname);
            ps.setString(3, mid);
            ps.setString(4, mname);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New Course added successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isIdExist(int id) {

        try {
            ps = con.prepareStatement("select * from course where id=?");
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

    public void getCourseValue(JTable table, String searchValue) {
        try {
            String sql = "select * from course where concat(course_name,module_id,module_name) like? order by course_id desc";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model3 = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[11];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                model3.addRow(row);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int cid, String cname, String mid, String mname) {
        String sql = "update course set course_name=?,module_id=?,module_name=? where course_id=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cname);
            ps.setString(2, mid);
            ps.setString(3, mname);
            ps.setInt(4, cid);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Course Data updated successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {

        int yesNo = JOptionPane.showConfirmDialog(null, "Course and modules will also be deleted", "Course Delete", JOptionPane.OK_CANCEL_OPTION, 0);
        if (yesNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete from course where course_id=?");

                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Course deleted successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
