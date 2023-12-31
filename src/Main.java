import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("1", "1", "1", 1);
        Student student2 = new Student("2", "2", "2", 2);
        Student student3 = new Student("3", "3", "3", 3);
        Student student4 = new Student("4", "4", "4", 4);
        Student student5 = new Student("5", "5", "5", 5);
        Student student6 = new Student("6", "6", "6", 6);
        Teacher teacher1 = new Teacher("t1", "t1", "t1", 1);
        Teacher teacher2 = new Teacher("t2", "t2", "t2", 2);

        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();

        StudentGroup studentGroup1 = new StudentGroup(studentList1, teacher1, 1);
        StudentGroup studentGroup2 = new StudentGroup(studentList2, teacher2, 2);
        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(student2);
        studentGroup1.addStudent(student3);
        studentGroup2.addStudent(student4);
        studentGroup2.addStudent(student5);
        studentGroup2.addStudent(student6);

        List<StudentGroup> studentGroupList = new ArrayList<>();
        StudyGroup study = new StudyGroup(studentGroupList);
        study.addStudentGroup(studentGroup1);
        study.addStudentGroup(studentGroup2);


        for (StudentGroup item: study) {
            System.out.println(item);
        }
    }
}