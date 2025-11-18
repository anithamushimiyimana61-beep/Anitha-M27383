package _27383Q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n=== FLIGHT BOOKING SYSTEM (Question 2) ===");


// Create sample data
        Airport ap = new Airport(1, LocalDate.now(), LocalDate.now(), "Kigali International", "KGL", "Kigali");
        Airline al = new Airline(2, LocalDate.now(), LocalDate.now(), "RwandaAir", "RW", "info@rwa.com");
        Flight fl = new Flight(3, LocalDate.now(), LocalDate.now(), "RA202", "Kigali", "Nairobi", 150.0);


// Passenger input
        System.out.print("Passenger name: ");
        String pname;
        pname = sc.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Gender: ");
        String gender = sc.nextLine();
        System.out.print("Contact: ");
        String contact = sc.nextLine();
        Passenger ps = new Passenger(4, LocalDate.now(), LocalDate.now(), pname, age, gender, contact);


// Booking
        Booking bk = new Booking(5, LocalDate.now(), LocalDate.now(), LocalDate.now(), "12A", "Economy");


// Payment
        Payment py = new Payment(6, LocalDate.now(), LocalDate.now(), LocalDate.now(), "Mobile Money", 150);


// Ticket final
        Ticket ticket = new Ticket(7, LocalDate.now(), LocalDate.now(), "TK001", LocalDate.now());
        ticket.setFlight(fl);
        ticket.setBooking(bk);
        ticket.setPayment(py);


        System.out.println("\n--- GENERATED TICKET ---");
        ticket.printTicket();


        System.out.println("\nAll Data Inserted:");
        System.out.println(ap);
        System.out.println(al);
        System.out.println(fl);
        System.out.println(ps);
        System.out.println(bk);
        System.out.println(py);
        System.out.println(ticket);
    }
}
