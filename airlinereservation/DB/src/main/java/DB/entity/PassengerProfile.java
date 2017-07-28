package DB.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Component
public class PassengerProfile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profileId")
    private Integer profileId;

    private String password;

    private String firstName;

    private String lastName;

    private String address;

    private String telNo;

    private String emailId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "passengerProfile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<TicketInfo> ticketInfo;

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

    public List<TicketInfo> getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(List<TicketInfo> ticketInfo) {
        this.ticketInfo = ticketInfo;
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