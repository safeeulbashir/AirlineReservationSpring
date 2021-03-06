package DB.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Component
@Table(name = "flightDetails", uniqueConstraints = {@UniqueConstraint(columnNames = {"flightId", "flightDepartureDate"})})
public class FlightDetails implements Serializable {

    @Id
    @Column(name = "flightDepartureDate")
    private Date flightDepartureDate;
    private Double price;
    private Integer availableSeats;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "flightId", nullable = false)
    private Flight flight;
    @OneToMany(mappedBy = "flightDetails", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<TicketInfo> ticketInfo;


    public FlightDetails(Date flightDepartureDate, Double price, Integer availableSeats, Flight flight) {
        this.flightDepartureDate = flightDepartureDate;
        this.price = price;
        this.availableSeats = availableSeats;
        this.flight = flight;
    }


    public FlightDetails() {
        super();
    }


    public Date getFlightDepartureDate() {
        return flightDepartureDate;
    }


    public void setFlightDepartureDate(Date flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }


    public Flight getFlight() {
        return flight;
    }

    public FlightDetails(Date flightDepartureDate, Double price, Integer availableSeats) {
        this.flightDepartureDate = flightDepartureDate;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


    public List<TicketInfo> getTicketInfo() {
        return ticketInfo;
    }


    public void setTicketInfo(List<TicketInfo> ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightDepartureDate=" + flightDepartureDate +
                ", price=" + price +
                ", availableSeats=" + availableSeats +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }
}
