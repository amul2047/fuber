package np.com.ea.fuber.service;

import java.util.List;

import np.com.ea.fuber.model.Feeder;

public interface FeederService {
	
	void create(Feeder feeder);

	public List<Feeder> getFeeder();

	public void delete(int id);

	public Feeder find(int foodId);

	public Feeder update(Feeder feeder);

	public void add(Feeder feeder);

	//public List<UserStory> getUserStoryByProductBacklogId(int productbacklogId);

	//public List<ReleaseBacklog> getReleaseByProductBacklogId(int productbacklogId);
}


