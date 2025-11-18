package _27383Q6;

import java.time.LocalDate;

class Payroll extends Allowance {
    protected double grossSalary, totalDeductions, netSalary;

    public Payroll(int id, LocalDate createdDate, LocalDate updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, LocalDate startDate, LocalDate endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance,
                payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);

        this.grossSalary = basicPay + transportAllowance + housingAllowance + (overtimeHours * overtimeRate) + bonus;
        this.totalDeductions = getRssbContribution() + payeTax + loanDeduction;
        this.netSalary = grossSalary - totalDeductions;
    }
}
