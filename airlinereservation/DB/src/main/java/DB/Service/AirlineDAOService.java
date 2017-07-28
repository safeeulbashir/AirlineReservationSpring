package DB.Service;

import DB.DAO.AirlineReservationDAO;
import DB.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by shara on 7/24/2017.
 */
@Component
public class AirlineDAOService {
@Autowired
AirlineReservationDAO airlineReservationDAO;
    public void addFlightDetails(Flight flightDetails) {

        airlineReservationDAO.addFlightDetails(flightDetails);
    }

    public Flight searchReservationByFlightId(Integer flightId) {
        Flight flight=airlineReservationDAO.searchReservationByFlightId(flightId);
        return flight;

    }


}
