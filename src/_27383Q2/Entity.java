package _27383Q2;
import java.time.LocalDate;

public class Entity {
    private final int id;
    private final LocalDate createdDate;
    private LocalDate updatedDate;


    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }


    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDate date) { this.updatedDate = date; }


    @Override
    public String toString() {
        return "Entity[id="+id+", created="+createdDate+", updated="+updatedDate+"]";
    }
}
