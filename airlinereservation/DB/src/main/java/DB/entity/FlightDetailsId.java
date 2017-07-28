package DB.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.sql.Date;

@Embeddable
public class FlightDetailsId implements Serializable {

    private Date flightDepartureDate;

    @ManyToOne
    @JoinColumn(name = "flightId")
    @JsonBackReference
    private Flight flight;


    public FlightDetailsId() {
        super();
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getFlightDepartureDate() {
        return flightDepartureDate;
    }

    public void setFlightDepartureDate(Date flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }

}
