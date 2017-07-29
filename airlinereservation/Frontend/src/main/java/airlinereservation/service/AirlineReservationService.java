package airlinereservation.service;

import DB.DAO.AirlineReservationDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AirlineReservationService {

    @Autowired
    AirlineReservationDAOImpl airlineDAO;
}
