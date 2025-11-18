package _27383Q1;

import java.time.LocalDate;

public final class StockReport extends Entity {

    private final LocalDate reportDate;
    private final String description;

    private Inventory inventory;   // set from Mainn

    public StockReport(int id, LocalDate createdDate, LocalDate updatedDate,
                       LocalDate reportDate, String description) {

        super(id, createdDate, updatedDate);

        if (reportDate == null)
            throw new IllegalArgumentException("Report date cannot be null");

        if (description == null || description.isBlank())
            throw new IllegalArgumentException("Description cannot be empty");

        this.reportDate = reportDate;
        this.description = description;
    }

    public void setInventory(Inventory inventory) {
        if (inventory == null)
            throw new IllegalArgumentException("Inventory cannot be null");

        this.inventory = inventory;
    }

    public void generateReport() {

        if (inventory == null)
            throw new IllegalStateException("Inventory not assigned!");

        System.out.println("\n===== STOCK REPORT (ID:27383) =====");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Description: " + description);

        System.out.println("\n-- STOCK ITEMS --");
        for (StockItem si : inventory.getStockItems()) {
            System.out.println(si);
        }

        System.out.println("\n-- PURCHASES --");
        for (Purchase p : inventory.getPurchases()) {
            System.out.println(p);
        }

        System.out.println("\n-- SALES --");
        for (Sale s : inventory.getSales()) {
            System.out.println(s);
        }

        int totalQty = inventory.getStockItems()
                .stream()
                .mapToInt(StockItem::getQuantityAvailable)
                .sum();

        System.out.println("\nTotal Quantity in Stock: " + totalQty);
        System.out.println("===== END OF REPORT (ID:27383) =====\n");
    }

    @Override
    public String toString() {
        return "StockReport{" +
                "reportDate=" + reportDate +
                ", description='" + description + '\'' +
                ", id=" + getId() +
                '}';
    }
}
