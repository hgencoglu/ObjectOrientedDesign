package BehavioralPatterns.DataAccessObjectPattern;

public class Client {

    public static void main(String[] args) {
        StudentDAO sdao =new StudentManaging();
        for(Student student: sdao.getALLStudents()){
            System.out.println("Öğrenci No: "+student.getOgrNo()+
                    " Öğrenci Ad-Soyad: "+ student.getAdSoyad());
        }

        Student student = sdao.getALLStudents().get(0);
        student.setAdSoyad("Ahmet");;
        sdao.updateStudent(student);


        sdao.getStudent(student.getOgrNo());
        System.out.println(student.getOgrNo()+" "+student.getAdSoyad());

        for(Student student2: sdao.getALLStudents()){
            System.out.println("Öğrenci No: "+student2.getOgrNo()+
                    " Öğrenci Ad-Soyad: "+ student2.getAdSoyad());
        }
    }
}
