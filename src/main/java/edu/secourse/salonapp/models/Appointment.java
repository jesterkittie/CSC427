package edu.secourse.salonapp.models;
import java.time.LocalDateTime;

public class Appointment {
    //appointment number assignment
    private static int nextId = 1;

    private int appointmentId;
    private int customerId;
    private int stylistId;
    private LocalDateTime startDateTime;
    private String status; // active or canceled

    //constructor
    public Appointment(int custId, int stylId, LocalDateTime start) {
        appointmentId = nextId++;
        customerId = custId;
        stylistId = stylId;
        startDateTime = start;
        status = "Active";
    }

    // getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getStylistId() {
        return stylistId;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public String getStatus() {
        return status;
    }

    // setters / methods
    public void setStartDateTime(LocalDateTime start) {
        startDateTime = start;
    }

    public void cancelAppointment() {
        status = "Canceled";
    }
}