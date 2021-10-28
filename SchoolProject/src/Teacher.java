
// class to hold teach information
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

        //create constructor for Teacher class
    Teacher () {
        firstName = "";
        lastName = "";
        subject = "";

    }

    public Teacher (String firstName, String lastName, String subject) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;


//override toString to show teacher info
}
    public String toString() {
        return "\n" + "Teacher Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
    }
// getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
