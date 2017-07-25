package DB.DAO;

import DB.entity.Flight;
import DB.entity.FlightDetails;
import DB.entity.PassengerProfile;
import DB.entity.TicketInfo;

/**
 * Created by shara on 7/10/2017.
 */

public interface AirlineReservationDAO {
    void addFlightDetails(Flight flightDetails);
    int updateFlightDetails(FlightDetails flightDetails);
    Flight searchReservationByFlightId(int flightId);

    void createPassengerProfile(PassengerProfile passengerProfile);
    int updatePassengerProfile(PassengerProfile passengerProfile);
    Flight searchFlight(String fromLocation,String toLocation);
    TicketInfo searchReservation(int ticketId);
    String cancelReservation(int ticketId);
    int createReservation(TicketInfo ticketInfo);
}
