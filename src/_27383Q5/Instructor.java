package _27383Q5;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    // Constructor
    public Instructor(String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone /*, parent params */) {
        super(/* pass parent params */);
        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (phone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters
    public String getInstructorName() { return instructorName; }
    public void setInstructorName(String instructorName) { this.instructorName = instructorName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
