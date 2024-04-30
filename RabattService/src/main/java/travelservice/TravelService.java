package travelservice;

import java.util.List;

public interface TravelService {
    List<Client> getAllClients();
    Client getClientById(String id);
    Client createClient(Client client);
    Client updateClient(String id, Client client);
    void deleteClient(String id);

    List<Travel> getAllTravels();
    Travel getTravelById(String id);
    Travel createTravel(Travel travel);
    Travel updateTravel(String id, Travel travel);
    void deleteTravel(String id);

    List<Bookings> getAllBookings();
    Bookings getBookingById(String id);
    Bookings createBooking(Bookings booking);
    Bookings updateBooking(String id, Bookings booking);
    void deleteBooking(String id);
}
