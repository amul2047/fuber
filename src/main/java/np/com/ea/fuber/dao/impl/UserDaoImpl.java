package np.com.ea.fuber.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.UserDao;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.User;
import np.com.ea.fuber.util.GenericDaoImpl;


@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class UserDaoImpl extends GenericDaoImpl<User>  implements UserDao {
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public User getUserIdByUserName(String username) {
		
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from users u where u.userName ="+ username);
		System.out.println(q.toString());
		User us = (User) session.createQuery(
				"from users u where u.userName ='"+ username+"'").uniqueResult();
		return us;
	}




	
}

