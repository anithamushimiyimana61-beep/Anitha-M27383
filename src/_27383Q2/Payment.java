package _27383Q2;

import java.time.LocalDate;

class Payment extends Entity {
    private final LocalDate paymentDate;
    private final String paymentMethod;
    private final double amountPaid;


    public Payment(int id, LocalDate cd, LocalDate ud, LocalDate paymentDate, String paymentMethod, double amountPaid) {
        super(id, cd, ud);
        if (amountPaid <= 0) throw new IllegalArgumentException("amountPaid must be > 0");
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }


    public double getAmountPaid() { return amountPaid; }


    @Override
    public String toString() {
        return "Payment[method="+paymentMethod+", amount="+amountPaid+"]";
    }
}