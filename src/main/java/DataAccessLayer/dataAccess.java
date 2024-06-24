/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessLayer;


import BusinessLogic.Students;
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
public class dataAccess implements Data {
    ResultSet rs;
    Connection conn = DatabaseConnection.getConnections();
    PreparedStatement pstmt;
    int rowsInserted;

    @Override
    public ResultSet readTable() {
        try {
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    @Override
    public int students_Insert(Students students) {
        int rowsInserted = 0;
        try {
            String sql = "INSERT INTO students (StudentID, name, surname, gender, course) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, students.getstdId());
            pstmt.setString(2, students.getstudentName());
            pstmt.setString(3, students.getstudentSurname());
            pstmt.setString(4, students.getgender());
            pstmt.setString(5, students.getcourse());
            rowsInserted = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }

    @Override
    public int students_Delete(int studentID) {
        int rowsDeleted = 0;
        try {
            String sql = "DELETE FROM students WHERE StudentID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, studentID);
            rowsDeleted = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsDeleted;
    }

  /*  @Override
    public int students_Update(Students students) {
        int rowsUpdated = 0;
        try {
            String sql = "UPDATE students SET name = ?, surname = ?, gender = ?, course = ? WHERE StudentID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, students.getstudentName());
            pstmt.setString(2, students.getstudentSurname());
            pstmt.setString(3, students.getgender());
            pstmt.setString(4, students.getcourse());
            pstmt.setInt(5, students.getstdId());
            rowsUpdated = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsUpdated;
    }
    */
    
}

    
    
    




    

    
        
        
        
        
        

