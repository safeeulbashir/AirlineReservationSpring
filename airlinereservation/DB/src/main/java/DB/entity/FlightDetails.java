package DB.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Component
@Table(name="flightDetails",uniqueConstraints = { @UniqueConstraint(columnNames = { "flightId", "flightDepartureDate" }) })
public class FlightDetails implements Serializable{
	
		@Id
		@Column(name="flightDepartureDate")
		private Date flightDepartureDate;
	    private Double price;
	    private Integer availableSeats;
	    
	   @Id
	    @ManyToOne
	    @JoinColumn(name="flightId")
	    @JsonBackReference
	    private Flight flight;
	    
	 
	
	    public FlightDetails() {
			super();
		}


		public Double getPrice() {
	        return price;
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

		public void setFlight(Flight flight) {
			this.flight = flight;
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
