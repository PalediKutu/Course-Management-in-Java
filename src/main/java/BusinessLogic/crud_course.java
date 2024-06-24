/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogic;


import DataAccessLayer.access;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paledi
 */
public class crud_course {
    public List<Course> ls = new ArrayList<>();
    public access ds = new access();
    
    
    public List<Course> fetch() throws SQLException {
        ResultSet rs = null;
        try {
            rs = ds.readTable();
            while (rs.next()) {
                String code = rs.getString("code");
                String name = rs.getString("name");
                String duration = rs.getString("duration");
                String description = rs.getString("description");
                

                ls.add(new Course(code, name, duration, description));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        return ls;
    }
     
 public int insertCourse(Course course) {
        return ds.course_Insert(course);
    }
 
 public int deleteStudent(int courseCode) {
        return ds.course_Delete(courseCode);
    }

    
}
