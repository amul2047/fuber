package np.com.ea.fuber.service;

import java.util.List;

import np.com.ea.fuber.model.Hungry;
import np.com.ea.fuber.model.User;

public interface HungryService {
	
	void create(Hungry hungry);

	public List<Hungry> getHungry();

	public void delete(int id);

	public Hungry find(int id);

	public Hungry update(Hungry hungry);


}


