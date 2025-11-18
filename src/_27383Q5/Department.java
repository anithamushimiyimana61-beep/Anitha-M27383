package _27383Q5;
public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String institutionName, String code, String address, String deptName, String deptHead) {
        super(id, institutionName, code, address);
        if (deptName.isEmpty() || deptHead.isEmpty()) throw new IllegalArgumentException("Fields cannot be empty");
        this.departmentName = deptName;
        this.departmentHead = deptHead;
    }

    // Getters and setters

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }
}
