package DB.DAO;

import DB.entity.Flight;
import DB.entity.FlightDetails;
import DB.entity.PassengerProfile;
import DB.entity.TicketInfo;

import java.sql.Date;

/**
 * Created by shara on 7/10/2017.
 */
//Change everyththing to wrapper class objects

public interface AirlineReservationDAO {
    void addFlightDetails(Flight flightDetails);

    void testFlightDetails();
    Integer updateFlightDetails(FlightDetails flightDetails);

    Flight searchReservationByFlightId(Integer flightId);

    void createPassengerProfile(PassengerProfile passengerProfile);

    Integer updatePassengerProfile(PassengerProfile passengerProfile);

    Flight searchFlight(String fromLocation, String toLocation, Date date);

    TicketInfo searchReservation(Integer ticketId);

    String cancelReservation(Integer ticketId);

    Integer createReservation(TicketInfo ticketInfo);
}
