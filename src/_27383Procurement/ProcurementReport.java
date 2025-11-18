package _27383Procurement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

final class ProcurementReport {
    private LocalDate reportDate;
    private List<Invoice> invoices;

    public ProcurementReport() {
        this.reportDate = LocalDate.now();
        invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) { invoices.add(invoice); }

    public double calculateTotal() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getInvoiceAmount();
        }
        return total;
    }

    public void generateReport() {
        System.out.println("=== Procurement Report ===");
        System.out.println("Report Date: " + reportDate);
        for (Invoice inv : invoices) {
            System.out.println("Invoice " + inv.getInvoiceNo() + " Amount: " + inv.getInvoiceAmount());
        }
        System.out.println("Total Purchase Amount: " + calculateTotal());
    }
}
