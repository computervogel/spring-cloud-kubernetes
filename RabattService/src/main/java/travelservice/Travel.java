package travelservice;

import java.time.LocalDate;

public class Travel {
    private String id;
    private String destination;
    private String description;
    private double price;
    private LocalDate date;

    public Travel(String id, String destination, String description, double price, LocalDate date) {
        this.id = id;
        this.destination = destination;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}