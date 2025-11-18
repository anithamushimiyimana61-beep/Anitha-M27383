package _27383Procurement;
class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, orgName, address, contactEmail);
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+"))
            throw new IllegalArgumentException("Code must be alphanumeric and ≥3 chars");
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    // getters
    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
}
