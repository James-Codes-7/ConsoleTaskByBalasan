package model;

import java.util.ArrayList;

public class Flight {

    private int flightId;
    private String flightName;
    private short noOfSeats;
    private long arraivalTime;
    private long departureTime;
    private long fare;

    private ArrayList<String> flightRoutes;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }



    public ArrayList<String> getFlightRoutes() {
        return flightRoutes;
    }

 public void setFlightRoutes(ArrayList<String> routes)
 {
     flightRoutes=routes;
 }

    public long getFare() {
        return fare;
    }

    public void setFare(long fare) {
        this.fare = fare;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public short getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(short noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public long getArraivalTime() {
        return arraivalTime;
    }

    public void setArraivalTime(long arraivalTime) {
        this.arraivalTime = arraivalTime;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }
}
