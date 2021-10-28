// class to hold student information
public class Student {
    private String firstName;
    private String lastName;
    private String grade;
    static int studentNumber = 1;
    private int studNum;

    // create class constructor for teh student class
    Student () {
        firstName = "";
        lastName = "";
        grade = "";
        studNum = studentNumber;
    }
//set values for student objects passed from main, increment student number
    Student (String firstName, String lastName, String grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studNum = studentNumber++;
    }
    //override toString to show student info
    public String toString() {
        return "\n" + "Student #" + this.studNum + " Name: " + this.firstName + " " + this.lastName + ", Grade: " + this.grade;
    }


//getters and setter methods
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getStudNum() {
        return studNum;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }
}
