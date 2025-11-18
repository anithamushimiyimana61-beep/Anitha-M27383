package _27383Q5;

import java.time.LocalDate;

public final class AttendanceSummary extends LeaveRequest {
    private LocalDate reportDate;
    private int totalPresent;
    private int totalAbsent;

    // Constructor
    public AttendanceSummary(int studentID, int sessionID, String status,
                             LocalDate requestDate, String reason, boolean approved,
                             LocalDate reportDate, int totalPresent, int totalAbsent) {
        super(studentID, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    // Method: Attendance %
    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        if (totalSessions == 0) return 0.0;
        return (totalPresent * 100.0) / totalSessions;
    }

    public void printSummary() {
        System.out.println("Report Date: " + reportDate);
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Attendance Percentage: " + generateSummary() + "%");
    }

    // Getters (optional)


    public LocalDate getReportDate() {
        return reportDate;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }
}
