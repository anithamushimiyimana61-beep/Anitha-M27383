package _27383.Q3Tax;

import java.util.Scanner;

public class MainQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Employee emp = new Employee(
                    1, "Rwanda Revenue Authority", "Kigali", "info@rra.gov.rw",
                    "Income Tax", 0.15, "INC",
                    "123456789", "John Doe", "Kigali",
                    "ABC Ltd", "987654321", "0789123456",
                    "Alice Smith", 500000, "111222333"
            );

            double tax = emp.computeTax(emp.getRate(), 0); // assume 0 credits

            System.out.println("Employee: " + emp.getEmployeeName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Tax to pay: " + tax);

        } catch (TaxDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

