import java.time.LocalDate;

public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate DateOfBirtht;

    public Person(String firstName, String lastName, LocalDate dateOfBirtht) {
        FirstName = firstName;
        LastName = lastName;
        DateOfBirtht = dateOfBirtht;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateOfBirtht() {
        return DateOfBirtht;
    }

    public void setDateOfBirtht(LocalDate dateOfBirtht) {
        DateOfBirtht = dateOfBirtht;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DateOfBirtht=" + DateOfBirtht +
                '}';
    }
}
