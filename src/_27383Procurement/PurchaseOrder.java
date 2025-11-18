package _27383Procurement;

import java.time.LocalDate;

class PurchaseOrder extends Product {
    private String poNumber;
    private LocalDate orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, String orgName, String address, String contactEmail,
                         String deptName, String deptCode,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, LocalDate orderDate) {
        super(id, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity);
        if (unitPrice * quantity <= 0) throw new IllegalArgumentException("Total must be > 0");
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = getTotalPrice();
    }

    public double getTotalAmount() { return totalAmount; }
    public String getPoNumber() { return poNumber; }
    public LocalDate getOrderDate() { return orderDate; }
}
