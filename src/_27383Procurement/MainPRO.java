package _27383Procurement;

import java.util.Scanner;

public class MainPRO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Organization details:");
        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String orgName = sc.nextLine();
        System.out.print("Address: "); String address = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();

        System.out.println("Enter Department details:");
        System.out.print("Dept Name: "); String deptName = sc.nextLine();
        System.out.print("Dept Code: "); String deptCode = sc.nextLine();

        System.out.println("Enter Supplier details:");
        System.out.print("Supplier Name: "); String supplierName = sc.nextLine();
        System.out.print("Supplier TIN: "); String supplierTIN = sc.nextLine();
        System.out.print("Contact: "); String contact = sc.nextLine();

        System.out.println("Enter Product details:");
        System.out.print("Product Name: "); String productName = sc.nextLine();
        System.out.print("Unit Price: "); double unitPrice = sc.nextDouble();
        System.out.print("Quantity: "); int qty = sc.nextInt(); sc.nextLine();

        System.out.println("Enter Purchase Order details:");
        System.out.print("PO Number: "); String poNumber = sc.nextLine();
        LocalDate orderDate = LocalDate.now();

        System.out.println("Enter Delivery details:");
        System.out.print("Delivered By: "); String deliveredBy = sc.nextLine();
        LocalDate deliveryDate = LocalDate.now();

        System.out.println("Enter Inspection details:");
        System.out.print("Inspector Name: "); String inspectorName = sc.nextLine();
        System.out.print("Status (Passed/Failed): "); String status = sc.nextLine();
        System.out.print("Remarks: "); String remarks = sc.nextLine();

        System.out.println("Enter Invoice details:");
        System.out.print("Invoice No: "); String invoiceNo = sc.nextLine();
        System.out.print("Invoice Amount: "); double invoiceAmount = sc.nextDouble();

        Invoice invoice = new Invoice(id, orgName, address, email,
                deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, qty,
                poNumber, orderDate,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks,
                invoiceNo, invoiceAmount);

        ProcurementReport report = new ProcurementReport();
        report.addInvoice(invoice);

        report.generateReport();
        sc.close();
    }
}




