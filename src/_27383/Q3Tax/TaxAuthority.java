package _27383.Q3Tax;

import java.util.Scanner;

public class TaxAuthority {

    // Method to validate Tax ID
    public void validateTaxId(int taxId) throws TaxDataException {
        if (taxId <= 0) {
            throw new TaxDataException("Tax ID must be greater than zero.");
        }
    }

    // Method to validate income
    public void validateIncome(double income) throws TaxDataException {
        if (income < 0) {
            throw new TaxDataException("Income cannot be negative.");
        }
    }

    // Method to calculate tax
    public double calculateTax(double income) throws TaxDataException {
        validateIncome(income);
        double taxRate = 0.15; // Example flat tax rate
        return income * taxRate;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxAuthority authority = new TaxAuthority();

        try {
            System.out.print("Enter Tax ID: ");
            int taxId = sc.nextInt();
            authority.validateTaxId(taxId);

            System.out.print("Enter Income: ");
            double income = sc.nextDouble();
            authority.validateIncome(income);

            double tax = authority.calculateTax(income);
            System.out.println("Calculated Tax: " + tax);

        } catch (TaxDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
