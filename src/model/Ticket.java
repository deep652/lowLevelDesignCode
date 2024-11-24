package model;

import java.time.LocalTime;

public class Ticket {
    private Attendant attendant;
    private int id;
    private LocalTime startTime;
    private String vechileId;
    private ParkingSpot spot;
    private Gate gate;
}
