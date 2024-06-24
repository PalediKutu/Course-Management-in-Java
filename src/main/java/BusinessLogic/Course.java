/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogic;

/**
 *
 * @author Paledi
 */
public class Course {
 
   String courseCode;
   String courseName;
   String duration;
   String description;
   

    public Course(String courseCode, String courseName, String duration, String description) {
    this.courseCode = courseCode;
    this.courseName = courseName;
    this.duration = duration;
    this.description = description;
}
  
    public String getcourseCode() {return courseCode; }
    public String getcourseName() {return courseName;}
    public String getduration() { return duration;}
    public String getdescription() { return description;}
}
