package _27383Q1;
import java.time.LocalDate;

public class Supplier extends Entity {
    private final String supplierName;
    private final String supplierEmail;
    private final String supplierPhone;


    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate, String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate);
        if (supplierName == null || supplierName.isBlank()) throw new IllegalArgumentException("supplierName required");
        if (supplierEmail == null || !supplierEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("invalid supplierEmail");
        if (supplierPhone == null || !supplierPhone.matches("/d{10}")) throw new IllegalArgumentException("supplierPhone must be 10 digits");
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }


    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }


    @Override
    public String toString() { return String.format("Supplier[name=%s, email=%s, phone=%s, id=%d]", supplierName, supplierEmail, supplierPhone, getId()); }
}