package model;
import java.time.LocalTime;

public class Invoice {
    private Ticket ticketId;
    private Payment payment;
    private Attendant issuedBy;
    private int billAmount;
    private Gate exitGate;
    private LocalTime exitTime;
}
