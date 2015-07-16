package np.com.ea.fuber.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.ea.fuber.dao.FeederDao;

import np.com.ea.fuber.model.Feeder;

import np.com.ea.fuber.service.FeederService;


@Service
@Transactional
public class FeederServiceImpl implements FeederService {

	@Autowired
	private FeederDao feederDao;

	public void create(Feeder feeder) {
		feederDao.create(feeder);
		
	}

	@Override
	public List<Feeder> getFeeder() {
		
		return feederDao.getList();
	}


	@Override
	public void delete(int id) {
		feederDao.delete(id);
		
	}


	@Override
	public Feeder find(int id) {
		
		return feederDao.find(id);
	}


	@Override
	public Feeder update(Feeder feeder) {
		return feederDao.update(feeder);
	}

	@Override
	public void add(Feeder feeder) {
		
		feederDao.add(feeder);
		
	}
	
	
}
