public class Student extends User{
    private int studentId;

    public Student(String firstName, String secodName, String lastName, int studentId) {
        super(firstName, secodName, lastName);
        this.studentId = studentId;
    }


    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return  "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "studentId=" + studentId +
                '}';
    }
}
