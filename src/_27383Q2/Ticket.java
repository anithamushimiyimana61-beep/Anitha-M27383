package _27383Q2;

import java.time.LocalDate;

class Ticket extends Entity {
    private final String ticketNumber;
    private final LocalDate issueDate;
    private Flight flight;
    private Booking booking;
    private Payment payment;


    public Ticket(int id, LocalDate cd, LocalDate ud, String ticketNumber, LocalDate issueDate) {
        super(id, cd, ud);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }


    public void setFlight(Flight f) { this.flight = f; }
    public void setBooking(Booking b) { this.booking = b; }
    public void setPayment(Payment p) { this.payment = p; }


    // calculateFare = baseFare + taxes – discounts
    public double calculateFare() {
        if (flight == null || payment == null)
            throw new IllegalStateException("Flight and Payment must be set before fare calculation");


        double tax = flight.getBaseFare() * 0.16; // 16% tax
        double discount = booking != null && booking.toString().contains("Business") ? 20 : 0;


        return flight.getBaseFare() + tax - discount;
    }


    public void printTicket() {
        System.out.println("=== TICKET DETAILS ===");
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Flight: " + flight);
        System.out.println("Booking: " + booking);
        System.out.println("Payment: " + payment);
        System.out.printf("Total Fare: %.2f\n", calculateFare());
    }
}