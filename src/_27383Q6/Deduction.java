package _27383Q6;

class Deduction extends SalaryStructure {
    private double rssbContribution, payeTax, loanDeduction;

    public Deduction(int id, LocalDate createdDate, LocalDate updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, LocalDate startDate, LocalDate endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        if (payeTax < 0 || loanDeduction < 0)
            throw new IllegalArgumentException("Deductions ≥ 0");
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
        this.rssbContribution = 0.05 * basicPay; // 5% of basic pay
    }

    public double getRssbContribution() { return rssbContribution; }
    public double getPayeTax() { return payeTax; }
    public double getLoanDeduction() { return loanDeduction; }
}
