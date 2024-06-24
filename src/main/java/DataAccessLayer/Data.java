/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataAccessLayer;

import BusinessLogic.Course;
import BusinessLogic.Students;
import java.sql.ResultSet;

/**
 *
 * @author Paledi
 */
public interface Data {
    ResultSet readTable();
    int students_Insert(Students students);
    int students_Delete(int studentID);
   
    
   
}
