package _27383.Q3Tax;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String authorityName, String region, String email, String categoryName, double rate, String code) throws TaxDataException {
        super(id, authorityName, region, email);
        if (rate <= 0) throw new _27383.Q3Tax ("Rate must be > 0");
        if (code == null || code.length() < 3) throw new _27383.Q3Tax("Code must be at least 3 characters");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    // Getters and setters
    public double getRate() { return rate; }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}


