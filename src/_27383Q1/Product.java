package _27383Q1;
import java.time.LocalDate;


public class Product extends Entity {
    private final String productName;
    private final double unitPrice;
    private final int stockLimit;


    public Product(int id, LocalDate createdDate, LocalDate updatedDate, String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate);
        if (productName == null || productName.isBlank()) throw new IllegalArgumentException("productName required");
        if (unitPrice <= 0) throw new IllegalArgumentException("unitPrice must be > 0");
        if (stockLimit < 0) throw new IllegalArgumentException("stockLimit must be >= 0");
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }


    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockLimit() { return stockLimit; }


    @Override
    public String toString() { return String.format("Product[name=%s, unitPrice=%.2f, stockLimit=%d, id=%d]", productName, unitPrice, stockLimit, getId()); }
}

