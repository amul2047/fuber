package np.com.ea.fuber.dao;

import java.util.List;

import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.util.GenericDao;


public interface FoodDao extends GenericDao<Food> {

	List<Food> getFoodByFeederId(int feederId);

}	
