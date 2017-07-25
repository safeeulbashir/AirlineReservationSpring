package DB.DAO;

import DB.entity.Flight;
import DB.entity.FlightDetails;
import DB.entity.PassengerProfile;
import DB.entity.TicketInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by shara on 7/10/2017.
 */

@Component
public class AirlineReservationDAOImpl implements AirlineReservationDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
   @Override
    public void addFlightDetails(Flight flightDetails) {
        System.out.println("came2");
       Session session = sessionFactory.openSession();
       session.save(flightDetails);
    }

    @Override
    public int updateFlightDetails(FlightDetails flightDetails) {
    return 0;
    }

    @Override
    public Flight searchReservationByFlightId(int flightId) {
        return null;
    }

    @Override
    public void createPassengerProfile(PassengerProfile passengerProfile) {

    }

    @Override
    public int updatePassengerProfile(PassengerProfile passengerProfile) {
        return 0;
    }

    @Override
    public Flight searchFlight(String fromLocation, String toLocation) {
        return null;
    }

    @Override
    public TicketInfo searchReservation(int ticketId) {
        return null;
    }

    @Override
    public String cancelReservation(int ticketId) {
        return null;
    }

    @Override
    public int createReservation(TicketInfo ticketInfo) {
        return 0;
    }


}
