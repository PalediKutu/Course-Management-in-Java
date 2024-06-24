/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courcemanagementsystem;

import DataAccessLayer.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paledi
 */
public class CourceManagementSystem {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Read the whole table
            
            String sql = "SELECT StudentID, name, surname FROM students";
            Connection conn = DatabaseConnection.getConnections();
          try {
              
              
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            // Loop through the result set
            while (rs.next())
            {
                System.out.println(
                rs.getString("StudentID") + "\t" +
                rs.getString("name") + "\t" +
                rs.getString("surname"));
                
            }  
            /*System.out.println("2 ns row info");
            rs.absolute(2);
            
            System.out.println(
                rs.getString(1) + "\t" +
                rs.getString(2) + "\t" +
                rs.getString(3));
            
            rs.first();*/
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(CourceManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        
        
        
    }
}
