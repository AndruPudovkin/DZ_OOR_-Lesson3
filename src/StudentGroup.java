import java.util.List;

public class StudentGroup {
    private List<Student> studentList;
    private Teacher teacher;
    private int groupId;

    public StudentGroup(List<Student> studentList, Teacher teacher, int groupId) {
        this.studentList = studentList;
        this.teacher = teacher;
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher =teacher;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public String toString() {
        return "StudentCroup{" +
                "studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }
}
