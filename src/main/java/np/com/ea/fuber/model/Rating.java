package np.com.ea.fuber.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating {
	
	@Id 
	@GeneratedValue
	private int id;
	//Can have validation
	private int stars;
	
	private String comment;

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Rating(int stars, String comment) {
		super();
		this.stars = stars;
		this.comment = comment;
	}

	public Rating(){
		
	}
	
}
