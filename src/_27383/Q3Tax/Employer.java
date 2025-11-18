package _27383.Q3Tax;

import java.util.Scanner;

public class Employer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Employee details
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Employee TIN: ");
            String empTIN = sc.nextLine();

            Employee emp = new Employee(empId, empName, empTIN);

            // Tax Declaration
            System.out.print("Enter Employee Income: ");
            double income = sc.nextDouble();

            TaxDeclaration declaration = new TaxDeclaration(emp, income);

            // Tax Calculation
            TaxAuthority authority = new TaxAuthority();
            double tax = authority.calculateTax(income);

            // Display Information
            System.out.println("\n=== Employee Tax Report ===");
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("TIN: " + emp.getTIN());
            System.out.println("Income: " + income);
            System.out.println("Calculated Tax: " + tax);

        } catch (TaxDataException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
