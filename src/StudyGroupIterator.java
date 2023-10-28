import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<StudentGroup> {
    private final List <StudentGroup> studentGroups;
    private int counter;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.studentGroups = studyGroup.getStudentGroups();
        counter =0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size()-1;
    }



    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        counter++;
        return studentGroups.get(--counter);
    }
}
