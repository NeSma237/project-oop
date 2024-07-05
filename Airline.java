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
public class Airline {

    private String AirlineCode;
    private String AirlineName;
    private flight[] flight;

    public Airline() {
    }

    public Airline(String AirlineCode, String AirlineName, flight[] flight) {
        this.AirlineCode = AirlineCode;
        this.AirlineName = AirlineName;
        this.flight = flight;
    }

    public String getAirlineCode() {
        return AirlineCode;
    }

    public void setAirlineCode(String AirlineCode) {
        this.AirlineCode = AirlineCode;
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }

    public flight[] getFlight() {
        return flight;
    }

    public void setFlight(flight[] flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Airline{" + "AirlineCode=" + AirlineCode + ", AirlineName=" + AirlineName + ", flight=" + flight + '}';
    }

}
