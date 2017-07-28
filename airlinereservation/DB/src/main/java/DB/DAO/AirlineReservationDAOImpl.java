package DB.DAO;

import DB.entity.Flight;
import DB.entity.FlightDetails;
import DB.entity.PassengerProfile;
import DB.entity.TicketInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

/**
 * Created by shara on 7/10/2017.
 */

@Component
public class AirlineReservationDAOImpl implements AirlineReservationDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void addFlightDetails(Flight flight) {
        Session session = sessionFactory.openSession();
        session.save(flight);
        session.flush();
        session.close();
    }

    @Override
    public Integer updateFlightDetails(FlightDetails flightDetails) {

        return null;
    }

    @Override
    public Flight searchReservationByFlightId(Integer flightId) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(String.format("from DB.entity.Flight where flightId=%d", flightId));
        List list = query.list();
        Flight flight = (Flight) list.get(0);
        System.out.print(flight.toString());
        return (Flight) list.get(0);
    }

    @Override
    public void createPassengerProfile(PassengerProfile passengerProfile) {

    }

    @Override
    public Integer updatePassengerProfile(PassengerProfile passengerProfile) {
        return null;
    }

    @Override
    public Flight searchFlight(String fromLocation, String toLocation, Date date) {
        return null;
    }

    @Override
    public TicketInfo searchReservation(Integer ticketId) {
        return null;
    }

    @Override
    public String cancelReservation(Integer ticketId) {
        return null;
    }

    @Override
    public Integer createReservation(TicketInfo ticketInfo) {
        return null;
    }

}