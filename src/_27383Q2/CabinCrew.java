package _27383Q2;

import java.time.LocalDate;

class CabinCrew extends Entity {
    private final String crewName;
    private final String role;
    private final String shift;


    public CabinCrew(int id, LocalDate cd, LocalDate ud, String crewName, String role, String shift) {
        super(id, cd, ud);
        if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))
            throw new IllegalArgumentException("Shift must be Day or Night");
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }


    @Override
    public String toString() {
        return "CabinCrew[name="+crewName+", role="+role+", shift="+shift+"]";
    }
}
