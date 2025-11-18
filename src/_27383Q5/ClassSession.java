package _27383Q5;

import java.time.LocalDate;

public class ClassSession extends Student {
    private LocalDate sessionDate;
    private String topic;

    // Constructor
    public ClassSession(String studentName, int studentID, int age /*, parent params if any */,
                        LocalDate sessionDate, String topic) {
        super(studentName, studentID, age /*, parent params if any */);
        this.sessionDate = sessionDate;
        this.topic = topic;
    }

    // Getters and setters
    public LocalDate getSessionDate() { return sessionDate; }
    public void setSessionDate(LocalDate sessionDate) { this.sessionDate = sessionDate; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }
}
