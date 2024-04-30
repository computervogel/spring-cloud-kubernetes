package travelservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class TravelController {

    private final TravelService travelService;

    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return travelService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable String id){
        return travelService.getClientById(id);
    }

    @PostMapping("/clients")
    public Client createClient(@RequestBody Client client){
        return travelService.createClient(client);
    }

    @PutMapping("/clients/{id}")
    public Client updateClient(@PathVariable String id, @RequestBody Client client){
        return travelService.updateClient(id, client);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable String id){
        travelService.deleteClient(id);
    }

    @GetMapping("/travels")
    public List<Travel> getAllTravels() {
        return travelService.getAllTravels();
    }

    @GetMapping("/travels/{id}")
    public Travel getTravelById(@PathVariable String id){
        return travelService.getTravelById(id);
    }

    @GetMapping("/travels")
    public Travel createTravel(@RequestBody Travel travel){
        return travelService.createTravel(travel);
    }

    @PutMapping("/travels/{id}")
    public Travel updateTravel(@PathVariable String id, @RequestBody Travel travel){
        return travelService.updateTravel(id, travel);
    }

    @DeleteMapping("/travels/{id}")
    public void deleteTravel(@PathVariable String id){
        travelService.deleteTravel(id);
    }

    @GetMapping("/bookings")
    public List<Bookings> getAllBookings() {
        return travelService.getAllBookings();
    }

    @GetMapping("/bookings/{id}")
    public Bookings getBookingById(@PathVariable String id){
        return travelService.getBookingById(id);
    }

    @PostMapping("/bookings")
    public Bookings createBooking(@RequestBody Bookings booking){
        return travelService.createBooking(booking);
    }

    @PutMapping("/bookings/{id}")
    public Bookings updateBooking(@PathVariable String id, @RequestBody Bookings booking){
        return travelService.updateBooking(id, booking);
    }

    @DeleteMapping("/bookings/{id}")
    public void deleteBooking(@PathVariable String id){
        travelService.deleteBooking(id);
    }
}
