package _27383.Q3Tax;

import java.time.LocalDate;

public class Payment extends TaxAssessment {
    private LocalDate paymentDate;
    private double paymentAmount;

    public Payment(/* args */) throws TaxDataException {
        super(/* args */);
        if (paymentAmount <= 0) throw new TaxDataException("Payment must be positive");
        this.paymentDate = LocalDate.now();
        this.paymentAmount = paymentAmount;
    }

    protected double computeTax() {
        return 0;
    }
}
