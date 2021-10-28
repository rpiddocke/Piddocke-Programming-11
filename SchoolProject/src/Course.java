
    //Class to hold course information
public class Course {
    private String courseName;
    private String teacher;
    private int noOfStudents;

    //create constructor for Course class
     Course () {
        noOfStudents = 0;
        courseName = "";
        teacher = "";
    }

    Course (String courseName, String teacher, int noOfStudents){
        this.courseName = courseName;
        this.teacher = teacher;
        this.noOfStudents = noOfStudents;
    }
        //override toString to show course info
    public String toString() {
        return "Course Name: " + this.courseName + " Teacher: " + this.teacher
                + " Number of Students: " + this.noOfStudents;
    }


    //Getters and Setters
    public String getCourseName() {
        return courseName;}

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
}
