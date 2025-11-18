package _27383.Q3Tax;

public class TaxDeclaration {
    private Employee employee;
    private double income;

    public TaxDeclaration(Employee employee, double income) {
        this.employee = employee;
        this.income = income;
    }

    public void displayInfo() {
        System.out.println("Employee: " + employee.getName());
        System.out.println("TIN: " + employee.getTIN());
        System.out.println("Income: " + income);
    }
}
