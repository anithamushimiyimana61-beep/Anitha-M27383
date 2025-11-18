package _27383.Q3Tax;
public class Taxpayer extends TaxCategory {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) throws TaxDataException {
        super(id, authorityName, region, email, categoryName, rate, code);
        if (tin == null || !tin.matches("\\d{9}")) throw new TaxDataException("TIN must be 9 digits");
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    // Getters and setters...


    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public void setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



