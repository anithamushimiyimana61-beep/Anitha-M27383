package _27383.Q3Tax;

public class Employee {
    private String name;
    private String TIN;  // Tax Identification Number
    private int employeeId;

    public Employee(int employeeId, String name, String TIN) {
        this.employeeId = employeeId;
        this.name = name;
        this.TIN = TIN;
    }

    // Getters
    public String getName() { return name; }
    public String getTIN() { return TIN; }
    public int getEmployeeId() { return employeeId; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setTIN(String TIN) { this.TIN = TIN; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
}
