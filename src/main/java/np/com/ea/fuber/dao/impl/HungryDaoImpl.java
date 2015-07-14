package np.com.ea.fuber.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.HungryDao;
import np.com.ea.fuber.model.Hungry;
import np.com.ea.fuber.util.GenericDaoImpl;


@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class HungryDaoImpl extends GenericDaoImpl<Hungry> implements HungryDao {
	
	@Autowired
	private SessionFactory sf;
	


	
}

