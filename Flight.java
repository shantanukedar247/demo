package alm.demo.java;
import java.util.Date;

public class Flight {

    private String airlineCode;
    private int flightNumber;
    private String flightOrigin;
    private String flightDestination;
    private Date departureTime;
    private String flightDesignator;

    public Flight(String airlineCode, int flightNumber, String flightOrigin, String flightDestination, Date departureTime, String flightDesignator) {
        this.airlineCode = airlineCode;
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.departureTime = departureTime;
        this.flightDesignator = flightDesignator;
    }

    public boolean isValid() {
        return true;
    }
    public String getAirlineCode() {
        return airlineCode;
    }
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getFlightOrigin() {
        return flightOrigin;
    }
    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }
    public String getFlightDestination() {
        return flightDestination;
    }
    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }
    public Date getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    public String getFlightDesignator() {
        return flightDesignator;
    }
    public void setFlightDesignator(String flightDesignator) {
        this.flightDesignator = flightDesignator;
    }

}