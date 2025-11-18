package _27383Q2;

import java.time.LocalDate;

class Passenger extends Entity {
    private final String passengerName;
    private final int age;
    private final String gender;
    private final String contact;


    public Passenger(int id, LocalDate cd, LocalDate ud, String passengerName, int age, String gender, String contact) {
        super(id, cd, ud);
        if (age <= 0) throw new IllegalArgumentException("age must be > 0");
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Passenger[name="+passengerName+", age="+age+", gender="+gender+"]";
    }
}