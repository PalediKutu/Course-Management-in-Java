/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataAccessLayer;

import BusinessLogic.Course;

import java.sql.ResultSet;

/**
 *
 * @author Paledi
 */
public interface course {
    int course_Insert(Course course);
    int course_Delete(int courseCode);
    ResultSet readTable();
    
    
}
