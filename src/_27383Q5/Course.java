package _27383Q5;
public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(int id, String institutionName, String code, String address, String deptName, String deptHead,
                  String courseName, String courseCode, int credits) {
        super(id, institutionName, code, address, deptName, deptHead);
        if (credits <= 0) throw new IllegalArgumentException("Credits must be > 0");
        if (courseCode.isEmpty() || courseName.isEmpty()) throw new IllegalArgumentException("Fields cannot be empty");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    // Getters and setters

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
