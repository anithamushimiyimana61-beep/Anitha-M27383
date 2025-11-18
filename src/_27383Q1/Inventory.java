package _27383Q1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Inventory extends Entity1 {
    private final List<StockItem> stockItems = new ArrayList<>();
    private final List<Purchase> purchases = new ArrayList<>();
    private final List<Sale> sales = new ArrayList<>();


    public Inventory(int id, LocalDate createdDate, LocalDate updatedDate) { super(id, createdDate, updatedDate); }


    public void addStockItem(StockItem item) { if (item!=null) stockItems.add(item); }
    public void addPurchase(Purchase p) { if (p!=null) purchases.add(p); }
    public void addSale(Sale s) { if (s!=null) sales.add(s); }


    public int getTotalItems() { return stockItems.stream().mapToInt(StockItem::getQuantityAvailable).sum(); }
    public double getStockValue() { return stockItems.stream().mapToDouble(si -> si.getQuantityAvailable() * si.getProduct().getUnitPrice()).sum(); }
    public int getTotalPurchased() { return purchases.stream().mapToInt(Purchase::getPurchasedQuantity).sum(); }
    public int getTotalSold() { return sales.stream().mapToInt(Sale::getSoldQuantity).sum(); }


    @Override
    public String toString() { return String.format("Inventory[items=%d, value=%.2f, purchased=%d, sold=%d]", getTotalItems(), getStockValue(), getTotalPurchased(), getTotalSold()); }
}