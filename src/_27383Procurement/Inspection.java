package _27383Procurement;

import java.time.LocalDate;

class Inspection extends Delivery {
    private String inspectorName;
    private String status; // Passed/Failed
    private String remarks;

    public Inspection(int id, String orgName, String address, String contactEmail,
                      String deptName, String deptCode,
                      String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, LocalDate orderDate,
                      LocalDate deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, orgName, address, contactEmail, deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate,
                deliveryDate, deliveredBy);
        if (!status.equalsIgnoreCase("Passed") && !status.equalsIgnoreCase("Failed"))
            throw new IllegalArgumentException("Status must be Passed/Failed");
        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }

    public String getInspectorName() { return inspectorName; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }
}