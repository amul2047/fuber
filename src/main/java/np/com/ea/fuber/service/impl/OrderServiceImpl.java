package np.com.ea.fuber.service.impl;

import java.util.List;
import java.util.Map;

import np.com.ea.fuber.dao.OrderDao;
import np.com.ea.fuber.model.Order;
import np.com.ea.fuber.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void create(Order order) {
		orderDao.create(order);
		
	}

	@Override
	public List<Order> getOrder() {
		// TODO Auto-generated method stub
		return orderDao.getList();
	}

	@Override
	public void delete(int id) {
		orderDao.delete(id);
		
	}

	@Override
	public Order find(int id) {
		// TODO Auto-generated method stub
		return orderDao.find(id);
	}

	@Override
	public Order update(Order order) {
		// TODO Auto-generated method stub
		return orderDao.update(order);
	}

	@Override
	public List<Order> getOrderByFeederId(int feederId) {
		// TODO Auto-generated method stub
		return orderDao.getOrdersByFeederId(feederId);
	}
	
	public Map<String, Object> getOrderAndOrderList(int orderId){
		return orderDao.getOrderAndOrderList(orderId);
	}

	@Override
	public Object getOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
