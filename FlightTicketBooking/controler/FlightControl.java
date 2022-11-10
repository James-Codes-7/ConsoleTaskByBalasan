package control;

import model.Flight;
import repositary.FlightBookingDatabase;
import view.ManagePassenger;

import java.util.ArrayList;
import java.util.List;

public class FlightControl {
    private ManagePassenger managePassenger;
    private FlightBookingDatabase flightBookingDatabase;
    public FlightControl(ManagePassenger managePassenger) {
        this.managePassenger = managePassenger;
        flightBookingDatabase = FlightBookingDatabase.getInstance();
    }
    public List<Flight> checkForFlight(String fromPlace, String toPlace) {
        List<Flight> flightList = flightBookingDatabase.getFlightList();
        List<Flight> userNeedFlights = new ArrayList<>();
        byte count = 0;
        for (Flight flight : flightList) {
            ArrayList<String> routesCheck = flight.getFlightRoutes();
            count = 0;
            for (String route : routesCheck) {
                if (route.equals(fromPlace)) {
                    fromPlace = toPlace;
                    count++;
                }
                if (count == 2) {
                    userNeedFlights.add(flight);
                    break;
                }
            }
        }
        return userNeedFlights;
    }
}
