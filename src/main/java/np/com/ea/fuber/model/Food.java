package np.com.ea.fuber.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="food_id")
	private int id;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name="feederId")
	private Feeder feeder;
	
	private String name;
	
	private String picture;
	
	private double price;
	
	@ElementCollection
	private List<String> ingredients = new ArrayList<String>();
	
	private String allergenInfo;
	
	@ManyToMany	( cascade =CascadeType.ALL)
	@JoinTable(name="FOOD_FOODCATEGORY", 
				joinColumns = {@JoinColumn(name="foodId")},
				inverseJoinColumns = {@JoinColumn (name="foodCategoryId")})
	private Set<FoodCategory> categories = new HashSet<FoodCategory>();

	public Feeder getFeeder() {
		return feeder;
	}

	public void setFeeder(Feeder feeder) {
		this.feeder = feeder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public String getAllergenInfo() {
		return allergenInfo;
	}

	public void setAllergenInfo(String allergenInfo) {
		this.allergenInfo = allergenInfo;
	}

	public Set<FoodCategory> getCategories() {
		return categories;
	}

	public void setCategories(Set<FoodCategory> categories) {
		this.categories = categories;
	}
	
	public void addCategory(FoodCategory cat){
		this.categories.add(cat);
	}
	
	public void removeCategory (FoodCategory cat){
		this.categories.remove(cat);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Food(Feeder feeder, String name, String picture,
			List<String> ingredients, String allergenInfo) {
		super();
		this.feeder = feeder;
		this.name = name;
		this.picture = picture;
		this.ingredients = ingredients;
		this.allergenInfo = allergenInfo;
	}
	
	public Food() 
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
