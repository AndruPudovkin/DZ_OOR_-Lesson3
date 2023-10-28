import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int counter;

    public StudyGroupIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        counter =0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size()-1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
            return null;
        return studentGroups.get(counter);
    }
}
