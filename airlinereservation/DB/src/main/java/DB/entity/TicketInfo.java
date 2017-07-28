package DB.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

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

	@ManyToOne
	@JoinColumns({@JoinColumn(name="flightDepartureDate"),@JoinColumn(name="flightId")})
	private FlightDetails flightDetails;

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