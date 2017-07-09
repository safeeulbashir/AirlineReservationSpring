package DB.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity // This tells Hibernate to make a table out of this class
@Component
@Table(name="passengerprofile")
public class PassengerProfile implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)   
    private Integer profileId;
   
    private String password;
  
    private String firstName;

    private String lastName;    
    
    private String address;    

    private String telNo;
      
    private String emailId;
    
    /*@OneToMany(mappedBy = "passengerProfile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<TicketInfo> ticketInfo;*/

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "passengerProfile", cascade = CascadeType.ALL)
	private CreditCardDetails creditCardDetails;
       
    public PassengerProfile() {
		super();
	}

	public PassengerProfile(String password, String firstName, String lastName, String address,
			String telNo, String emailId) {
		super();
	
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telNo = telNo;
		this.emailId = emailId;
	}
    
    public CreditCardDetails getCreditCardDetails() {
		return creditCardDetails;
	}

	public void setCreditCardDetails(CreditCardDetails creditCardDetails) {
		this.creditCardDetails = creditCardDetails;
	}

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}   

	@Override
	public String toString() {
		return "PassengerProfile [profileId=" + profileId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", telNo=" + telNo + ", emailId=" + emailId + ", getProfileId()="
				+ getProfileId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAddress()=" + getAddress() + ", getTelNo()=" + getTelNo() + ", getEmailId()=" + getEmailId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}