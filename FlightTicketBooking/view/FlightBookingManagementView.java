package view;

import repositary.FlightSetup;

import java.util.Scanner;

public class FlightBookingManagementView {

    private ManageAdmin manageAdmin;
    private FlightSetup flightSetup;
    private ManagePassenger managePassenger;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        FlightBookingManagementView flightView = new FlightBookingManagementView();
        flightView.init();
    }
    private void init() {
        flightSetup.flightSetUp();
        byte option = 0;
        while (true) {
            System.out.println("Admin            Press 1");
            System.out.println("Passenger        Press 2");
            System.out.println("Exit             Press 3");
            option = scanner.nextByte();
            if (option == 3) return;
            switch (option) {
                case 1:
                    manageAdmin.adminView();
                    break;
                case 2:
                    managePassenger.passengerView();
            }
        }
    }

    public FlightBookingManagementView() {
        manageAdmin = new ManageAdmin();
        managePassenger = new ManagePassenger();
        flightSetup = new FlightSetup();
    }
}
