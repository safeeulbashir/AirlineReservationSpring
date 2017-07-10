package DB.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Component
public class CreditCardDetails implements Serializable {

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "passengerProfile"))
	@Id
	@GeneratedValue(generator = "generator")
	private Integer profileId;
	 
	private Integer cardNumber;
	
	private String cardType;
	
	private String expirationMonth;

	private Integer expirationYear;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private PassengerProfile passengerProfile;	
	
	public CreditCardDetails() {
		super();
	}

	public CreditCardDetails(Integer cardNumber, String cardType, String expirationMonth,
			Integer expirationYear) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}



	@JsonIgnore
	public PassengerProfile getPassengerProfile() {
		return passengerProfile;
	}

	public void setPassengerProfile(PassengerProfile passengerProfile) {
		this.passengerProfile = passengerProfile;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public Integer getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}
	
	@Override
	public String toString() {
		return "CreditCardDetails [profileId=" + profileId + ", cardNumber=" + cardNumber + ", cardType=" + cardType
				+ ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear + ", getProfileId()="
				+ getProfileId() + ", getCardNumber()=" + getCardNumber() + ", getCardType()=" + getCardType()
				+ ", getExpirationMonth()=" + getExpirationMonth() + ", getExpirationYear()=" + getExpirationYear()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}