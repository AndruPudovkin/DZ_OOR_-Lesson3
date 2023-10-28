public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstName, String secodName, String lastName, int teacherId) {
        super(firstName, secodName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "studentId=" + teacherId +
                '}';
    }
}
