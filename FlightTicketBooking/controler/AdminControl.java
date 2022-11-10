package control;

import model.Flight;
import repositary.FlightBookingDatabase;
import view.ManageAdmin;

public class AdminControl {
    private static AdminControl adminControl;
    private FlightBookingDatabase flightBookingDatabase;
    private ManageAdmin manageAdmin;
    public AdminControl(ManageAdmin manageAdmin) {
        this.manageAdmin = manageAdmin;
        flightBookingDatabase = FlightBookingDatabase.getInstance();
    }
    public void setFlight(Flight flight) {
        flightBookingDatabase.setFlightList(flight);
        manageAdmin.alert("Flight SuccessFully Added");
    }
}
