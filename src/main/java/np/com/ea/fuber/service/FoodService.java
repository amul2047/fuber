package np.com.ea.fuber.service;

import java.util.List;

import np.com.ea.fuber.model.Food;

public interface FoodService {
	
	void create(Food food);

	public List<Food> getFood();

	public void delete(int id);

	public Food find(int id);

	public Food update(Food food);

	public List<Food> getFoodByFeederId(int feederId);

}


