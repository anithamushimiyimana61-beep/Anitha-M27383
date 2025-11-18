package _27383Q2;

import java.time.LocalDate;

public class Flight extends Entity {

    private final String flightNumber;
    private final String origin;
    private final String destination;
    private final double baseFare;

    public Flight(int id, LocalDate createdDate, LocalDate updatedDate,
                  String flightNumber, String origin, String destination, double baseFare) {

        super(id, createdDate, updatedDate);

        if (flightNumber == null || flightNumber.isBlank())
            throw new IllegalArgumentException("Flight number cannot be empty");

        if (origin == null || origin.isBlank())
            throw new IllegalArgumentException("Origin cannot be empty");

        if (destination == null || destination.isBlank())
            throw new IllegalArgumentException("Destination cannot be empty");

        if (baseFare <= 0)
            throw new IllegalArgumentException("Base fare must be positive");

        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getBaseFare() {
        return baseFare;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", baseFare=" + baseFare +
                ", id=" + getId() +
                '}';
    }
}
