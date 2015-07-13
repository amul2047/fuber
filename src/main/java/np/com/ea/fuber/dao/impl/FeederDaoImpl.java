package np.com.ea.fuber.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.FeederDao;
import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.util.GenericDaoImpl;
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class FeederDaoImpl extends GenericDaoImpl<Feeder>  implements FeederDao {

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Feeder find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

