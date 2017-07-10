package DB.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Component
@Entity
@Table(name="flight")
public class Flight implements Serializable{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer flightId;
	 	
	    private Integer airlineId;
	    private String airlineName;
	    private String fromLocation;
	    private String toLocation;
	    private String departureTime;
	    private String arrivalTime;
	    private String Duration;
	    private Integer totalSeats;
	    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	    @JsonManagedReference
	    private List<FlightDetails> flightDetails;
	    
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
	        return Duration;
	    }

	    public void setDuration(String duration) {
	        Duration = duration;
	    }

	    public Integer getTotalSeats() {
	        return totalSeats;
	    }

	    public void setTotalSeats(Integer totalSeats) {
	        this.totalSeats = totalSeats;
	    }

		public List<FlightDetails> getFlightDetails() {
			return flightDetails;
		}

		public void setFlightDetails(List<FlightDetails> flightDetails) {
			this.flightDetails = flightDetails;
		}

	   
}
