package travelservice;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private String firstName;
    private String surName;
    private String email;
    private List<Bookings> bookings;

    public Client(String id, String firstName, String surName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        bookings = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Bookings> getBookings() {
        return bookings;
    }

    public void setBookings(List<Bookings> bookings) {
        this.bookings = bookings;
    }

    public void addBookings(Bookings booking) {
        bookings.add(booking);
    }
}
