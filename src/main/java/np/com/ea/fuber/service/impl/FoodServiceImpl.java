package np.com.ea.fuber.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.FoodDao;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.service.FoodService;


@Service
@Transactional
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodDao foodDao;

	@Override
	public void create(Food food) {
		foodDao.create(food);
		
	}

	@Override
	public List<Food> getFood() {
		return foodDao.getList();
	}

	@Override
	public void delete(int id) {
		foodDao.delete(id);
		
	}

	@Override
	public Food find(int id) {
		return foodDao.find(id);
	}

	@Override
	public Food update(Food food) {
		return foodDao.update(food);
	}
	
	@Override
	public List<Food> getFoodByFeederId(int feederId)
	{
		return foodDao.getFoodByFeederId(feederId);
	}

	
	
}
