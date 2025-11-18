package _27383Q6;

import java.time.LocalDate;

class Department extends Organization {
    private String deptName, deptCode, managerName;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptCode.length() < 3 || deptName.isEmpty() || managerName.isEmpty())
            throw new IllegalArgumentException("Invalid department data");
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }
}
