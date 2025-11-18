package _27383Q2;

import java.time.LocalDate;

public class Airport extends Entity {
    private final String airportName;
    private final String code;
    private final String location;


    public Airport(int id, LocalDate cd, LocalDate ud, String airportName, String code, String location) {
        super(id, cd, ud);
        if (!code.matches("[A-Z]{3}")) throw new IllegalArgumentException("Airport code must be 3 uppercase letters");
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }


    @Override
    public String toString() { return "Airport[name="+airportName+", code="+code+", loc="+location+"]"; }
}