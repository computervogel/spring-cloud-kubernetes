package travelservice;

import java.time.LocalDateTime;

public class Bookings {
    private String bookingId;
    private Client client;
    private Travel travel;
    private LocalDateTime bookingTime;

    public Bookings(String bookingId, Client client, Travel travel, LocalDateTime bookingTime) {
        this.bookingId = bookingId;
        this.client = client;
        this.travel = travel;
        this.bookingTime = bookingTime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}
