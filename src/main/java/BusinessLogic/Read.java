package BusinessLogic;

import DataAccessLayer.dataAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public List<Students> ls = new ArrayList<>();
    public dataAccess ds = new dataAccess();

    public List<Students> fetch() throws SQLException {
        ResultSet rs = null;
        try {
            rs = ds.readTable();
            while (rs.next()) {
                String stID = rs.getString("StudentID");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String gender = rs.getString("gender");
                String course = rs.getString("course");

                ls.add(new Students(stID, name, surname, gender, course));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        return ls;
    }

    public int insertStudents(Students student) {
        return ds.students_Insert(student);
    }

    public int deleteStudent(int studentID) {
        return ds.students_Delete(studentID);
    }

   
}
