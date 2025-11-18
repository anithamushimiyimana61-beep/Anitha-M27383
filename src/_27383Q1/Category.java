package _27383Q1;
import java.time.LocalDate;


public class Category extends Entity {
    private final String categoryName;
    private final String categoryCode;


    public Category(int id, LocalDate createdDate, LocalDate updatedDate, String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate);
        if (categoryName == null || categoryName.isBlank()) throw new IllegalArgumentException("categoryName required");
        if (categoryCode == null || categoryCode.length() < 3 || !categoryCode.matches("[A-Za-z0-9]+")) throw new IllegalArgumentException("categoryCode invalid");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }


    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }


    @Override
    public String toString() { return String.format("Category[name=%s, code=%s, id=%d]", categoryName, categoryCode, getId()); }
}
