package part3Q1;

import java.util.ArrayList;

public class Passenger {
    
    private ArrayList<Flight> flightList;

    public Passenger() {
        flightList = new ArrayList<Flight>();
    }

    // adds a flight to the passenger's flight list
    public void addFlight(Flight flight) {
        flightList.add(flight);
    }



}