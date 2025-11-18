package _27383Q5;

public class Student extends Instructor {
    private String studentName;
    private int studentID;
    private int age;

    // Constructor
    public Student(String studentName, int studentID, int age /*, add parent params if needed */) {
        super(/* parent params here */); // call to parent constructor
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }

    // Getters and setters
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public int getStudentID() { return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
