package np.com.ea.fuber.service;

import java.util.List;

import np.com.ea.fuber.model.User;

public interface UserService {
	
	void create(User user);

	public List<User> getUser();

	public void delete(int id);

	public User find(int id);

	public User update(User user);
	
	public User getUserIdByUserName(String username);

}


