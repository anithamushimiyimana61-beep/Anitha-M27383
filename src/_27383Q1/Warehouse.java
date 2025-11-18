package _27383Q1;

public class Warehouse {
    private String warehouseName;
    private int capacity;

    // Constructor
    public Warehouse(String warehouseName, int capacity) {
        if (warehouseName == null || warehouseName.isEmpty()) {
            throw new IllegalArgumentException("Warehouse name cannot be empty");
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be >= 0");
        }
        this.warehouseName = warehouseName;
        this.capacity = capacity;
    }

    // Getters
    public String getWarehouseName() {
        return warehouseName;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setter with validation
    public void setWarehouseName(String warehouseName) {
        if (warehouseName == null || warehouseName.isEmpty()) {
            throw new IllegalArgumentException("Warehouse name cannot be empty");
        }
        this.warehouseName = warehouseName;
    }

    public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be >= 0");
        }
        this.capacity = capacity;
    }

    // Optional: display warehouse info
    public void displayInfo() {
        System.out.println("Warehouse: " + warehouseName + ", Capacity: " + capacity);
    }
}

