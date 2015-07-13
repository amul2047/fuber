package np.com.ea.fuber.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.FoodDao;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.util.GenericDaoImpl;
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class FoodDaoImpl extends GenericDaoImpl<Food>  implements FoodDao {

	
	@Autowired
	private SessionFactory sf;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub	
	}

	@Override
	public Food find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getFoodByFeederId(int feederId) {
		Session session = sf.getCurrentSession();
		List<Food> foodList = session.createQuery(
				"from Food as food where food.feeder.id ="
						+ feederId).list();
		return foodList;
	}

}

