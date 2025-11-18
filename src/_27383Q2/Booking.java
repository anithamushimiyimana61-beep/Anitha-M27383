package _27383Q2;

import java.time.LocalDate;

class Booking extends Entity {
    private final LocalDate bookingDate;
    private final String seatNumber;
    private final String travelClass;


    public Booking(int id, LocalDate cd, LocalDate ud, LocalDate bookingDate, String seatNumber, String travelClass) {
        super(id, cd, ud);
        if (!travelClass.matches("(Economy|Business|First)"))
            throw new IllegalArgumentException("Invalid travelClass");
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }


    @Override
    public String toString() {
        return "Booking[seat="+seatNumber+", class="+travelClass+", date="+bookingDate+"]";
    }
}