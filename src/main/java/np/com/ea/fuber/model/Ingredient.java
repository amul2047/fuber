package np.com.ea.fuber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//NOT USED

//@Entity
//@Table(name = "Ingrediant")
//public class Ingredient {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="ingrediant_id")
//	private int ingrediantId;
//	
//	private String name;
//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	  @JoinColumn(name="foodId")
//	  private Food food;
//	
//	public int getIngrediantId() {
//		return ingrediantId;
//	}
//
//	public void setIngrediantId(int ingrediantId) {
//		this.ingrediantId = ingrediantId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}
