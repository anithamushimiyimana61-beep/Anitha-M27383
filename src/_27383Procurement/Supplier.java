package _27383Procurement;
class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, String orgName, String address, String contactEmail,
                    String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact) {
        super(id, orgName, address, contactEmail, deptName, deptCode);
        if (!supplierTIN.matches("\\d{9}")) throw new IllegalArgumentException("TIN must be 9 digits");
        if (!contact.matches("\\d{10,15}")) throw new IllegalArgumentException("Invalid phone");
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierTIN() { return supplierTIN; }
    public String getContact() { return contact; }
}
