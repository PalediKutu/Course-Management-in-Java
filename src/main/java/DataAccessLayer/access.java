/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessLayer;

import BusinessLogic.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paledi
 */
public class access implements course {
    ResultSet rs;
    Connection conn = DatabaseConnection.getConnections();
    PreparedStatement pstmt;
    int rowsInserted;

    @Override
    public  int course_Insert(Course course) {
     
         int rowsInserted = 0;
        try {
            String sql = "INSERT INTO course (code, name, duration, description) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, course.getcourseCode());
            pstmt.setString(2, course.getcourseName());
            pstmt.setString(3, course.getduration());
            pstmt.setString(4, course.getdescription());
            
            rowsInserted = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(access.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;

    }

    @Override
    public ResultSet readTable() {
        try {
            String sql = "SELECT * FROM course";
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(access.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    @Override
    public int course_Delete(int courseCode) {
        int rowsDeleted = 0;
        try {
            String sql = "DELETE FROM course WHERE code = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, courseCode);
            rowsDeleted = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsDeleted;
        
        
    }
        
    }

   
    

