package np.com.ea.fuber.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.FoodDao;
import np.com.ea.fuber.dao.UserDao;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.User;
import np.com.ea.fuber.service.FoodService;
import np.com.ea.fuber.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void create(User user) {
		userDao.create(user);
		
	}

	@Override
	public List<User> getUser() {
		return userDao.getList();
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
		
	}

	@Override
	public User find(int id) {
		return userDao.find(id);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

	@Override
	public User getUserIdByUserName(String username) {
		return userDao.getUserIdByUserName(username);
	}

	

	
	
}
