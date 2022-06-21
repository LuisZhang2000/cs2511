package part3Q1;

import java.time.LocalTime;

public class Flight {

    private LocalTime arrival;
    private LocalTime departure;
    private String name;
    private String seat;

    public Flight(LocalTime arrival, LocalTime departure, String name, String seat) {
        this.arrival = arrival;
        this.departure = departure;
        this.name = name;
        this.seat = seat;
    }

    
    
}