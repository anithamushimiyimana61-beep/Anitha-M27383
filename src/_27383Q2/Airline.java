package _27383Q2;

import java.time.LocalDate;

class Airline extends Entity {
    private final String airlineName;
    private final String airlineCode;
    private final String contactEmail;


    public Airline(int id, LocalDate cd, LocalDate ud, String airlineName, String airlineCode, String contactEmail) {
        super(id, cd, ud);
        if (!airlineCode.matches("[A-Za-z]{2,4}")) throw new IllegalArgumentException("Airline code must be 2-4 letters");
        if (!contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Invalid email");
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }


    @Override
    public String toString() {
        return "Airline[name="+airlineName+", code="+airlineCode+", email="+contactEmail+"]";
    }
}
