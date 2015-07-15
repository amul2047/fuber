package np.com.ea.fuber.dao;

import java.util.List;
import java.util.Map;

import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.Order;
import np.com.ea.fuber.util.GenericDao;
import np.com.ea.fuber.util.GenericDaoImpl;

public interface OrderDao extends GenericDao<Order> {

	List<Order> getOrdersByFeederId(int feederId);
	Map<String, Object> getOrderAndOrderList(int orderId);
	
}
