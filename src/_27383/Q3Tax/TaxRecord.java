package _27383.Q3Tax;
public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(/* args */) {
        super(/* args */);
        this.receiptNo = "R" + System.currentTimeMillis();
        this.totalTax = super.computeTax(/* rate, credits */);
    }
}
