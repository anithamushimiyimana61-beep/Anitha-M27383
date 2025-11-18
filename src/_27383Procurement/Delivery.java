package _27383Procurement;

import java.time.LocalDate;

public class Delivery extends PurchaseOrder { // <-- opening brace {
    private LocalDate deliveryDate;
    private String deliveredBy;

    // constructor
    public Delivery(int id, String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, LocalDate orderDate,
                    LocalDate deliveryDate, String deliveredBy) {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate);
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    // getters
    public LocalDate getDeliveryDate() { return deliveryDate; }
    public String getDeliveredBy() { return deliveredBy; }
} // <-- closing brace
