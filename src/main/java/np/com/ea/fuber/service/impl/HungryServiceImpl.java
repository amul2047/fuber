package np.com.ea.fuber.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.HungryDao;
import np.com.ea.fuber.model.Hungry;
import np.com.ea.fuber.service.HungryService;

@Service
@Transactional
public class HungryServiceImpl implements HungryService {

	@Autowired
	private HungryDao hungryDao;

	@Override
	public void create(Hungry hungry) {
		hungryDao.create(hungry);	
	}

	@Override
	public List<Hungry> getHungry() {
		return hungryDao.getList();
	}

	@Override
	public void delete(int id) {
		hungryDao.delete(id);	
	}

	@Override
	public Hungry find(int id) {
		return hungryDao.find(id);
	}

	@Override
	public Hungry update(Hungry hungry) {
		return hungryDao.update(hungry);
	}

}
