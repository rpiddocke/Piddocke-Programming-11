
    //Main class to run program and display data
public class Main {
    public static void main(String[] args) {

        //Create two new school objects called JO and Tupper
        School JO = new School(2,"JO");
        School Tupper = new School(1,"Tupper");

        //create 10 students
        Student Pavel = new Student("Pavel", "Piddocke", "A");
        Student AJ = new Student("AJ", "Bumble", "C");
        Student Duncan = new Student("Duncan", "Callaghan", "B");
        Student Gavin = new Student("Gavin", "Wong", "A");
        Student Edwin = new Student("Edwin", "Wong", "C");
        Student Joanna = new Student("Joanna", "Piddocke", "B");
        Student Bobby = new Student("Bobby", "Newhouse", "A");
        Student Teebone = new Student("Teebone", "Jackson", "C");
        Student Doncho = new Student("Doncho", "Donev", "F");
        Student Luca = new Student("Luca", "Breiddal", "F");

        //create 3 teachers
        Teacher Laumen = new Teacher("T.", "Laumen", "Math");
        Teacher Lee = new Teacher("S.", "Lee", "Socials");
        Teacher Lau = new Teacher("I.", "Lau", "Science");


        //add 10 students - 7 to JO and 3 to Tupper
        JO.addStudent(Pavel);
        JO.addStudent(AJ);
        Tupper.addStudent(Duncan);
        Tupper.addStudent(Gavin);
        Tupper.addStudent(Edwin);
        JO.addStudent(Joanna);
        JO.addStudent(Bobby);
        JO.addStudent(Teebone);
        JO.addStudent(Doncho);
        JO.addStudent(Luca);


        //add 3 teachers, 2 to JO and 1 to Tupper
        JO.addTeacher(Laumen);
        JO.addTeacher(Lee);
        Tupper.addTeacher(Lau);


        //print out each school after additions
        System.out.println(JO);
        System.out.println(JO.showTeachers());
        System.out.println(JO.showStudents());
        System.out.println();

        System.out.println(Tupper);
        System.out.println(Tupper.showTeachers());
        System.out.println(Tupper.showStudents());
        System.out.println();
        //remove 2 students
        JO.removeStudent(Doncho);
        Tupper.removeStudent(Gavin);

        //remove 1 teachers
        JO.removeTeacher(Laumen);

        //print out after removals
        System.out.println("Remove 2 students, 1 teacher...");
        System.out.println(JO);
        System.out.println(JO.showTeachers());
        System.out.println(JO.showStudents());
        System.out.println();

        System.out.println(Tupper);
        System.out.println(Tupper.showTeachers());
        System.out.println(Tupper.showStudents());
        System.out.println();
    }
}
