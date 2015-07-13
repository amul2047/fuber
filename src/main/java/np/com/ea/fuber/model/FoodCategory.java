package np.com.ea.fuber.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class FoodCategory {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FoodCategory(String name) {
		super();
		this.name = name;
	}
	
	public FoodCategory(){
		super();
	}
	
}
