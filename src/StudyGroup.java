import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;

    public StudyGroup(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }
    public void addStudentGroup (StudentGroup studentGroup){
        studentGroups.add(studentGroup);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    @Override
    public StudyGroupIterator iterator() {
        return new StudyGroupIterator (this);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "studentGroups=" + studentGroups +
                '}';
    }
}
