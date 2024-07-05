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
public class tickets {

    private String ticketNo;
    private passenger passenger;
    private flight Flight;
    private String classZone;

    public tickets(String ticketNo, passenger passenger, flight Flight, String classZone) {
        this.ticketNo = ticketNo;
        this.passenger = passenger;
        this.Flight = Flight;
        this.classZone = classZone;
    }

    public tickets() {
        classZone = "economic";
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(passenger passenger) {
        this.passenger = passenger;
    }

    public flight getFlight() {
        return Flight;
    }

    public void setFlight(flight Flight) {
        this.Flight = Flight;
    }

    public String getClassZone() {
        return classZone;
    }

    public void setClassZone(String classZone) {
        this.classZone = classZone;
    }

    @Override
    public String toString() {
        return "tickets{" + "ticketNo=" + ticketNo + ", passenger=" + passenger + ", Flight=" + Flight + ", classZone=" + classZone + '}';
    }

}
