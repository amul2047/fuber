package np.com.ea.fuber.service;

import java.util.List;
import java.util.Map;

import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.Order;

public interface OrderService {
	
	void create(Order order);

	public List<Order> getOrder();

	public void delete(int id);

	public Order find(int id);

	public Order update(Order order);

	public List<Order> getOrderByFeederId(int feederId);

	Object getOrderDetails();
	
	public Map<String, Object> getOrderAndOrderList(int orderId);

	public List<Order> getOrderByHungryId(int hungryId);

	//public List<ReleaseBacklog> getReleaseByProductBacklogId(int productbacklogId);
}