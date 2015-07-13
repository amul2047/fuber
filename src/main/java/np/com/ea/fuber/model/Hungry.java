package np.com.ea.fuber.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hungry {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String contactEmail;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="BILL_STREET")),
		@AttributeOverride(name="city", column=@Column(name="BILL_CITY")),
		@AttributeOverride(name="state", column=@Column(name="BILL_STATE")),
		@AttributeOverride(name="zip", column=@Column(name="BILL_ZIP")),
	})
	private Address billingAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="SHIP_STREET")),
		@AttributeOverride(name="city", column=@Column(name="SHIP_CITY")),
		@AttributeOverride(name="state", column=@Column(name="SHIP_STATE")),
		@AttributeOverride(name="zip", column=@Column(name="SHIP_ZIP")),
	})	
	private Address shippingAddress;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Hungry(String firstName, String lastName, String contactNumber,
			String contactEmail, Address billingAddress, Address shippingAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}
	
	public Hungry(){
		
	}
}


