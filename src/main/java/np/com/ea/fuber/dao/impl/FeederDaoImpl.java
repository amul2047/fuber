package np.com.ea.fuber.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.FeederDao;
import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.util.GenericDaoImpl;
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class FeederDaoImpl extends GenericDaoImpl<Feeder>  implements FeederDao {


@Autowired
private SessionFactory session;

	@Override
	public void add(Feeder feeder) {
		session.getCurrentSession().save(feeder);
		
	}

}

