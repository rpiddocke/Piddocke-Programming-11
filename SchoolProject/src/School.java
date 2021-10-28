import java.util.ArrayList;

//class to hold school information including lists of Students, Teachers and Courses
public class School {

    // Declare variables - although Java wants to make these ArrayLists static they need to be instance variables (without data type) so that they each hold different values for each school object
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    private int noOfClassrooms = 0;
    private String schoolName = "";
    private int noOfStudents = 0;

    //create constructor for School class
    School () {
        schoolName = "";
        noOfClassrooms = 0;
        noOfStudents = 0;
    }

    public School (int noOfClassrooms, String schoolName) {
        this.noOfClassrooms = noOfClassrooms;
        this.schoolName = schoolName;
    }

    //method to add teachers to the list
    public boolean addTeacher( Teacher newTeacher ) {
        teachers.add( newTeacher );
        return true;
    }

    //method to add students to the list
    public boolean addStudent( Student newStudent ) {
        students.add( newStudent );
        return true;
    }

    //method to remove teachers from the list
    public boolean removeTeacher( Teacher oldTeacher ) {
        teachers.remove( oldTeacher );
        return true;
    }

    //method to remove students from the list
    public boolean removeStudent( Student oldStudent ) {
        students.remove( oldStudent );
        return true;
    }

    //method to show all teachers
    public String showTeachers(){
        return "Teachers: " + teachers;
    }

    //method to show all students
    public String showStudents(){
        return "Students: " + students;
    }

    //override toString to show school data. Also shows number of students in the students list.
    public String toString() {
        return "School: " + this.schoolName + " Classrooms:" + this.noOfClassrooms + " Students: " + students.size();
    }

    //Getters and Setters
    public int getNoOfClassrooms() {
        return noOfClassrooms;
    }

    public void setNoOfClassrooms(int noOfClassrooms) {
        this.noOfClassrooms = noOfClassrooms;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
}
