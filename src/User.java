public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secodName, String lastName) {
        this.firstName = firstName;
        this.secondName = secodName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
}
