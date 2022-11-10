package repositary;

import model.Flight;
import view.FlightBookingManagementView;

import java.util.ArrayList;

public class FlightSetup {

    private FlightBookingManagementView flightView;
    private FlightBookingDatabase flightBookingDatabase;

    public FlightSetup() {
        flightBookingDatabase = FlightBookingDatabase.getInstance();
    }
    public void flightSetUp()
    {
        Flight flight=new Flight();
        flight.setFlightId(1234);
        flight.setFlightName("Air India");
        flight.setFare(500);
        flight.setArraivalTime(10);
        flight.setDepartureTime(2);
        flight.setNoOfSeats((short) 10);
        ArrayList<String> routes=new ArrayList<>();
        routes.add("tuty");
        routes.add("Madurai");
        flight.setFlightRoutes(routes);
        flightBookingDatabase.setFlightList(flight);
    }
}
