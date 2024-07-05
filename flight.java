/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author user
 */
public class flight {

    private String FlightNo;
    private String from;
    private String to;
    private String dateOfFlight;
    private int NoOfPassengers;
    private double priceOfTicket;
    private boolean securityCheck;
    private String gate;
    private String gateLocation;
    private passenger[] passenger;

    public flight(String FlightNo, String from, String to, String dateOfFlight, int NoOfPassengers, double priceOfTicket, boolean securityCheck, String gate, String gateLocation, passenger[] passenger) {
        this.FlightNo = FlightNo;
        this.from = from;
        this.to = to;
        this.dateOfFlight = dateOfFlight;
        this.NoOfPassengers = NoOfPassengers;
        this.priceOfTicket = priceOfTicket;
        this.securityCheck = securityCheck;
        this.gate = gate;
        this.gateLocation = gateLocation;
        this.passenger = passenger;
    }

    public passenger[] getPassenger() {
        return passenger;
    }

    public void setPassenger(passenger[] passenger) {
        this.passenger = passenger;
    }

    public flight() {
    }

    public String getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(String FlightNo) {
        this.FlightNo = FlightNo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public int getNoOfPassengers() {
        return NoOfPassengers;
    }

    public void setNoOfPassengers(int NoOfPassengers) {
        this.NoOfPassengers = NoOfPassengers;
    }

    public double getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(double priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public boolean isSecurityCheck() {
        return securityCheck;
    }

    public void setSecurityCheck(boolean securityCheck) {
        this.securityCheck = securityCheck;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getGateLocation() {
        return gateLocation;
    }

    public void setGateLocation(String gateLocation) {
        this.gateLocation = gateLocation;
    }

    @Override
    public String toString() {
        return "flight{" + "FlightNo=" + FlightNo + ", from=" + from + ", to=" + to + ", dateOfFlight=" + dateOfFlight + ", NoOfPassengers=" + NoOfPassengers + ", priceOfTicket=" + priceOfTicket + ", securityCheck=" + securityCheck + ", gate=" + gate + ", gateLocation=" + gateLocation + '}';
    }

}
