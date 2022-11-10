package view;

import control.AdminControl;
import model.Flight;

import java.util.Scanner;

public class ManageAdmin {
    private Scanner scanner = new Scanner(System.in);

    private AdminControl adminControl;

    public ManageAdmin() {
        adminControl = new AdminControl(this);
    }
    public void alert(String message) {
        System.out.println(message);
    }
    public void adminView() {
        byte option = 0;
        while (true) {
            System.out.println("Add Flight     Press 1");
            System.out.println("Ticket List    Press 2");
            System.out.println("Exit           Press 3");
            System.out.println("Enter the option");
            option = scanner.nextByte();
            if (option == 3) return;
            switch (option) {
                case 1:
                    addFlight();
                    break;
                case 2:
                default:
                    System.out.println("Enter the correct one");
            }
        }
    }

    private void addFlight() {
        System.out.println("Enter the Flight Id");
        int flightId = scanner.nextInt();
        System.out.println("Enter the flight name");
        String flightName = scanner.next();
        System.out.println("Number of seats");
        short noOfSeats = scanner.nextByte();
        System.out.println("Enter Arraival time");
        long arraivalTime = 0;
        System.out.println("Enter the Departure time");
        long departureTime = 0;
        System.out.println("Enter the ticket fare");
        long fare = scanner.nextLong();
        Flight flight = new Flight();
        flight.setFlightId(flightId);
        flight.setFlightName(flightName);
        flight.setDepartureTime(departureTime);
        flight.setArraivalTime(arraivalTime);
        flight.setFare(fare);
        flight.setNoOfSeats(noOfSeats);
    }

}
