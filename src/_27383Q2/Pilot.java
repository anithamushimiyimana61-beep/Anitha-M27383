package _27383Q2;

import java.time.LocalDate;


class Pilot extends Entity {
    private final String pilotName;
    private final String licenseNumber;
    private final int experienceYears;


    public Pilot(int id, LocalDate cd, LocalDate ud, String pilotName, String licenseNumber, int experienceYears) {
        super(id, cd, ud);
        if (experienceYears < 2) throw new IllegalArgumentException("Pilot must have >= 2 years experience");
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }


    @Override
    public String toString() {
        return "Pilot[name="+pilotName+", license="+licenseNumber+", exp="+experienceYears+"]";
    }
}
