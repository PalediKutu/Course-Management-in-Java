/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogic;

/**
 *
 * @author Paledi
 */
public class Students {
    
   int stdId;
   String studentName;
   String studentSurname;
   String gender;
   String course;
   

    public Students(String id, String studentName, String studentSurname, String gender, String course) {
    this.stdId = Integer.parseInt(id);
    this.studentName = studentName;
    this.studentSurname = studentSurname;
    this.gender = gender;
    this.course = course;
}

     
    public int getstdId() {return stdId;}
    public String getstudentName() {return studentName; }
    public String getstudentSurname() {return studentSurname;}
    public String getgender() { return gender;}
    public String getcourse() { return course;}

    

    
    
    
    
    
}
