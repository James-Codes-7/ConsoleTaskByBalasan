package control;

import repositary.FlightBookingDatabase;
import model.Ticket;
import view.ManagePassenger;

public class TicketControl {

    public FlightBookingDatabase flightBookingDatabase;
    private ManagePassenger managePassenger;
    private static long PNRNumberGenerate = 10000;

    public TicketControl(ManagePassenger managePassenger) {
        this.managePassenger = managePassenger;
    }
    public TicketControl() {

    }
    public void cancelProcess(long PNRNumber) {
        long totalAmount = flightBookingDatabase.getTicketList().get((int) PNRNumber).getTotalAmount();
        flightBookingDatabase.getTicketList().remove((int) PNRNumber);
        managePassenger.alert("Ticket Cancelled Successfully.Your refund " + totalAmount + " will be processed soon.");

    }

    public void bookTicket(Ticket ticket) {
        ticket.setTicketPNR(PNRNumberGenerate++);
        flightBookingDatabase.setTicketList(ticket);
        managePassenger.alert("Ticket Booked SuccessFully");
    }

    public Ticket getPNRStatus(Long PNR) {
        if (PNR < PNRNumberGenerate || PNR > flightBookingDatabase.getTicketList().size() + PNRNumberGenerate) return null;
        return flightBookingDatabase.getTicketList().get((int) (PNR - PNRNumberGenerate));
    }
}
