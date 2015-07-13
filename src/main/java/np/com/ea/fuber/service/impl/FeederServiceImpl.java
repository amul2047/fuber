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
	
//	@Autowired
//	private UserStoryDao userStoryDao;
//	
//	@Autowired
//	ReleaseBacklogDao releaseBacklogDao;
//	
//
//	public void create(ProductBacklog productBacklog) {
//		productBacklogDao.create(productBacklog);	
//	}
//
//
//	public List<ProductBacklog> getProductBacklog() {	
//		return productBacklogDao.getList();
//	}
//
//
//	public void delete(Long id) {
//		productBacklogDao.delete(id);
//	}
//
//
//	public ProductBacklog find(Long id) {
//		return productBacklogDao.find(id);
//	}
//	
//
//	public ProductBacklog update(ProductBacklog productBacklog) {
//		return productBacklogDao.update(productBacklog);
//	}
//	
//	public List<UserStory> getUserStoryByProductBacklogId(Long productbacklogId)
//	{
//		System.out.println("2");
//		return userStoryDao.getUserStoryByProductBacklogId(productbacklogId);
//	}
//
//
//	public List<ReleaseBacklog> getReleaseByProductBacklogId(
//			Long productbacklogId) {
//		// TODO Auto-generated method stub
//		return releaseBacklogDao.getReleasebyProductBacklogId(productbacklogId);
//	}


	@Override
	public void create(Feeder feeder) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Feeder> getFeeder() {
		
		return feederDao.getList();
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Feeder find(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Feeder update(Feeder feeder) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
