package DB.Controller;

import DB.Service.AirlineDAOService;
import DB.entity.Flight;
import DB.entity.FlightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shara on 7/24/2017.
 */
@Controller
public class AirlineController {
    @Autowired
    private AirlineDAOService airlineDAOService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity userDetails() {
        //  Flight flight=new Flight(1,"American Airlines","Chicago","Dallas","gfdgd","hgfhtf","rtf",100);
        Flight flight = new Flight(1, "Ame", "Ch", "da", "hjeg", "hegs", "hjdsg", 100);
        FlightDetails flightDetails = new FlightDetails(new java.sql.Date(System.currentTimeMillis()), 123.789, 100, flight);
        flight.getFlightDetails().add(flightDetails);
        airlineDAOService.addFlightDetails(flight);
        airlineDAOService.searchReservationByFlightId(1);
        return new ResponseEntity(HttpStatus.OK);
    }


}
