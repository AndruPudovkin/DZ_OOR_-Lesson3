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

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudyGroupIterator((List<StudentGroup>) this);
    }
}
