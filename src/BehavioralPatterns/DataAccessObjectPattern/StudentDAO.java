package BehavioralPatterns.DataAccessObjectPattern;

import java.util.List;

public interface StudentDAO {
public List<Student> getALLStudents();
public Student getStudent(int ogrNO);
public void updateStudent(Student student);
public void deleteStudent(Student student);

}
