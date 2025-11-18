package _27383Q1;

import java.time.LocalDate;

public class Entity1 {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;

    public Entity1(int id, LocalDate createdDate, LocalDate updatedDate) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be > 0");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }
}
