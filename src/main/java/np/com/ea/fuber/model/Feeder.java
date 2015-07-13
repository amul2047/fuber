package np.com.ea.fuber.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Feeder {
	@Id
	@GeneratedValue
	private int id;
	private String businessName;
	private String contactFirstName;
	private String contactLastName;
	private String contactNumber;
	private String contactEmail;
	@Embedded
	private Address address;


	//Current schedule is a list of timings 
	private String schedule;
	@OneToMany(mappedBy ="feeder", cascade =CascadeType.ALL)
	List<Food> foodList = new ArrayList<Food>();
	
	public Feeder(){

	}
	
	@OneToMany ( cascade =CascadeType.ALL)
	@JoinColumn(name="feederId")
	List<Rating> ratings = new ArrayList<Rating>();
	
	public Feeder(String contactFirstName, String contactLastName,
			String contactNumber, String contactEmail, Address address, String schedule) {
		super();
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
		this.address = address;
		this.schedule = schedule;
	}

	public void addFood(Food f){
		f.setFeeder(this);
		foodList.add(f);
	}
	
	public void removeFood(Food f){
		this.foodList.remove(f);
		f.setFeeder(null);
	}

	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
}
