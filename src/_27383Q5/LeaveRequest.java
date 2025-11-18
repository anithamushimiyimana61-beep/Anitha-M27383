package _27383Q5;

import java.time.LocalDate;

public class LeaveRequest extends AttendanceRecord {
    private LocalDate requestDate;
    private String reason;
    private boolean approved;

    // Constructor
    public LeaveRequest(int studentID, int sessionID, String status,
                        LocalDate requestDate, String reason, boolean approved /*, parent params */) {
        super(studentID, sessionID, status /*, parent params */); // call parent constructor
        if (reason == null || reason.isEmpty()) {
            throw new IllegalArgumentException("Reason cannot be empty");
        }
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }

    // Getters and setters
    public LocalDate getRequestDate() { return requestDate; }
    public void setRequestDate(LocalDate requestDate) { this.requestDate = requestDate; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public boolean isApproved() { return approved; }
    public void setApproved(boolean approved) { this.approved = approved; }
}
