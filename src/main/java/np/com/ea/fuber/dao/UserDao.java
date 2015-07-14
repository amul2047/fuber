package np.com.ea.fuber.dao;

import java.util.List;

import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.User;
import np.com.ea.fuber.util.GenericDao;


public interface UserDao extends GenericDao<User> {

	User getUserIdByUserName(String username);

}	
