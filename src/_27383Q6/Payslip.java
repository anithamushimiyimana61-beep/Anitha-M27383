package _27383Q6;

import java.time.LocalDate;

final class Payslip extends Payroll {
    private int payslipNumber;
    private LocalDate issueDate;

    public Payslip(int id, LocalDate createdDate, LocalDate updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDate startDate, LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   int payslipNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public void generatePayslip() {
        System.out.println("=== PAYSLIP ===");
        System.out.println("Payslip No: " + payslipNumber + " | Issue Date: " + issueDate);
        System.out.println("Employee: " + getFullName() + " | ID: " + getEmployeeID() + " | Position: " + getPosition());
        System.out.println("Department: " + getDeptName() + " | Manager: " + getManagerName());
        System.out.println("Organization: " + getOrgName() + " | RSSB: " + getRssbNumber());
        System.out.println("Payroll Period: " + getMonth() + "/" + getYear());
        System.out.println("Basic Pay: " + getBasicPay());
        System.out.println("Transport Allowance: " + getTransportAllowance());
        System.out.println("Housing Allowance: " + getHousingAllowance());
        System.out.println("Overtime: " + getOvertimeHours() + " hrs x " + getOvertimeRate() + " = " + (getOvertimeHours()*getOvertimeRate()));
        System.out.println("Bonus: " + getBonus());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("--- Deductions ---");
        System.out.println("RSSB Contribution: " + getRssbContribution());
        System.out.println("PAYE Tax: " + getPayeTax());
        System.out.println("Loan Deduction: " + getLoanDeduction());
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Net Salary: " + netSalary);
    }
}