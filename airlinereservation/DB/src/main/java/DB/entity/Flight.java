package DB.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "flight")
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flightId;
    private Integer airlineId;
    private String airlineName;
    private String fromLocation;
    private String toLocation;
    private String departureTime;
    private String arrivalTime;
    private String duration;
    private Integer totalSeats;
    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<FlightDetails> flightDetails = new HashSet<FlightDetails>();

    public Flight() {
        super();
    }


    public Flight(Integer airlineId, String airlineName, String fromLocation, String toLocation, String departureTime, String arrivalTime, String duration, Integer totalSeats) {
        this.airlineId = airlineId;
        this.airlineName = airlineName;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.totalSeats = totalSeats;
    }

    public void setFlightDetails(Set<FlightDetails> flightDetails) {
        this.flightDetails = flightDetails;
    }


    public Set<FlightDetails> getFlightDetails() {
        return flightDetails;
    }

    public Integer getAirlineId() {
        return airlineId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        duration = duration;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", airlineId=" + airlineId +
                ", airlineName='" + airlineName + '\'' +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", duration='" + duration + '\'' +
                ", totalSeats=" + totalSeats +
                ", flightDetails=" + flightDetails +
                '}';
    }
}
