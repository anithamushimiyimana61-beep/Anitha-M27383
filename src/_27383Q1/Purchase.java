package _27383Q1;

import java.time.LocalDate;

public class Purchase extends Entity {

    private final LocalDate purchaseDate;
    private final int quantityPurchased;
    private final Supplier supplier;

    public Purchase(int id, LocalDate createdDate, LocalDate updatedDate,
                    LocalDate purchaseDate, int quantityPurchased, Supplier supplier) {

        super(id, createdDate, updatedDate);

        if (purchaseDate == null)
            throw new IllegalArgumentException("Purchase date cannot be null");

        if (quantityPurchased <= 0)
            throw new IllegalArgumentException("Purchased quantity must be greater than 0");

        if (supplier == null)
            throw new IllegalArgumentException("Supplier cannot be null");

        this.purchaseDate = purchaseDate;
        this.quantityPurchased = quantityPurchased;
        this.supplier = supplier;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseDate=" + purchaseDate +
                ", quantityPurchased=" + quantityPurchased +
                ", supplier=" + supplier +
                ", id=" + getId() +
                '}';
    }
}

