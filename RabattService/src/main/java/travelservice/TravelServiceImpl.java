package travelservice;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class TravelServiceImpl implements TravelService {
    private final List<Client> clients = new ArrayList<>();
    private final List<Travel> travels = new ArrayList<>();
    private final List<Bookings> bookings = new ArrayList<>();


    @Override
    public List<Client> getAllClients() {
        return clients;
    }

    @Override
    public Client getClientById(String id) {
        for(Client client : clients) {
            if(client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public Client createClient(Client client) {
        clients.add(client);
        return client;
    }

    @Override
    public Client updateClient(String id, Client client) {
        for(int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getId().equals(id)){
                clients.set(i, client);
                return client;
            }
        }
        return null;
    }

    @Override
    public void deleteClient(String id) {
        clients.removeIf(client -> client.getId().equals(id));
    }

    @Override
    public List<Travel> getAllTravels() {
        return travels;
    }

    @Override
    public Travel getTravelById(String id) {
        for(Travel travel : travels) {
            if(travel.getId().equals(id)) {
                return travel;
            }
        }
        return null;
    }

    @Override
    public Travel createTravel(Travel travel) {
        travels.add(travel);
        return travel;
    }

    @Override
    public Travel updateTravel(String id, Travel travel) {
        for(int i = 0; i < travels.size(); i++) {
            if(travels.get(i).getId().equals(id)){
                travels.set(i, travel);
                return travel;
            }
        }
        return null;
    }

    @Override
    public void deleteTravel(String id) {
        travels.removeIf(travel -> travel.getId().equals(id));
    }

    @Override
    public List<Bookings> getAllBookings() {
        return bookings;
    }

    @Override
    public Bookings getBookingById(String id) {
        for(Bookings booking : bookings) {
            if(booking.getBookingId().equals(id)) {
                return booking;
            }
        }
        return null;
    }

    @Override
    public Bookings createBooking(Bookings booking) {
        bookings.add(booking);
        return booking;
    }

    @Override
    public Bookings updateBooking(String id, Bookings booking) {
        for(int i = 0; i < bookings.size(); i++) {
            if(bookings.get(i).getBookingId().equals(id)){
                bookings.set(i, booking);
                return booking;
            }
        }
        return null;
    }

    @Override
    public void deleteBooking(String id) {
        bookings.removeIf(booking -> booking.getBookingId().equals(id));
    }
}
