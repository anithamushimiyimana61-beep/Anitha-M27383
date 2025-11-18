package _27383Q5;

public class AttendanceRecord extends ClassSession {
    private int studentID;
    private int sessionID;
    private String status; // "Present" or "Absent"

    // Constructor
    public AttendanceRecord(int studentID, int sessionID, String status /*, parent params */) {
        super(/* parent params */); // call ClassSession constructor
        if (!status.equals("Present") && !status.equals("Absent")) {
            throw new IllegalArgumentException("Status must be Present/Absent");
        }
        this.studentID = studentID;
        this.sessionID = sessionID;
        this.status = status;
    }

    // Getters and setters
    public int getStudentID() { return studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID; }

    public int getSessionID() { return sessionID; }
    public void setSessionID(int sessionID) { this.sessionID = sessionID; }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (!status.equals("Present") && !status.equals("Absent")) {
            throw new IllegalArgumentException("Status must be Present/Absent");
        }
        this.status = status;
    }
}
