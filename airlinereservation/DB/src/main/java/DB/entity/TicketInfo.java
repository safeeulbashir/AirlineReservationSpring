package DB.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Component
@Table(name="ticketInfo",uniqueConstraints = { @UniqueConstraint(columnNames = { "ticketId", "profileId" }) })
public class TicketInfo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;

	@ManyToOne
	@JoinColumn(name="profileId")
	@JsonBackReference
	private PassengerProfile passengerProfile;

	private String status;
<<<<<<< HEAD

	@ManyToOne
	@JoinColumns({@JoinColumn(name="flightDepartureDate"),@JoinColumn(name="flightId")})
	private FlightDetails flightDetails;

=======
	
	@ManyToOne
	@JoinColumns({@JoinColumn(name="flightDepartureDate"),@JoinColumn(name="flightId")})
	private FlightDetails flightDetails;
	
>>>>>>> c8a0e5148d4ddf0af401e21230b15bb2552641ac
	public TicketInfo() {
		super();
	}


	public PassengerProfile getPassengerProfile() {
		return passengerProfile;
	}


	public void setPassengerProfile(PassengerProfile passengerProfile) {
		this.passengerProfile = passengerProfile;
	}


	public FlightDetails getFlightDetails() {
		return flightDetails;
	}


	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}


	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}