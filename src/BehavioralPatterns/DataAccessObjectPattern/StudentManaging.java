package BehavioralPatterns.DataAccessObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentManaging implements StudentDAO{

    List<Student> studentList;

    public StudentManaging(){
        studentList = new ArrayList<Student>();
        Student student1=new Student("Hakan Gençoğlu",1);
        Student student2 = new Student("Gökhan Doğdaş",2);
        studentList.add(student1);
        studentList.add(student2);
    }


    @Override
    public List<Student> getALLStudents() {
        return studentList;
    }

    @Override
    public Student getStudent(int listeNO) {
        return studentList.get(listeNO);
    }

    @Override
    public void updateStudent(Student student) {
        studentList.get(student.getOgrNo()).setAdSoyad(student.getAdSoyad());
        System.out.println(student.getOgrNo()
                + " numaralı öğrencinin bilgileri güncellendi!");
    }

    @Override
    public void deleteStudent(Student student) {
        studentList.remove(student.getOgrNo());
        System.out.println(student.getOgrNo()
                +" numaralı öğrenci listeden çıkrıldı");
    }
}
